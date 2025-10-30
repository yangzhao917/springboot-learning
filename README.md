# Spring Boot Learning

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.1.8-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-8-orange.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

一个Spring Boot学习项目，帮助初学者快速上手Spring Boot开发。

## 📖 项目简介

本项目是一个Spring Boot学习项目，展示了Spring Boot的核心功能和常用框架整合。通过这个项目，你可以学习到：

- Spring Boot项目的基本结构和组织方式
- 如何配置Maven依赖和起步依赖
- 如何创建RESTful API和控制器
- Spring Boot的自动配置机制和约定优于配置
- 配置文件的多种格式（Properties和YAML）
- 环境配置和Profile的使用
- **JUnit单元测试和集成测试**
- **MyBatis持久层框架整合（XML和注解两种方式）**
- **Redis缓存框架整合**
- 项目文档的编写和组织

## 🚀 快速开始

### 环境要求

- Java 8 或更高版本
- Maven 3.6 或更高版本
- MySQL 5.7+ 或 MySQL 8.0+（用于MyBatis示例）
- Redis 5.0+（用于Redis示例，可选）

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

3. **初始化数据库**（可选，用于MyBatis示例）
   ```bash
   # 导入SQL脚本创建数据库和表
   mysql -u root -p < sql/springboot_learning.sql
   ```
   
   或者手动执行 `sql/springboot_learning.sql` 文件中的SQL语句。

4. **配置数据源**（可选，用于MyBatis示例）
   
   编辑 `src/main/resources/application-dev.yml`，修改数据库连接信息：
   ```yaml
   spring:
     datasource:
       username: root
       password: your_password
       url: jdbc:mysql://127.0.0.1:3306/springboot_learning
   ```

5. **运行项目**
   ```bash
   mvn spring-boot:run
   ```

6. **访问应用**
   
   打开浏览器访问：http://localhost:80
   
   你应该能看到 "Hello World!" 的响应。
   
   **注意：** 
   - 项目配置了Properties和YAML两种格式的配置文件
   - 开发环境(dev)默认端口为80
   - 如需使用MyBatis功能，请确保MySQL已启动并已导入SQL脚本
   - 如需使用Redis功能，请确保Redis已启动

## 📁 项目结构

```
springboot-learning/
├── docs/                           # 📚 详细文档目录
│   ├── 1.first-springboot.md      # 🚀 Spring Boot入门指南
│   ├── 2.springboot-configuration.md  # ⚙️ Spring Boot配置详解
│   ├── 3.springboot-Integration.md    # 🔗 Spring Boot整合（JUnit、MyBatis、Redis）
│   └── img/                       # 🖼️ 图片资源
│       ├── springboot-nav.png
│       ├── springboot-dependencies.png
│       ├── depm.png
│       └── springboot-web-dep.png
├── sql/                           # 🗄️ SQL脚本目录
│   └── springboot_learning.sql    # 📝 数据库初始化脚本
├── src/
│   ├── main/
│   │   ├── java/org/example/
│   │   │   ├── App.java           # 🚀 主启动类
│   │   │   ├── config/            # ⚙️ 配置类
│   │   │   │   └── AppConfig.java
│   │   │   ├── controller/        # 🎮 控制器
│   │   │   │   ├── SayController.java
│   │   │   │   └── ConfigController.java
│   │   │   ├── entity/            # 📦 实体类
│   │   │   │   └── User.java
│   │   │   ├── mapper/            # 🗺️ Mapper接口
│   │   │   │   └── UserMapper.java
│   │   │   └── service/           # 💼 服务层
│   │   │       ├── UserServiceImpl.java
│   │   │       └── RedisServiceImpl.java
│   │   └── resources/             # 📦 资源文件
│   │       ├── application.properties  # ⚙️ Properties格式配置
│   │       ├── application-dev.yml     # ⚙️ 开发环境配置
│   │       ├── application-test.yml    # ⚙️ 测试环境配置
│   │       ├── application-prod.yml    # ⚙️ 生产环境配置
│   │       ├── mapper/            # 🗺️ MyBatis映射文件
│   │       │   └── UserMapper.xml
│   │       ├── static/            # 🌐 静态资源
│   │       └── templates/         # 📄 模板文件
│   └── test/                      # 🧪 测试代码
│       └── java/org/example/
│           ├── mapper/
│           │   └── UserMapperTest.java
│           └── service/
│               ├── UserServiceImplTest.java
│               └── RedisServiceImplTest.java
├── target/                        # 🏗️ 编译输出目录
├── pom.xml                        # ⚙️ Maven配置文件
└── README.md                      # 📋 项目说明文档
```

## 🔧 技术栈

- **框架**: Spring Boot 2.1.8
- **语言**: Java 8
- **构建工具**: Maven
- **Web服务器**: 内嵌Tomcat
- **持久层**: MyBatis 2.1.0
- **数据库**: MySQL 5.7+ / 8.0+
- **缓存**: Redis 5.0+
- **测试框架**: JUnit 4

## 📚 核心功能

### 🚀 快速了解
- **主启动类**：`App.java` - Spring Boot应用入口
- **REST控制器**：`SayController.java`、`ConfigController.java` - 处理HTTP请求
- **配置文件**：支持Properties和YAML两种格式，支持多环境配置
- **实体类**：`User.java` - 示例实体类
- **持久层**：`UserMapper.java` - MyBatis Mapper接口示例
- **服务层**：`UserServiceImpl.java`、`RedisServiceImpl.java` - 业务逻辑示例
- **测试代码**：完整的单元测试和集成测试示例
- **详细文档**：完整的教程和配置指南

### 📖 深入学习
- **[Spring Boot入门指南](docs/1.first-springboot.md)** - 从零开始学习Spring Boot
- **[Spring Boot配置详解](docs/2.springboot-configuration.md)** - 深入理解配置系统
- **[Spring Boot整合指南](docs/3.springboot-Integration.md)** - JUnit测试、MyBatis、Redis整合

## ⚙️ 配置说明

### 📋 当前配置状态
- **Properties配置**：`application.properties` (端口8080)
- **YAML配置**：支持多环境配置（dev/test/prod）
- **开发环境**：`application-dev.yml` (端口80)
- **数据源配置**：MySQL数据源和MyBatis配置
- **Redis配置**：Redis连接配置（开发环境）

### 🧭 配置文件结构（结构化速览）
- 核心配置文件（按优先级从低到高覆盖）：
  - `src/main/resources/application.properties`
  - `src/main/resources/application-<profile>.yml`（如：dev/test/prod）
- 环境切换（选择一个）：
  - 启动参数：`--spring.profiles.active=dev`
  - OS 环境变量：`SPRING_PROFILES_ACTIVE=dev`
  - 配置文件：`spring.profiles.active=dev`
- 常用端口配置：
  - `application.properties`：`server.port=8080`
  - `application-dev.yml`：示例使用 `80`（开发演示）
- MyBatis 相关：
  - `src/main/resources/mapper/*.xml`
  - `UserMapper.java` 对应 `UserMapper.xml`
- Redis 相关：
  - 激活 Redis 依赖后，通过 `RedisServiceImpl`/`RedisTemplate` 使用

### 🌐 切换内置 Web 服务器（可选）
- 默认：内置 Tomcat
- 切换到 Jetty：在 `spring-boot-starter-web` 中排除 Tomcat，并添加 `spring-boot-starter-jetty`
- 切换到 Undertow：在 `spring-boot-starter-web` 中排除 Tomcat，并添加 `spring-boot-starter-undertow`
- 详细步骤见：`docs/4.springboot-autoconfigure.md` 的“4.3 切换内置Web服务器”

### 📚 详细配置指南
- **[Spring Boot配置详解](docs/2.springboot-configuration.md)** - 配置文件格式、约定优于配置、Profile等
- **[Spring Boot整合指南](docs/3.springboot-Integration.md)** - MyBatis、Redis配置说明
- **[Spring Boot自动配置与扩展](docs/4.springboot-autoconfigure.md)** - 条件装配、@Enable/@Import、自定义Starter、切换内置服务器

## 🛠️ 开发指南

### 🚀 快速开发
- **添加API端点**：在 `SayController` 中添加新方法
- **修改配置**：编辑 `application.properties` 或环境对应的 `application-*.yml`
- **添加依赖**：在 `pom.xml` 中管理项目依赖
- **数据库操作**：创建Mapper接口和对应的XML映射文件
- **编写测试**：创建测试类验证功能

### 📚 详细开发教程
- **[Spring Boot入门指南](docs/1.first-springboot.md)** - 控制器创建、注解使用等
- **[Spring Boot配置详解](docs/2.springboot-configuration.md)** - 配置管理、Profile使用等
- **[Spring Boot整合指南](docs/3.springboot-Integration.md)** - MyBatis、Redis、JUnit整合详解

## 📖 学习资源

### 📚 项目文档
- [🚀 Spring Boot入门指南](docs/1.first-springboot.md) - 从零开始学习Spring Boot
- [⚙️ Spring Boot配置详解](docs/2.springboot-configuration.md) - 深入理解配置系统
- [🔗 Spring Boot整合指南](docs/3.springboot-Integration.md) - JUnit测试、MyBatis、Redis整合

### 🌐 官方资源
- [Spring Boot官方文档](https://spring.io/projects/spring-boot)
- [Spring Boot参考指南](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Spring Boot中文文档](https://springdoc.cn/spring-boot.html)
- [MyBatis官方文档](https://mybatis.org/mybatis-3/zh/index.html)
- [Redis官方文档](https://redis.io/documentation)

### 🎯 学习路径建议
1. **基础入门**：阅读 `docs/1.first-springboot.md`，了解Spring Boot基本概念
2. **配置深入**：学习 `docs/2.springboot-configuration.md`，掌握配置系统
3. **实践练习**：修改代码，添加新的API端点
4. **框架整合**：学习 `docs/3.springboot-Integration.md`，掌握JUnit、MyBatis、Redis整合
5. **进阶学习**：学习安全认证、消息队列、微服务等高级特性

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
- 发送邮件至：yz0917@foxmail.com

---

⭐ 如果这个项目对你有帮助，请给它一个星标！
