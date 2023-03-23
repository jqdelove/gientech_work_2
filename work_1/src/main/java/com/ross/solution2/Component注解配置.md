通过在 Bean 类上添加 @Component 注解将其标记为 Bean，然后通过 @Autowired 注解将依赖注入。
```java
@Component
public class UserService {
    @Autowired
    private UserDao userDao;
}

@Component
public class UserDao {
}

```