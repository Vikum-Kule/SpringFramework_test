package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfig.class);



        Doctor doctor = context.getBean(Doctor.class);
        Nurse nurse = (Nurse) context.getBean("nurse");
        doctor.assist();
        System.out.println(doctor.getQualification());
        nurse.assist();

        Car car = context2.getBean(Car.class);
        car.ride();
        car.setLicence("AAS");
        System.out.println(car);

        Car car2 = context2.getBean(Car.class);
        System.out.println(car2);

        ShoppingCart shoppingCart = context2.getBean(ShoppingCart.class);
        shoppingCart.checkout("Cancelled");
    }
}
