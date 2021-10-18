package ss06_inheritance_java.bai_tap.bai_tap_them;


public class Address {
    private String houseNumber;
    private String stress;
    private String ward;
    private String district;
    private String province;
    public Address() {
    }

    public Address(String houseNumber, String stress, String ward, String district, String province) {
        this.houseNumber = houseNumber ;
        this.stress = stress;
        this.ward = ward;
        this.district = district;
        this.province = province;
    }


    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStress() {
        return stress;
    }

    public void setStress(String stress) {
        this.stress = stress;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + getHouseNumber() + '\'' +
                ", stress='" + getStress() + '\'' +
                ", ward='" + getWard() + '\'' +
                ", district='" + getDistrict() + '\'' +
                ", province='" + getProvince() + '\'' +
                '}';
    }
}

