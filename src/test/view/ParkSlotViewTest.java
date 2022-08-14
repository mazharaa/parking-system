package test.view;

import repository.ParkSlotRepository;
import repository.impl.ParkSlotRepositoryImpl;
import service.ParkSlotService;
import service.impl.ParkSlotServiceImpl;
import view.ParkSlotView;

public class ParkSlotViewTest {
    public static void main(String[] args) {
        testParkSlot();
    }

    public static void testParkSlot() {
        ParkSlotRepository parkSlotRepository = new ParkSlotRepositoryImpl();
        ParkSlotService parkSlotService = new ParkSlotServiceImpl(parkSlotRepository);
        ParkSlotView parkSlotView = new ParkSlotView(parkSlotService);

        parkSlotView.parkSlotSystem();
    }
}
