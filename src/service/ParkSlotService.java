package service;

public interface ParkSlotService {
    //getStatus
    void getStatus();

    //total number parking slot want to create
    void createParkingLot(Integer totalSlot);

    //vehicle park to available parking slot
    void park(String regNo, String color, String type);

    //vehicle leaving parking slot
    void leave(Integer slotNo);

    //total vehicle each type
    void totalEachType(String type);

    //get vehicle registration number by odd or even number
    void getRegNoByPlate(String regNo);

    //get vehicle registration number by color
    void getRegNoByColor(String color);

    //get parking slot number by vehicle color
    void getSlotNoByColor(String color);

    //get parking slot number by vehicle's registration number
    void getSlotNoByRegNo(String regNo);
}
