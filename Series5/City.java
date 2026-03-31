public class City extends Location {

    private String country;

    public City(String name) {
        super(name);
        this.country = "Unknown";
    }

    public City(String name, int area, int population, String country) {
        super(name, area, population);
        this.country = country;
    }

    public String getCountry() {
        return "+" + this.country;
    }
}
