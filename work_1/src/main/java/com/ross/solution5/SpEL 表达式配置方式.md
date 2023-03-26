使用 Spring 表达式语言 (SpEL) 进行配置，示例如下：
```xml
<bean id="myBean" class="com.example.MyBean">
  <property name="name" value="#{ T(java.lang.Math).random() }"/>
</bean>

```