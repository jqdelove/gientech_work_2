实现 FactoryBean 接口，创建一个工厂类，通过 getObject() 方法返回要注入的 Bean 实例，示例如下：
```java
public class MyFactoryBean implements FactoryBean<MyBean> {

  @Override
  public MyBean getObject() {
    MyBean myBean = new MyBean();
    myBean.setName("My Bean");
    return myBean;
  }

  @Override
  public Class<MyBean> getObjectType() {
    return MyBean.class;
  }
}

```
然后在 XML 配置文件中进行配置，示例如下：
```xml
<bean id="myFactoryBean" class="com.example.MyFactoryBean"/>

<bean id="myBean" factory-bean="myFactoryBean" factory-method="getObject"/>

```