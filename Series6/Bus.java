package Series6;

public class Bus extends Transport {

    private int travelledPassengers;

    public Bus(int totalSeatingPlaces, int totalStandingPlaces) {
        super(totalSeatingPlaces, totalStandingPlaces);

        this.travelledPassengers = 0;
    }

    public int getTravalledPassengers() {
        return this.travelledPassengers;
    }

}
