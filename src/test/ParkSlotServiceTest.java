package test;

import repository.ParkSlotRepository;
import repository.impl.ParkSlotRepositoryImpl;
import service.ParkSlotService;
import service.impl.ParkSlotServiceImpl;

public class ParkSlotServiceTest {
    public static void main(String[] args) {
        testGetSlotNoByRegNo();
    }

    public static void testCreateParkingLot() {
        ParkSlotRepository parkSlotRepository = new ParkSlotRepositoryImpl();
        ParkSlotService parkSlotService = new ParkSlotServiceImpl(parkSlotRepository);

        parkSlotService.createParkingLot(6);
    }

    public static void testPark() {
        ParkSlotRepository parkSlotRepository = new ParkSlotRepositoryImpl();
        ParkSlotService parkSlotService = new ParkSlotServiceImpl(parkSlotRepository);

        parkSlotService.createParkingLot(6);
        parkSlotService.park("B-1234-XYZ Putih Mobil");
        parkSlotService.park("B-9999-XYZ Putih Motor");
        parkSlotService.park("D-0001-HIJ Hitam Mobil");
        parkSlotService.park("B-7777-DEF Merah Mobil");
        parkSlotService.park("B-2701-XXX Biru Mobil");
        parkSlotService.park("B-3141-ZZZ Hitam Motor");
        parkSlotService.park("B-3241-ZZZ Hitam Motor");

        parkSlotService.getStatus();
    }

    public static void testLeave() {
        ParkSlotRepository parkSlotRepository = new ParkSlotRepositoryImpl();
        ParkSlotService parkSlotService = new ParkSlotServiceImpl(parkSlotRepository);

        parkSlotService.createParkingLot(6);

        parkSlotService.park("B-1234-XYZ Putih Mobil");
        parkSlotService.park("B-9999-XYZ Putih Motor");
        parkSlotService.park("D-0001-HIJ Hitam Mobil");
        parkSlotService.park("B-7777-DEF Merah Mobil");
        parkSlotService.park("B-2701-XXX Biru Mobil");
        parkSlotService.park("B-3141-ZZZ Hitam Motor");
        parkSlotService.park("B-3241-ZZZ Hitam Motor");

        parkSlotService.leave(5);

        parkSlotService.getStatus();

        parkSlotService.park("B-3141-ZZZ Hitam Motor");

        parkSlotService.getStatus();

        parkSlotService.park("B-4141-ZZZ Hitam Motor");
    }

    public static void testTotalEachType() {
        ParkSlotRepository parkSlotRepository = new ParkSlotRepositoryImpl();
        ParkSlotService parkSlotService = new ParkSlotServiceImpl(parkSlotRepository);

        parkSlotService.createParkingLot(6);

        parkSlotService.park("B-1234-XYZ Putih Mobil");
        parkSlotService.park("B-9999-XYZ Putih Motor");
        parkSlotService.park("D-0001-HIJ Hitam Mobil");
        parkSlotService.park("B-7777-DEF Merah Mobil");
        parkSlotService.park("B-2701-XXX Biru Mobil");
        parkSlotService.park("B-3141-ZZZ Hitam Motor");

        parkSlotService.getStatus();

        System.out.print("Mobil total : ");
        parkSlotService.totalEachType("Mobil");

        System.out.print("Motor total : ");
        parkSlotService.totalEachType("Motor");
    }

    public static void testGetRegNoByPlate() {
        ParkSlotRepository parkSlotRepository = new ParkSlotRepositoryImpl();
        ParkSlotService parkSlotService = new ParkSlotServiceImpl(parkSlotRepository);

        parkSlotService.createParkingLot(6);

        parkSlotService.park("B-1234-XYZ Putih Mobil");
        parkSlotService.park("B-9999-XYZ Putih Motor");
        parkSlotService.park("D-0002-HIJ Hitam Mobil");
        parkSlotService.park("B-7777-DEF Merah Mobil");
        parkSlotService.park("B-2702-XXX Biru Mobil");
        parkSlotService.park("B-3141-ZZZ Hitam Motor");

        parkSlotService.getStatus();

        System.out.print("Even Plate Reg. No : ");
        parkSlotService.getRegNoByPlate("even");
        System.out.println();

        System.out.print("Even Plate Reg. No : ");
        parkSlotService.getRegNoByPlate("odd");
    }

    public static void testGetRegNoByColor() {
        ParkSlotRepository parkSlotRepository = new ParkSlotRepositoryImpl();
        ParkSlotService parkSlotService = new ParkSlotServiceImpl(parkSlotRepository);

        parkSlotService.createParkingLot(6);

        parkSlotService.park("B-1234-XYZ Putih Mobil");
        parkSlotService.park("B-9999-XYZ Putih Motor");
        parkSlotService.park("D-0002-HIJ Hitam Mobil");
        parkSlotService.park("B-7777-DEF Merah Mobil");
        parkSlotService.park("B-2702-XXX Biru Mobil");
        parkSlotService.park("B-3141-ZZZ Hitam Motor");

        parkSlotService.getStatus();

        System.out.print("Putih color vehicle reg. no : ");
        parkSlotService.getRegNoByColor("Putih");
        System.out.println();

        System.out.print("Hitam color vehicle reg. no : ");
        parkSlotService.getRegNoByColor("Hitam");
        System.out.println();

        System.out.print("Merah color vehicle reg. no : ");
        parkSlotService.getRegNoByColor("Merah");
        System.out.println();

        System.out.print("Biru color vehicle reg. no : ");
        parkSlotService.getRegNoByColor("Biru");
    }

    public static void testGetSlotNoByColor() {
        ParkSlotRepository parkSlotRepository = new ParkSlotRepositoryImpl();
        ParkSlotService parkSlotService = new ParkSlotServiceImpl(parkSlotRepository);

        parkSlotService.createParkingLot(6);

        parkSlotService.park("B-1234-XYZ Putih Mobil");
        parkSlotService.park("B-9999-XYZ Putih Motor");
        parkSlotService.park("D-0002-HIJ Hitam Mobil");
        parkSlotService.park("B-7777-DEF Merah Mobil");
        parkSlotService.park("B-2702-XXX Biru Mobil");
        parkSlotService.park("B-3141-ZZZ Hitam Motor");

        parkSlotService.getStatus();

        System.out.println();
        System.out.print("Slot no. with putih color vehicle : ");
        parkSlotService.getSlotNoByColor("Putih");

        System.out.println();
        System.out.print("Slot no. with hitam color vehicle : ");
        parkSlotService.getSlotNoByColor("Hitam");

        System.out.println();
        System.out.print("Slot no. with merah color vehicle : ");
        parkSlotService.getSlotNoByColor("Merah");

        System.out.println();
        System.out.print("Slot no. with biru color vehicle : ");
        parkSlotService.getSlotNoByColor("Biru");
    }

    public static void testGetSlotNoByRegNo() {
        ParkSlotRepository parkSlotRepository = new ParkSlotRepositoryImpl();
        ParkSlotService parkSlotService = new ParkSlotServiceImpl(parkSlotRepository);

        parkSlotService.createParkingLot(6);

        parkSlotService.park("B-1234-XYZ Putih Mobil");
        parkSlotService.park("B-9999-XYZ Putih Motor");
        parkSlotService.park("D-0002-HIJ Hitam Mobil");
        parkSlotService.park("B-7777-DEF Merah Mobil");
        parkSlotService.park("B-2702-XXX Biru Mobil");
        parkSlotService.park("B-3141-ZZZ Hitam Motor");

        parkSlotService.getStatus();

        System.out.print("Slot no. with B-1234-XYZ vehicle reg. no : ");
        parkSlotService.getSlotNoByRegNo("B-1234-XYZ");

        System.out.print("Slot no. with D-0002-HIJ vehicle reg. no : ");
        parkSlotService.getSlotNoByRegNo("D-0002-HIJ");

        System.out.print("Slot no. with B-2702-XXX vehicle reg. no : ");
        parkSlotService.getSlotNoByRegNo("B-2702-XXX");

        System.out.print("Slot no. with B-3141-ZZZ vehicle reg. no : ");
        parkSlotService.getSlotNoByRegNo("B-3141-ZZZ");
    }
}
