public class Country extends Location {
    private int callingCode;

    /*
     * We define new constructors that use `super();`
     */

    // public Country(String name) {
    // this.name = name;
    // // In the case where data are unavailable
    // this.area = -1;
    // this.population = -1;
    // this.callingCode = -1;
    // }

    // public Country(String name, int area, int population, int callingCode) {
    // this.name = name;
    // this.area = area;
    // this.population = population;
    // this.callingCode = callingCode;
    // }

    public Country(String name) {
        super(name);
        this.callingCode = -1;
    }

    public Country(String name, int area, int population, int callingCode) {
        super(name, area, population);
        this.callingCode = callingCode;
    }

    /*
     * We don't need these methods since they are the same than in Location.java
     */
    // public String getName() {
    // return this.name;
    // }

    // public float getPopDensity() {
    // return (float) this.population / this.area;
    // }

    public String getCallingCode() {
        return "+" + this.callingCode;
    }

}