package ss06_bai_tap_cuoi_tuan_01_oop.nhap_tt_xe;

public class Vehicle {
    private String nameOwner;   // tên chủ sở hữu
    private String nameVehicle; // loại phương tiện
    private String brandcar;  // nhãn hiệu xe vd: honda, yamaha, suzuki
    private String color; // màu xe
    private String engineNumber;  //số máy xe
    private String licensePlates;  // biển số xe
    private int capacity ;     //dung tích xe
    private int carValue ;
    private int registrationTax;
    public Vehicle() {
    }

    public Vehicle(String nameOwner, String nameVehicle, String brandcar, String color, String engineNumber, String licensePlates, int capacity, int carValue, int registrationTax) {
        this.nameOwner = nameOwner;
        this.nameVehicle = nameVehicle;
        this.brandcar = brandcar;
        this.color = color;
        this.engineNumber = engineNumber;
        this.licensePlates = licensePlates;
        this.capacity = capacity;
        this.carValue = carValue;
        this.registrationTax = registrationTax;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getNameVehicle() {
        return nameVehicle;
    }

    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }

    public String getBrandcar() {
        return brandcar;
    }

    public void setBrandcar(String brandcar) {
        this.brandcar = brandcar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCarValue() {
         return carValue;
    }

    public void setCarValue(int carValue) {
        this.carValue = carValue;
    }

    public int getRegistrationTax() {

        return registrationTax;
    }

    public void setRegistrationTax(int registrationTax) {
        this.registrationTax = registrationTax;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "nameOwner='" + nameOwner + '\'' +
                ", nameVehicle='" + nameVehicle + '\'' +
                ", brandcar='" + brandcar + '\'' +
                ", color='" + color + '\'' +
                ", engineNumber='" + engineNumber + '\'' +
                ", licensePlates=" + licensePlates +
                ", capacity=" + capacity + "cc"+
                ", carValue=" + carValue + "vnđ" +
                ", registrationTax=" + registrationTax + "vnđ" +
                '}';
    }
}
