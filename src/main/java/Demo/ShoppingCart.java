package Demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout( String status){
        //Logging
        //Authorization
        //Sanitize data
        // above all the stuffs are Cross cutting concerns...
        System.out.println("Checkout Method from shopping cart"+ status);
    }
}
