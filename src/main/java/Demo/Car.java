package Demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Car {

    private String licence;

    public void ride(){
        System.out.println("Car ride");
    }

    @Override
    public String toString() {
        return "Car{" +
                "licence='" + licence + '\'' +
                '}';
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
}
