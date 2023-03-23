在 Spring 的 XML 配置文件中，通过 <bean> 标签配置 Bean，并通过属性注入实现依赖注入。
```xml
<bean id="exampleBean" class="com.example.ExampleBean">
    <property name="name" value="John Doe"/>
    <property name="age" value="30"/>
</bean>
```