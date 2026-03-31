public class Location {

    private String name;
    private int area;
    private int population;

    public Location(String name) {
        this.name = name;
        // In the case where data are unavailable
        this.area = -1;
        this.population = -1;
    }

    public Location(String name, int area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public float getPopDensity() {
        return (float)this.population/this.area;
    }

}