package view;

import service.ParkSlotService;
import util.InputUtil;

public class ParkSlotView {
    private ParkSlotService parkSlotService;

    public  ParkSlotView(ParkSlotService parkSlotService) {
        this.parkSlotService = parkSlotService;
    }

    public void parkSlotSystem() {
        while (true) {
            var input = InputUtil.input();

            String[] arrInput = input.split(" ");

            if (arrInput[0].equals("create_parking_lot")) {
                parkSlotService.createParkingLot(Integer.parseInt(arrInput[1]));
            } else if (arrInput[0].equals("park")) {
                parkSlotService.park(arrInput[1], arrInput[2], arrInput[3]);
            } else if (arrInput[0].equals("leave")) {
                parkSlotService.leave(Integer.parseInt(arrInput[1]));
            } else if (arrInput[0].equals("status")) {
                parkSlotService.getStatus();
            } else if (arrInput[0].equals("type_of_vehicles")) {
                parkSlotService.totalEachType(arrInput[1]);
            } else if (arrInput[0].equals("registration_numbers_for_vehicles_with_plate")) {
                parkSlotService.getRegNoByPlate(arrInput[1]);
            } else if (arrInput[0].equals("registration_numbers_for_vehicles_with_colour")) {
                parkSlotService.getRegNoByColor(arrInput[1]);
            } else if (arrInput[0].equals("slot_numbers_for_vehicles_with_colour")) {
                parkSlotService.getSlotNoByColor(arrInput[1]);
            } else if (arrInput[0].equals("slot_number_for_registration_number")) {
                parkSlotService.getSlotNoByRegNo(arrInput[1]);
            } else if (arrInput[0].equals("exit")) {
                break;
            } else  {
                System.out.println("Undefined input");
            }
        }
    }
}
