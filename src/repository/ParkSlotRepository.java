package repository;

import entity.ParkSlot;

import java.util.List;

public interface ParkSlotRepository {

    //getStatus
    ParkSlot[] getAll();

    //total number parking slot want to create
    void createParkingLot(Integer totalSlot);

    //vehicle park to available parking slot
    int park(ParkSlot parkSlot);

    //vehicle leaving parking slot
    boolean leave(Integer slotNo);

    //total vehicle each type
    int totalEachType(String type);

    //get vehicle registration number by odd or even number
    List<String> getRegNoByPlate(String park);

    //get vehicle registration number by color
    List<String> getRegNoByColor(String park);

    //get parking lot number by vehicle color
    List<Integer> getSlotNoByColor(String color);

    //get parking lot number by vehicle's registration number
    int getSlotNoByRegNo(String regNo);
}
