package repository.impl;

import entity.ParkSlot;
import repository.ParkSlotRepository;

import java.util.ArrayList;
import java.util.List;

public class ParkSlotRepositoryImpl implements ParkSlotRepository {
    ParkSlot[] data;

    @Override
    public ParkSlot[] getAll() {
        return data;
    }

    @Override
    public void createParkingLot(Integer totalSlot) {
        this.data = new ParkSlot[totalSlot];
    }

    @Override
    public int park(ParkSlot parkSlot) {
        int slotNo = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = parkSlot;
                slotNo = i + 1;
                break;
            }
        }
        return  slotNo;
    }

    @Override
    public boolean leave(Integer slotNo) {
        if (data.length < slotNo) {
            return false;
        } else if (data[slotNo - 1] == null) {
            return  false;
        } else {
            data[slotNo - 1] = null;
        }
        return true;
    }

    @Override
    public int totalEachType(String type) {
        int count = 0;

        for (ParkSlot vehicle : data) {
            if (vehicle.getVehicleType().equals(type)) {
                count ++;
            }
        }
        return count;
    }

    @Override
    public List<String> getRegNoByPlate(String park) {
        List<String> listRegNo = new ArrayList<>();

        for (ParkSlot vehicle : data) {
            String[] stringVehicleRegNo = vehicle.getRegNo().split("-");
            int intVehicleRegNo = Integer.parseInt(stringVehicleRegNo[1]);

            if (intVehicleRegNo % 2 == 0 && park.equals("even")) {
                listRegNo.add(vehicle.getRegNo());
            } else if (intVehicleRegNo % 2 == 1 && park.equals("odd")) {
                listRegNo.add(vehicle.getRegNo());
            }
        }
        return listRegNo;
    }

    @Override
    public List<String> getRegNoByColor(String park) {
        List<String> listRegNo = new ArrayList<>();

        for (ParkSlot vehicle : data) {
            String stringVehicleColor = vehicle.getRegNoColor();

            if (park.equals(stringVehicleColor)) {
                listRegNo.add(vehicle.getRegNo());
            }
        }
        return listRegNo;
    }

    @Override
    public List<Integer> getSlotNoByColor(String color) {
        List<Integer> listSlotNo = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            if (data[i].getRegNoColor().equals(color)) {
                listSlotNo.add(i + 1);
            }
        }
        return listSlotNo;
    }

    @Override
    public int getSlotNoByRegNo(String regNo) {
        int lotNo = 0;
        String[] arrRegNo = regNo.split(" ");
        String sRegNo = arrRegNo[arrRegNo.length - 1];

        for (int i = 0; i < data.length; i++) {
            if (data[i].getRegNo().equals(sRegNo)) {
                lotNo = i + 1;
            }
        }
        return lotNo;
    }
}
