# xsbdSystem

### 介绍
高校新生报到系统

### 开发环境
- 操作系统：Windows 7
- 集成开发环境：IntelliJ IDEA 2017.3
- JDK：Oracle JDK 1.8
- 数据库：MySQL 5.7

### 使用的技术
- SpringBoot  
- Mybatis  
- MySql  
- Freemaker
- Maven

### 数据结构 
数据库结构：xsbd/src/main/resources/db_xsbd.sql

### 打包
在项目根目录执行：
```
mvn package
```
在`xsbd\target`内即可找到打包好的jar包`xsbd-1.0-SNAPSHOT.jar`。

### 运行
在运行之前需要先导入数据，找到下面文件：  
```
xsbd/src/main/resources/db_xsbd.sql
```
在本地MySql中运行该SQL。
导入数据成功后，通过下面命令运行：
```
java -jar xsbd-1.0-SNAPSHOT.jar
```
**注意：**  
默认使用的数据库为本地数据库，如果要自定义数据库位置运行时需要添加相关参数，包括数据库连接、数据库账户和数据库密码，示例命令如下：
```
java -jar xsbd-1.0-SNAPSHOT.jar --spring.datasource.url=jdbc:mysql://127.0.0.1:3306/db_xsbd? --useSSL=false --useUnicode=true --characterEncoding=UTF-8 --spring.datasource.username=YourUsername --spring.datasource.password=YourPassword
```

### 结语
作为应付毕业设计的作品，只花了一周仓促写出来的，可能存在一些问题的，不过各个功能都是可以正常使用的。但是不排除会有一些问题，如：不支持打包运行，因为我没有配置。  
注：所有ato包里的类都是mybatis-Plus生成的，也可以用mybatis-generator生成。
