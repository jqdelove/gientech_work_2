使用 Java SPI (Service Provider Interface) 进行配置，通过在 META-INF/services 目录下创建以接口全名命名的文件，文件中包含实现类的全名，示例如下：
```text
//在META-INF/services/com.example.MyInterface文件中添加以下内容：
com.example.MyImpl

```
然后在代码中使用 ServiceLoader 加载实现类，示例如下：
```java
ServiceLoader<MyInterface> serviceLoader = ServiceLoader.load(MyInterface.class);

```