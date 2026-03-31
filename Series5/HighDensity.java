import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;

public class HighDensity {

    public static Location getHighDensityLocation(String filename) throws FileNotFoundException {

        System.out.println("Filename: " + filename);

        Scanner sc = new Scanner(new File(filename));

        Vector<Float> populationDensities = new Vector<>();
        Vector<Location> location = new Vector<>();

        int nbLines = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);

            String[] lineParts = line.split(";");

            int locationType = Integer.valueOf(lineParts[0]);

            if (locationType == 1) {

                String countryName = lineParts[1];

                int area = Integer.valueOf(lineParts[2]);
                int population = Integer.valueOf(lineParts[3]);
                String[] callingCodeStr = lineParts[4].split("\\+");

                if (callingCodeStr.length == 1) {
                    throw new IllegalArgumentException("Callingcode format is wrong: '" + line + "'");
                }

                int callingCode = Integer.valueOf(callingCodeStr[1]);

                Country country = new Country(countryName, area, population, callingCode);

                populationDensities.add(country.getPopDensity());
                location.add(country);

            } else if (locationType == 2) {

                String cityName = lineParts[1];
                int area = Integer.valueOf(lineParts[2]);
                int population = Integer.valueOf(lineParts[3]);
                String countryName = lineParts[4];

                City city = new City(cityName, area, population, countryName);

                populationDensities.add(city.getPopDensity());
                location.add(city);

            } else {
                throw new IllegalArgumentException("Unknown locationType variable for string: '" + line + "'");
            }

            nbLines++;

        }

        sc.close();

        int i = 0;
        float maxPopDens = 0.0f;
        int maxPopDensIdx = 0;
        for (; i < nbLines; i++) {
            float popDens = populationDensities.get(i);
            if (maxPopDens < popDens) {
                maxPopDens = popDens;
                maxPopDensIdx = i;
            }
        }

        System.out.println(maxPopDens);
        return location.get(maxPopDensIdx);
    }

    public static void main(String args[]) {

        try {
            String filename = args[0];
            Location location = getHighDensityLocation(filename);
            System.out.println(location.getName());
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }

    }

}