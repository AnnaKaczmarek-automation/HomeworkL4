import java.util.ArrayList;

public class Market {

    private String name;
    private ArrayList<Country> countries;


    public Market(String name, ArrayList<Country> countries) {
        this.name = name;
        this.countries = countries;

    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public String getName() {
        return name;
    }
}



