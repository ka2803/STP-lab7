import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;

import static org.junit.Assert.assertEquals;


public class CarTests {
    private Validator validator;
    private Car validCar;
    private Car invalidCar;
    private Car emptyCar;

    @Before
    public void InitValidator(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
    @Before
    public void InitCars(){
        emptyCar=new Car();
        validCar = new Car("BMW",2,320,202.2F,25000.2F,
                "BMW-13","AA 0000 AA",true,1,0);
        invalidCar = new Car(null,10,120,150F,220000F,
                "asdasd","0000AA",false,-1,15);
    }

    @Test
    public void CtorTest(){
        Assert.assertEquals(null,emptyCar.getManufacturer());
        Assert.assertEquals("BMW",validCar.getManufacturer());
    }


    @Test
    public void constratintTest(){
        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(validCar);
        assertEquals(0, constraintViolations.size());

        validCar.setAge(10);
        constraintViolations = validator.validate(validCar);
        assertEquals(1, constraintViolations.size());
        validCar.setClearDocs(false);
        constraintViolations = validator.validate(validCar);
        assertEquals(2, constraintViolations.size());
        validCar.setCountOfCrashes(15);
        constraintViolations = validator.validate(validCar);
        assertEquals(3, constraintViolations.size());
        validCar.setCountOfOwners(-2);
        constraintViolations = validator.validate(validCar);
        assertEquals(4, constraintViolations.size());
        validCar.setDistance(10000000F);
        constraintViolations = validator.validate(validCar);
        assertEquals(5, constraintViolations.size());
        validCar.setLicenseNumber("ASD");
        constraintViolations = validator.validate(validCar);
        assertEquals(6, constraintViolations.size());
        validCar.setManufacturer(null);
        constraintViolations = validator.validate(validCar);
        assertEquals(7, constraintViolations.size());
        validCar.setPower(12);
        constraintViolations = validator.validate(validCar);
        assertEquals(8, constraintViolations.size());
        validCar.setTorque(10F);
        constraintViolations = validator.validate(validCar);
        assertEquals(9, constraintViolations.size());
        validCar.setVinCode("asd");
        constraintViolations = validator.validate(validCar);
        assertEquals(10, constraintViolations.size());
    }
    @Test
    public void manufacturerGetterSetterTest(){
        validCar.setManufacturer("BMW");
        assertEquals("BMW",validCar.getManufacturer());
    }
    @Test
    public void ageGetterSetterTest(){
        validCar.setAge(2);
        assertEquals(2,validCar.getAge());
    }
    @Test
    public void powerGetterSetterTest(){
        validCar.setPower(12);
        assertEquals(12,validCar.getPower(),0);
    }
    @Test
    public void torqueGetterSetterTest(){
        validCar.setTorque(10F);
        assertEquals(10,(double)validCar.getTorque(),0);
    }
    @Test
    public void distanceGetterSetterTest(){
        validCar.setDistance(10000000F);
        assertEquals(10000000F,validCar.getDistance(),0);
    }
    @Test
    public void vinCodeGetterSetterTest(){
        validCar.setVinCode("asd");
        assertEquals("asd",validCar.getVinCode());
    }
    @Test
    public void licenseGetterSetterTest(){
        validCar.setLicenseNumber("ASD");
        assertEquals("ASD",validCar.getLicenseNumber());
    }
    @Test
    public void clearGetterSetterTest(){
        validCar.setClearDocs(false);
        assertEquals(false,validCar.getClearDocs());
    }
    @Test
    public void ownersGetterSetterTest(){
        validCar.setCountOfOwners(-2);
        assertEquals(-2,validCar.getCountOfOwners());
    }
    @Test
    public void crashesGetterSetterTest(){
        validCar.setCountOfCrashes(15);
        assertEquals(15,validCar.getCountOfCrashes());
    }

}
