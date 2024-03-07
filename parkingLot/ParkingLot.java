package parkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<Integer, ParkingSpot> parkingSpots;
    public ParkingLot(int numCarSpots, int numBikeSpots){
        parkingSpots = new HashMap<>();
        for(int i=0; i<=numCarSpots; i++){
            parkingSpots.put(i, new ParkingSpot(i, VehicleType.CAR));
        }
        for(int i=numCarSpots+1; i<= numCarSpots + numBikeSpots; i++){
            parkingSpots.put(i, new ParkingSpot(i, VehicleType.BIKE));

        }
    }

    public synchronized ParkingSpot getAvailableSpots(VehicleType type){
        for(ParkingSpot spot: parkingSpots.values()){
            if(!spot.isOccupied() && spot.getType() == type){
                spot.occupy();
                return spot;
            }
        }
        return  null;

    }
    public synchronized void releaseSpot(int spotId){
        ParkingSpot spot = parkingSpots.get(spotId);
        if(spot !=null){
            spot.release();
        }

    }

}
