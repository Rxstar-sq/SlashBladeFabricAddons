import re
import os

java_file = 'src/main/java/cn/mmf/slashblade_addon/init/SBAItems.java'
output_dir = 'src/main/resources/assets/slashblade_fabric_addons/models/item'

if not os.path.exists(output_dir):
    os.makedirs(output_dir)

with open(java_file, 'r', encoding='utf-8') as f:
    content = f.read()

matches = re.findall(r'register\(\"([^\"]+)\"', content)

template = '''{
  "parent": "slashblade:item/slashblade"
}'''

count = 0
for name in matches:
    file_path = os.path.join(output_dir, name + '.json')
    with open(file_path, 'w', encoding='utf-8') as f:
        f.write(template)
    count += 1

print(f"Generated {count} model files.")
