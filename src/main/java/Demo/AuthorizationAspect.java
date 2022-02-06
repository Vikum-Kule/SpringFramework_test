package Demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthorizationAspect {
    @Pointcut("within(Demo.ShoppingCart..*)")
    public void authenticationPointCut(){

    }

    @Pointcut("within(Demo.ShoppingCart..*)")
    public void authorizationPointCut(){

    }

    @Before("authenticationPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the request");
    }

}
