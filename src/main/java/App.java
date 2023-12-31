import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);
        Cat Solomon = applicationContext.getBean(Cat.class);
        Cat Bast = applicationContext.getBean(Cat.class);
        System.out.println(Solomon == Bast);
        System.out.println(bean == bean2);

    }
}