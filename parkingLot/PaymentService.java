package parkingLot;
import parkingLot.VehicleType;
public class PaymentService {
    public double calculateFee(int duration, VehicleType type){
        double rate = (type == VehicleType.CAR) ? 0.1: 0.05;
        return rate * duration;
    }
}
