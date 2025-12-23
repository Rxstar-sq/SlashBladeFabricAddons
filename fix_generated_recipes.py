#!/usr/bin/env python3
"""
Fix generated recipe JSON files to use Fabric ingredient schema.
Converts old-style {"item": "x"} blade ingredients to 
new-style {"fabric:type": "slashblade:blade", "items": "x", "request": {...}}

Key principle:
- items should point to the SPECIFIC blade's item ID (don't change this!)
- fabric:type should be "slashblade:blade"
- request fields should be preserved as-is
"""

import json
import os
from pathlib import Path

recipe_dir = Path("src/main/generated/data/slashblade_fabric_addons/recipe")

def fix_recipe(file_path: Path):
    """Fix a single recipe file."""
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            data = json.load(f)
        
        # Only process slashblade:shaped_blade recipes
        if data.get("type") != "slashblade:shaped_blade":
            return False
        
        modified = False
        key = data.get("key", {})
        
        # Look for blade ingredients that need conversion
        for key_name, ingredient in key.items():
            if not isinstance(ingredient, dict):
                continue
            
            # Old-style with direct "item" reference needs conversion
            if "item" in ingredient and "fabric:type" not in ingredient:
                item_val = ingredient.get("item", "")
                if item_val.startswith("slashblade"):
                    # Convert to Fabric ingredient schema
                    # KEEP the item ID as-is, just change the format!
                    new_ingredient = {
                        "fabric:type": "slashblade:blade",
                        "items": item_val  # ← Keep the original item ID
                    }
                    
                    # Preserve any existing request field
                    if "request" in ingredient:
                        new_ingredient["request"] = ingredient["request"]
                    
                    key[key_name] = new_ingredient
                    modified = True
        
        if modified:
            with open(file_path, 'w', encoding='utf-8') as f:
                json.dump(data, f, ensure_ascii=False, indent=2)
            print(f"✓ Fixed: {file_path.name}")
            return True
    
    except Exception as e:
        print(f"✗ Error processing {file_path.name}: {e}")
        return False
    
    return False

def main():
    if not recipe_dir.exists():
        print(f"Recipe directory not found: {recipe_dir}")
        return
    
    print(f"Scanning recipes in {recipe_dir}...")
    
    count = 0
    for recipe_file in recipe_dir.glob("**/*.json"):
        if fix_recipe(recipe_file):
            count += 1
    
    print(f"\nFixed {count} recipe files.")

if __name__ == "__main__":
    main()
