
参考链接：http://blog.csdn.net/qq598535550/article/details/51703190

基于springmvc构建的web项目，web服务器： tomcat。现在大部分spring应用都使用springboot构建了，优点是极大的简化了配置，但是同时导致对于一些原理的理解也变得困难了。
在尝试重新构建ssm项目的是否，发现也遗忘了好多，这里建立一个demo，作为以后项目模板，同时也复习一些基础知识。

项目仍在完善中。

# 基础构建

## 数据库

参考schema.sql

## 项目构建

1. 新建maven项目，修改项目配置 [![spzhZR.png](https://s3.ax1x.com/2021/01/03/spzhZR.png)](https://imgchr.com/i/spzhZR)
2. maven导包（参考pom.xml
3. 写配置 
    - web.xml配置：至少配置listener和dispatcherservlet，并且要注意配置顺序。
    - spring相关配置
    - mybatis配置
    - 其它： logback日志等
4. 编码
5. 配置tomcat启动[![s9SFyQ.png](https://s3.ax1x.com/2021/01/03/s9SFyQ.png)](https://imgchr.com/i/s9SFyQ)

# 知识点

1. ssm项目基本配置过程： maven导包、写配置、编码、tomcat启动配置
2. idea运行maven项目（ssm)：[![spOlyn.png](https://s3.ax1x.com/2021/01/03/spOlyn.png)](https://imgchr.com/i/spOlyn)
3. test规范：参考test包

## TODO

1. mybatis genetor
