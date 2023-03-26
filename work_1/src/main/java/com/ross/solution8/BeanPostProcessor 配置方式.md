实现 BeanPostProcessor 接口，通过 postProcessBeforeInitialization() 和 postProcessAfterInitialization() 方法在 Bean 初始化前后进行一些额外的处理，示例如下：
```java
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            MyBean myBean = (MyBean) bean;
            myBean.setName("My Bean");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}

```

然后在 XML 配置文件中进行配置，示例如下：
```xml
<bean id="myBean" class="com.example.MyBean"/>

<bean id="myBeanPostProcessor" class="com.example.MyBeanPostProcessor"/>

<bean class="org.springframework.beans.factory.config.BeanPostProcessor">
  <property name="beanPostProcessors">
    <list>
      <ref bean="myBeanPostProcessor"/>
    </list>
  </property>
</bean>

```