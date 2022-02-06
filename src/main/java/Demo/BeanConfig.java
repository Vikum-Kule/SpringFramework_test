package Demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "Demo")
@EnableAspectJAutoProxy
public class BeanConfig {

//    @Bean
//    public Car car(){
//        return new Car();
//    }
}
