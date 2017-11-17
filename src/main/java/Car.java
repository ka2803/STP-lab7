import javax.validation.constraints.*;

public class Car {

    @NotNull
    private String manufacturer;

    @Max(5)
    private int age;

    @Min(150)
    private float power;

    @Min(200)
    private float torque;

    @Max(100000)
    private float distance;

    @NotNull
    @Pattern(regexp = "^\\w{3}-\\d{2}$",message = "vin format is not valid")
    private String vinCode;

    @Pattern(regexp = "^\\w{2} \\d{4} \\w{2}$",message = "license format is not valid")
    private String licenseNumber;

    @AssertTrue
    private boolean isClearDocs;

    @Min(0)
    private int countOfOwners;

    @Max(0)
    private int countOfCrashes;

    public Car() {
    }

    public Car(String manufacturer,int age,float power,float torque,
               float distance, String vinCode,
               String licenseNumber,
               boolean isClearDocs,int countOfOwners,int countOfCrashes) {
        this.manufacturer = manufacturer;
        this.age = age;
        this.power = power;
        this.torque = torque;
        this.distance = distance;
        this.vinCode = vinCode;
        this.licenseNumber = licenseNumber;
        this.isClearDocs = isClearDocs;
        this.countOfOwners = countOfOwners;
        this.countOfCrashes = countOfCrashes;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public float getTorque() {
        return torque;
    }

    public void setTorque(float torque) {
        this.torque = torque;
    }

    public float getDistance() {
        return distance;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public boolean getClearDocs() {
        return isClearDocs;
    }

    public void setClearDocs(boolean clearDocs) {
        isClearDocs = clearDocs;
    }


    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getCountOfOwners() {
        return countOfOwners;
    }

    public void setCountOfOwners(int countOfOwners) {
        this.countOfOwners = countOfOwners;
    }

    public int getCountOfCrashes() {
        return countOfCrashes;
    }

    public void setCountOfCrashes(int countOfCrashes) {
        this.countOfCrashes = countOfCrashes;
    }
}
