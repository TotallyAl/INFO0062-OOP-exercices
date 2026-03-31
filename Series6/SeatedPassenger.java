package Series6;

public class SeatedPassenger extends Passenger {

    public SeatedPassenger(String name) {
        super(name);
    }

    public void requestTransport(Transport t, int stops) throws TransportAccessException {
        super.requestTransport(t, true, stops);
    }

}
