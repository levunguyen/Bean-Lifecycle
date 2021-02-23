package levunguyen.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        DatabaseInitiaizer databaseInitiaizer = applicationContext.getBean(DatabaseInitiaizer.class);
        applicationContext.close();
    }
}
