import java.util.ArrayList;

public class Country {

    private String countryName;
    private char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    public char getCountrySign() {
        return countrySign;
    }

    public String getCountryName() {
        return countryName;
    }

    public static void getElementsFromCountryList(ArrayList<Country> country) {
        for (Country element : country) {
            String name = element.getCountryName();
            char sign = element.getCountrySign();
            System.out.println(name + "-" + sign);
        }
    }
}
