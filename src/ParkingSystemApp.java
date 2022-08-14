import repository.ParkSlotRepository;
import repository.impl.ParkSlotRepositoryImpl;
import service.ParkSlotService;
import service.impl.ParkSlotServiceImpl;
import view.ParkSlotView;

public class ParkingSystemApp {
    public static void main(String[] args) {
        ParkSlotRepository parkSlotRepository = new ParkSlotRepositoryImpl();
        ParkSlotService parkSlotService = new ParkSlotServiceImpl(parkSlotRepository);
        ParkSlotView parkSlotView = new ParkSlotView(parkSlotService);

        parkSlotView.parkSlotSystem();
    }
}
