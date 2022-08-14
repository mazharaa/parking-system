package entity;

public class ParkSlot {

    private String regNo;
    private String vehicleType;
    private String regNoColor;

    public ParkSlot() {
    }

    public ParkSlot(String regNo, String vehicleType, String regNoColor) {
        this.regNo = regNo;
        this.vehicleType = vehicleType;
        this.regNoColor = regNoColor;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegNoColor() {
        return regNoColor;
    }

    public void setRegNoColor(String regNoColor) {
        this.regNoColor = regNoColor;
    }
}
