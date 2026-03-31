package Series6;

import java.util.Vector;

public abstract class Transport {

    private final int totalStandingPlaces, totalSeatingPlaces;
    private int occupiedStanding, occupiedSeating;

    private Vector<Passenger> passengers;

    public Transport(int totalSeatingPlaces, int totalStandingPlaces) {
        this.totalSeatingPlaces = totalSeatingPlaces;
        this.totalStandingPlaces = totalSeatingPlaces;

        this.passengers = new Vector<>();

        this.occupiedStanding = 0;
        this.occupiedSeating = 0;

    }

    public int getRemainingSeating() {
        return this.totalSeatingPlaces - this.occupiedSeating;
    }

    public int getRemainingStanding() {
        return this.totalStandingPlaces - this.occupiedStanding;
    }

    public void pickPassenger(Passenger p, boolean seated) throws TransportAccessException {

        if (seated) {
            if (getRemainingSeating() == 0) {
                throw new TransportAccessException("[DENIED ACCESS]: No remaining Seating places");
            }
            this.occupiedSeating++;
        }

        else {
            if (getRemainingStanding() == 0) {
                throw new TransportAccessException("[DENIED ACCESS]: No remaining Standing places");
            }
            this.occupiedStanding++;
        }
        passengers.add(p);
    }

    public void nextStop(String s) {
        System.out.println("-----------");
        for (int i = 0; i < passengers.size(); i++)
            passengers.get(i).notifyNextStop();
        System.out.println("[TRANSPORT]: Next stop: " + s);
    }

    public boolean leave(Passenger p) {
        if (!passengers.remove(p))
            return false;

        if (p.getPosition()) {
            this.occupiedSeating--;
        } else {
            this.occupiedStanding--;
        }
        return true;
    }

}
