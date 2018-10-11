# 看netty

## 书签
[java 官方教程](https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html)

[java 编程语言Specification](https://docs.oracle.com/javase/specs/jls/se8/html/index.html)

[jdk documentations](https://docs.oracle.com/en/java/javase/11/)

## 指导思路
- 每次通过一个思路来看
- 另外掌握编程的重要方法是动手写

## Git
## 每次看代码时把代码更新到最新
```
1.列出当前配置的所有远程仓库

git remote -v
2.增加上游

git remote add upstream https://github.com/spring-projects/spring-framework.git
3.测试上游增加结果

git remote -v
4.选择要更新的分支

git checkout master
5.从上游更新代码

git fetch upstream
git merge upstream/master
6.同步到自己的github仓库

git push
```

## 看代码的高效的待办事项路线图
- 日志

## netty如何写日志
### 日志
- 使用slf4j
- 简单的使用slf4j不就可以了吗，为何还要重新写代码
```
private static final InternalLogger logger = InternalLoggerFactory.getInstance(AbstractByteBuf.class);
logger.info("Hello, World");
```

## IO框架
既然netty是一个IO框架，那肯定是使用java对于IO支持的代码，再结合网络框架来做到异步IO的功能
- import java.nio
- IO要考虑到的点：同步、异步、是否阻塞

### nio
- Selector
- ServerSocketChannel
- bind
- InetAddress
- getLocalHost
- PrintWriter

## 思考点
- maven optional
- 研究slf4j

## 经验随手记
- java项目的忽略文件
```
# Eclipse project files
.project
.classpath
.settings

# IntelliJ IDEA project files and directories
*.iml
*.ipr
*.iws
.idea/
```

- netty里使用的logback的配置文件logback.xml
```

```