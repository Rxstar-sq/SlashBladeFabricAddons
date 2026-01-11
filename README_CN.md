# SlashBlade Fabric RE Addons

SlashBlade Refabricated 的附属模组，包含 yakumoblade 等刀剑内容。

## 构建说明

### 方式一：使用本地 SlashBlade-Refabricated（推荐开发）

如果你有 SlashBlade-Refabricated 的源码：

1. 克隆本项目和 SlashBlade-Refabricated 到同一目录
   ```
   parent/
   ├── SlashBlade-Refabricated/
   └── SlashBladeFabricAddons/
   ```

2. 先构建 SlashBlade-Refabricated
   ```bash
   cd SlashBlade-Refabricated
   ./gradlew build
   ```

3. 构建本项目
   ```bash
   cd ../SlashBladeFabricAddons
   ./gradlew build
   ```

构建脚本会自动检测并使用本地编译的 SlashBlade JAR（最新版本，避免API不兼容）。

### 方式二：使用远程依赖（用户使用）

如果没有 SlashBlade-Refabricated 源码，构建脚本会自动从 maven 仓库下载依赖版本。

```bash
cd SlashBladeFabricAddons
./gradlew build
```

**注意：** 远程版本可能较旧，如果遇到 `NoSuchMethodError` 等API不兼容问题，请使用方式一。

## 运行时依赖

游戏中运行需要安装：
- SlashBlade Refabricated 1.21.1-1.3.2+
- Porting-Lib 3.1.0-beta.79-fix+1.21.1-fix
- Forge Config API Port 21.1.3+
- Cardinal Components API 6.1.2+

## 版本说明

- **开发版本使用：** SlashBlade Refabricated 1.3.2-Resharped-1.8.61（本地编译）
- **发布版本依赖：** SlashBlade Refabricated 1.1.5-Resharped-1.8.60（maven远程）

如果游戏崩溃显示 `NoSuchMethodError: ISlashBladeState.getSpecialEffects()`，说明运行时的 SlashBlade 版本与编译时不一致，请确保使用匹配的版本。

## 已知问题

1. ~~`sword_type` 格式错误~~ ✅ 已修复：应使用 `"bewitched"` 而非 `"slashblade:bewitched"`
2. ~~API不兼容问题~~ ✅ 已修复：使用本地最新版本编译

## 开发说明

本项目包含从原版 yakumoblade 移植的内容，因无法使用 datagen，所有数据文件均为手写。

主要内容：
- yakumoblade 系列刀剑（17把）
- ciallo 刀剑
- 对应的合成配方、语言文件、模型
