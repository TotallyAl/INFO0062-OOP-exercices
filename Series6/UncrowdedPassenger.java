package Series6;

public class UncrowdedPassenger extends Passenger {

    public UncrowdedPassenger(String name) {
        super(name);
    }

    public void requestTransport(Transport t, int stops) throws TransportAccessException {
        super.requestTransport(t, false, stops);
    }

}
