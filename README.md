# Spring Boot Learning

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.1.8-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-8-orange.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

一个Spring Boot学习项目，帮助初学者快速上手Spring Boot开发。

## 📖 项目简介

本项目是一个Spring Boot学习项目，展示了Spring Boot的基本配置和Web开发功能。通过这个项目，你可以学习到：

- Spring Boot项目的基本结构和组织方式
- 如何配置Maven依赖和起步依赖
- 如何创建RESTful API和控制器
- Spring Boot的自动配置机制和约定优于配置
- 配置文件的多种格式（Properties和YAML）
- 环境配置和Profile的使用
- 项目文档的编写和组织

## 🚀 快速开始

### 环境要求

- Java 8 或更高版本
- Maven 3.6 或更高版本

### 安装运行

1. **克隆项目**
   ```bash
   git clone https://github.com/yangzhao917/springboot-learning.git
   cd springboot-learning
   ```

2. **编译项目**
   ```bash
   mvn clean compile
   ```

3. **运行项目**
   ```bash
   mvn spring-boot:run
   ```

4. **访问应用**
   
   打开浏览器访问：http://localhost:8083
   
   你应该能看到 "Hello World!" 的响应。
   
   **注意：** 由于项目配置了YAML格式的配置文件，实际运行端口为8083。

## 📁 项目结构

```
springboot-learning/
├── docs/                           # 📚 详细文档目录
│   ├── 1.first-springboot.md      # 🚀 Spring Boot入门指南
│   ├── 2.springboot-configuration.md  # ⚙️ Spring Boot配置详解
│   └── img/                       # 🖼️ 图片资源
│       ├── springboot-nav.png
│       ├── springboot-dependencies.png
│       ├── depm.png
│       └── springboot-web-dep.png
├── src/
│   ├── main/
│   │   ├── java/org/example/
│   │   │   ├── App.java           # 🚀 主启动类
│   │   │   └── controller/
│   │   │       └── SayController.java  # 🎮 REST控制器
│   │   └── resources/             # 📦 资源文件
│   │       ├── application.properties  # ⚙️ Properties格式配置
│   │       ├── application.yml    # ⚙️ YAML格式配置
│   │       ├── static/            # 🌐 静态资源
│   │       └── templates/         # 📄 模板文件
│   └── test/                      # 🧪 测试代码
├── target/                        # 🏗️ 编译输出目录
├── pom.xml                        # ⚙️ Maven配置文件
└── README.md                      # 📋 项目说明文档
```

## 🔧 技术栈

- **框架**: Spring Boot 2.1.8
- **语言**: Java 8
- **构建工具**: Maven
- **Web服务器**: 内嵌Tomcat

## 📚 核心功能

### 🚀 快速了解
- **主启动类**：`App.java` - Spring Boot应用入口
- **REST控制器**：`SayController.java` - 处理HTTP请求
- **配置文件**：支持Properties和YAML两种格式
- **详细文档**：完整的教程和配置指南

### 📖 深入学习
- **[Spring Boot入门指南](docs/1.first-springboot.md)** - 从零开始学习Spring Boot
- **[Spring Boot配置详解](docs/2.springboot-configuration.md)** - 深入理解配置系统

## ⚙️ 配置说明

### 📋 当前配置状态
- **Properties配置**：`application.properties` (端口8080)
- **YAML配置**：`application.yml` (端口8083) 
- **生效配置**：properties配置优先级更高，实际运行端口为8080

### 📚 详细配置指南
- **[Spring Boot配置详解](docs/2.springboot-configuration.md)** - 配置文件格式、约定优于配置、Profile等

## 🛠️ 开发指南

### 🚀 快速开发
- **添加API端点**：在 `SayController` 中添加新方法
- **修改配置**：编辑 `application.properties` 或 `application.yml`
- **添加依赖**：在 `pom.xml` 中管理项目依赖

### 📚 详细开发教程
- **[Spring Boot入门指南](docs/1.first-springboot.md)** - 控制器创建、注解使用等
- **[Spring Boot配置详解](docs/2.springboot-configuration.md)** - 配置管理、Profile使用等

## 📖 学习资源

### 📚 项目文档
- [🚀 Spring Boot入门指南](docs/1.first-springboot.md) - 从零开始学习Spring Boot
- [⚙️ Spring Boot配置详解](docs/2.springboot-configuration.md) - 深入理解配置系统

### 🌐 官方资源
- [Spring Boot官方文档](https://spring.io/projects/spring-boot)
- [Spring Boot参考指南](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Spring Boot中文文档](https://springdoc.cn/spring-boot.html)

### 🎯 学习路径建议
1. **基础入门**：先阅读 `docs/1.first-springboot.md`
2. **配置深入**：学习 `docs/2.springboot-configuration.md`
3. **实践练习**：修改代码，添加新的API端点
4. **进阶学习**：学习数据库集成、安全认证等

## 🤝 贡献指南

欢迎贡献代码！请遵循以下步骤：

1. Fork 本仓库
2. 创建特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 打开 Pull Request

## 📄 许可证

本项目采用 MIT 许可证 - 查看 [LICENSE](LICENSE) 文件了解详情。

## 👨‍💻 作者

**yangzhao**

- GitHub: [@yangzhao917](https://github.com/yangzhao917)

## 🙏 致谢

- 感谢 [Spring Boot](https://spring.io/projects/spring-boot) 团队提供的优秀框架
- 感谢所有为开源社区做出贡献的开发者们

## 📞 联系方式

如有问题或建议，请通过以下方式联系：

- 提交 [Issue](https://github.com/yangzhao917/springboot-learning/issues)
- 发送邮件至：your-email@example.com

---

⭐ 如果这个项目对你有帮助，请给它一个星标！
