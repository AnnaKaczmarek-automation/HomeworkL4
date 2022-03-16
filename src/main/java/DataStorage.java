import java.util.ArrayList;

public class DataStorage {

    public ArrayList<Country> generateCountryList(){
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Poland", 'P'));
        countries.add(new Country("France", 'F'));
        countries.add(new Country("Germany", 'D'));
        countries.add(new Country("Spain", 'E'));
        countries.add(new Country("Denmark", 'D'));
        return countries;
    }

    public ArrayList<Country> generateCountriesForBusiness() {
        ArrayList<Country> countriesForBusiness = new ArrayList<>();
        countriesForBusiness.add(generateCountryList().get(0));
        countriesForBusiness.add(generateCountryList().get(1));
        countriesForBusiness.add(generateCountryList().get(2));
        return countriesForBusiness;
    }

    public ArrayList<Country> generateCountriesForCargo() {
        ArrayList<Country> countriesForCargo = new ArrayList<>();
        countriesForCargo.add(generateCountryList().get(3));
        countriesForCargo.add(generateCountryList().get(4));
        countriesForCargo.add(generateCountryList().get(0));
        return countriesForCargo;
    }

    public ArrayList<Country> generateCountriesForTransport() {
        ArrayList<Country> countriesForTransport = new ArrayList<>();
        countriesForTransport.add(generateCountryList().get(1));
        countriesForTransport.add(generateCountryList().get(4));
        countriesForTransport.add(generateCountryList().get(0));
        return countriesForTransport;
    }

    public ArrayList<Country> generateCountriesForTaxi() {
        ArrayList<Country> countriesForTaxi = new ArrayList<>();
        countriesForTaxi.add(generateCountryList().get(1));
        countriesForTaxi.add(generateCountryList().get(2));
        countriesForTaxi.add(generateCountryList().get(3));
        return countriesForTaxi;
    }

    public ArrayList<Country> generateCountriesForBus() {
        ArrayList<Country> countriesForBus = new ArrayList<>();
        countriesForBus.add(generateCountryList().get(0));
        countriesForBus.add(generateCountryList().get(4));
        countriesForBus.add(generateCountryList().get(3));
        return countriesForBus;
    }

    public ArrayList<Market> generateMarketList(){
        ArrayList<Market> marketList = new ArrayList<>();
        marketList.add(new Market("business", generateCountriesForBusiness()));
        marketList.add(new Market("cargo", generateCountriesForCargo()));
        marketList.add(new Market("transport", generateCountriesForTransport()));
        marketList.add(new Market("taxi", generateCountriesForTaxi()));
        marketList.add(new Market("bus", generateCountriesForBus()));
        return marketList;
    }

    public ArrayList<Dimension> generateListOfDimensions() {

        Dimension hatchback = new Dimension(70, 120, 500);
        Dimension sedan = new Dimension(80, 130, 250);
        Dimension liftback = new Dimension(75, 110, 280);
        Dimension kombi = new Dimension(90, 140, 400);
        Dimension coupe = new Dimension(100, 115, 220);
        Dimension targa = new Dimension(90, 150, 180);
        Dimension cabrio = new Dimension(99, 130, 190);
        Dimension minivan = new Dimension(80, 150, 230);
        Dimension suv = new Dimension(75, 125, 290);
        Dimension pickUp = new Dimension(80, 130, 320);

        ArrayList<Dimension> dimensionsList = new ArrayList<>();
        dimensionsList.add(hatchback);
        dimensionsList.add(sedan);
        dimensionsList.add(liftback);
        dimensionsList.add(kombi);
        dimensionsList.add(coupe);
        dimensionsList.add(targa);
        dimensionsList.add(cabrio);
        dimensionsList.add(minivan);
        dimensionsList.add(suv);
        dimensionsList.add(pickUp);
        return dimensionsList;
    }

    public ArrayList<Producent> generateListOfProducents() {

        ArrayList<Producent> producents = new ArrayList<>();
        producents.add(new Producent("BMW", "Active Tourer"));
        producents.add(new Producent("Toyota", "Yaris"));
        producents.add(new Producent("Opel", "Insignia"));
        producents.add(new Producent("BMW", "i4"));
        producents.add(new Producent("BMW", "X5"));
        producents.add(new Producent("Opel", "Astra"));
        producents.add(new Producent("BMW", "Gran Turismo"));
        producents.add(new Producent("Toyota", "Auris"));
        producents.add(new Producent("Honda", "Civic"));
        producents.add(new Producent("Hyundai", "Tuscon"));
        return producents;
    }

    public ArrayList<Car> generateListOfCars() {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car(generateListOfProducents().get(0), true, generateMarketList().get(0), "medium", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(1), false, generateMarketList().get(4), "standard", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(2), true, generateMarketList().get(1), "standard", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(3), true, generateMarketList().get(0), "premium", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(4), false, generateMarketList().get(2), "standard", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(5), false, generateMarketList().get(3), "standard", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(6), true, generateMarketList().get(1), "standard", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(7), false, generateMarketList().get(3), "medium", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(8), true, generateMarketList().get(1), "premium", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(9), true, generateMarketList().get(0), "premium", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(3), true, generateMarketList().get(3), "standard", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(5), false, generateMarketList().get(2), "premium", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(0), true, generateMarketList().get(4), "premium", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(7), false, generateMarketList().get(2), "standard", generateListOfDimensions()));
        carList.add(new Car(generateListOfProducents().get(4), false, generateMarketList().get(1), "medium", generateListOfDimensions()));
        return  carList;
    }
}
