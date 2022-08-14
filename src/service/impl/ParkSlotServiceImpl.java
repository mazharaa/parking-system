package service.impl;

import entity.ParkSlot;
import repository.ParkSlotRepository;
import service.ParkSlotService;

import java.util.List;

public class ParkSlotServiceImpl implements ParkSlotService {
    private ParkSlotRepository parkSlotRepository;

    public ParkSlotServiceImpl(ParkSlotRepository parkSlotRepository) {
        this.parkSlotRepository = parkSlotRepository;
    }

    @Override
    public void getStatus() {
        ParkSlot[] model = parkSlotRepository.getAll();

        if (model == null) {
            System.out.println("No vehicle that park in Parking lot.");
        } else {
            System.out.format("%7s%15s%15s%15s%n", "Slot", "Reg. number", "Type", "Color");
            for (int i = 0; i < model.length; i++) {

                if (model[i] == null) {
                    System.out.format("%7s%15s%15s%15s%n", i+1, "null", "null", "null");
                } else {
                    System.out.format("%7s%15s%15s%15s%n", i+1, model[i].getRegNo(), model[i].getVehicleType(), model[i].getRegNoColor());
                }
            }
        }
    }

    @Override
    public void createParkingLot(Integer totalSlot) {
        parkSlotRepository.createParkingLot(totalSlot);
        System.out.println("Created a parking lot with " + totalSlot + " slots");
    }

    @Override
    public void park(String regNo, String color, String type) {
        ParkSlot parkSlot = new ParkSlot(regNo, type, color);
        int slot = parkSlotRepository.park(parkSlot);

        if (slot == 0) {
            System.out.println("Sorry, parking lot is full");
        } else {
            System.out.println("Allocated slot number: " + slot);
        }
    }

    @Override
    public void leave(Integer slotNo) {
        boolean success = parkSlotRepository.leave(slotNo);

        if (success) {
            System.out.println("Slot number " + slotNo + " is free");
        } else {
            System.out.println("No vehicle parking in slot number " + slotNo);
        }
    }

    @Override
    public void totalEachType(String type) {
        int total = parkSlotRepository.totalEachType(type);
        System.out.println(total);
    }

    @Override
    public void getRegNoByPlate(String regNo) {
        List<String> listRegNo = parkSlotRepository.getRegNoByPlate(regNo);

        for (int i = 0; i < listRegNo.size(); i++) {
            //check last index or not
            if (i == listRegNo.size() - 1) {
                System.out.print(listRegNo.get(i));
            } else {
                System.out.print(listRegNo.get(i) + ", ");
            }
        }
        System.out.println();
    }

    @Override
    public void getRegNoByColor(String color) {
        List<String> listRegNo = parkSlotRepository.getRegNoByColor(color);

        for (int i = 0; i < listRegNo.size(); i++) {
            //check last index or not
            if (i == listRegNo.size() - 1) {
                System.out.print(listRegNo.get(i));
            } else {
                System.out.print(listRegNo.get(i) + ", ");
            }
        }
        System.out.println();
    }

    @Override
    public void getSlotNoByColor(String color) {
        List<Integer> listSlotNo = parkSlotRepository.getSlotNoByColor(color);

        for (int i = 0; i < listSlotNo.size(); i++) {
            //check last index or not
            if (i == listSlotNo.size() - 1) {
                System.out.print(listSlotNo.get(i));
            } else {
                System.out.print(listSlotNo.get(i) + ", ");
            }
        }
        System.out.println();
    }

    @Override
    public void getSlotNoByRegNo(String regNo) {
        int lotNo = parkSlotRepository.getSlotNoByRegNo(regNo);

        if (lotNo == 0) {
            System.out.println("Not Found");
        } else {
            System.out.println(lotNo);
        }
    }
}
