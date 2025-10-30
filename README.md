# Spring Boot Learning

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.1.8-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-8-orange.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

面向初学者的 Spring Boot 学习项目，涵盖“入门、配置、整合、自动配置扩展”。

## 📖 简介

学习目标：用最少的时间跑通一个 Spring Boot 项目，理解配置与常用整合，并能按需扩展自动配置。

## 🚀 快速开始

### 环境要求
- Java 8+
- Maven 3.6+
- 可选：MySQL（MyBatis 示例）、Redis（缓存示例）

### 启动
```bash
git clone https://github.com/yangzhao917/springboot-learning.git
cd springboot-learning
mvn spring-boot:run
```

可选：导入 `sql/springboot_learning.sql`，在 `application-dev.yml` 中配置数据源后体验 MyBatis 示例。

## 📁 项目结构（简）

```
springboot-learning/
├── docs/                           # 📚 详细文档目录
│   ├── 1.first-springboot.md      # 🚀 Spring Boot入门指南
│   ├── 2.springboot-configuration.md  # ⚙️ Spring Boot配置详解
│   ├── 3.springboot-Integration.md    # 🔗 Spring Boot整合（JUnit、MyBatis、Redis）
│   └── img/                       # 🖼️ 图片资源
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
- Spring Boot 2.1.8、Java 8、Maven
- Web: 内嵌 Tomcat（可切换 Jetty/Undertow）
- 数据访问：MyBatis、MySQL（可选）
- 缓存：Redis（可选）
- 测试：JUnit

## 📚 文档
- 入门：`docs/1.first-springboot.md`
- 配置：`docs/2.springboot-configuration.md`
- 整合：`docs/3.springboot-Integration.md`
- 自动配置与扩展：`docs/4.springboot-autoconfigure.md`

## ✨ 特性
- 一键启动，可直接运行
- Properties/YAML，多环境配置
- MyBatis/Redis 快速整合示例
- 自动配置原理讲解与自定义 Starter 示例

## ⚙️ 配置
- 开发环境默认端口：80（可在 `application-dev.yml` 调整）
- 更多见：`docs/2.springboot-configuration.md`

## 🛠️ 开发
常用目录参考“项目结构”。新增接口可在 `controller` 包中添加类和路由。

## 📖 资源
### 官方
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

## 🤝 贡献
欢迎 PR 和 Issue！Fork 后提交分支并发起 Pull Request 即可。

## 📄 许可证
MIT，见 [LICENSE](LICENSE)。

## 👨‍💻 作者
yangzhao（GitHub: [@yangzhao917](https://github.com/yangzhao917)）

## 🙏 致谢
感谢 Spring Boot 团队与开源社区。

## 📞 联系方式

问题或建议：提 [Issue](https://github.com/yangzhao917/springboot-learning/issues) 或邮件 `yz0917@foxmail.com`

---

⭐ 如果项目对你有帮助，欢迎 Star！
