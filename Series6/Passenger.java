package Series6;

public class Passenger {

    private boolean seated;
    private Transport transport;
    private int stops;
    private final String name;

    public Passenger(String name) {
        this.name = name;
    }

    public boolean getPosition() {
        return this.seated;
    }

    public void notifyNextStop() {
        this.stops--;
        if (this.stops == 0)
            leave();
    }

    private void leave() {
        if (transport == null)
            return;

        if (transport.leave(this))
            this.transport = null;
        else
            System.out.println("Passenger was not in transport");
    }

    protected void requestTransport(Transport t, boolean seated, int stops) throws TransportAccessException {
        try {
            t.pickPassenger(this, seated);
            System.out.println(this.name + " enterred Transport");
            this.transport = t;
            this.stops = stops;
            this.seated = seated;
        } catch (TransportAccessException e) {
            throw new TransportAccessException(this.name + " was not accepted in " + e.getMessage());
        }
    }

    public String toString() {
        return "Passenger: " + this.name + " remaining stops: " + this.stops;
    }

}
