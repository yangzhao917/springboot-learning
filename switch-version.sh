#!/bin/bash

# Spring Boot 版本切换脚本
# 使用方法: ./switch-version.sh [2]

VERSION=$1

if [ -z "$VERSION" ]; then
    echo "使用方法: ./switch-version.sh [2]"
    echo "示例:"
    echo "  ./switch-version.sh 2  # 切换到 Spring Boot 2.x 版本"
    exit 1
fi

case $VERSION in
    2)
        echo "🔄 切换到 Spring Boot 2.x 版本..."
        git checkout v2.x
        echo "✅ 已切换到 v2.x 分支"
        echo "📋 当前分支: $(git branch --show-current)"
        ;;
    *)
        echo "❌ 错误: 不支持的版本 '$VERSION'"
        echo "支持的版本: 2"
        exit 1
        ;;
esac

echo ""
echo "🚀 现在你可以开始开发 Spring Boot $VERSION.x 版本了！"
echo "💡 提示: 使用 'git status' 查看当前状态"