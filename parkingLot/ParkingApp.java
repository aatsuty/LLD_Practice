package parkingLot;

public class ParkingApp {
    public static void main(String args[]){
        try{
            ParkingLot parkingLot = new ParkingLot(50,10);
            ParkingSpot carSpot = parkingLot.getAvailableSpots(VehicleType.CAR);
            if(carSpot!=null){
                System.out.println("car parked in :" + carSpot.getId());
            }
            PaymentService paymentService = new PaymentService();
            double fee = paymentService.calculateFee(2,carSpot.getType());
            System.out.println("Payment fee :" + fee);
            parkingLot.releaseSpot(carSpot.getId());
            System.out.println("car spot released : " + carSpot.getId());
        }catch(Exception e){
            System.out.println("Getting Exception" + e);
        }
    }
}
