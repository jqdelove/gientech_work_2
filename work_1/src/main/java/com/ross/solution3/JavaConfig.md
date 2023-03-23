使用 Java 配置类配置 Bean，并通过 @Autowired 注解注入依赖。
```java
@Configuration
public class AppConfig {
    @Bean
    public UserService userService() {
        UserService userService = new UserService();
        userService.setUserDao(userDao());
        return userService;
    }

    @Bean
    public UserDao userDao() {
        return new UserDao();
    }
}

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
}

@Repository
public class UserDao {
}

```