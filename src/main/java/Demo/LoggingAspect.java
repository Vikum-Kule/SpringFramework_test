package Demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* Demo.ShoppingCart.checkout(..))")
    public void logger(){
        System.out.println("Loggers");
    }
}
