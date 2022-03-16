import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Country poland = new Country("Poland", 'P');
        Country france = new Country("France", 'F');
        Country germany = new Country("Germany", 'D');
        Country spain = new Country("Spain", 'E');
        Country denmark = new Country("Denmark", 'D');


        ArrayList<Country> countriesForBusiness = new ArrayList<>();
        countriesForBusiness.add(poland);
        countriesForBusiness.add(france);
        countriesForBusiness.add(germany);

        ArrayList<Country> countriesForCargo = new ArrayList<>();
        countriesForCargo.add(spain);
        countriesForCargo.add(denmark);
        countriesForCargo.add(poland);

        ArrayList<Country> countriesForTransport = new ArrayList<>();
        countriesForTransport.add(france);
        countriesForTransport.add(denmark);
        countriesForTransport.add(poland);


        ArrayList<Country> countriesForTaxi = new ArrayList<>();
        countriesForTaxi.add(france);
        countriesForTaxi.add(germany);
        countriesForTaxi.add(spain);

        ArrayList<Country> countriesForBus = new ArrayList<>();
        countriesForBus.add(poland);
        countriesForBus.add(denmark);
        countriesForBus.add(spain);


        Market marketBusiness = new Market("business", countriesForBusiness);
        Market marketCargo = new Market("cargo", countriesForCargo);
        Market marketTransport = new Market("transport", countriesForTransport);
        Market marketTaxi = new Market("taxi", countriesForTaxi);
        Market marketBus = new Market("bus", countriesForBus);


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


        Producent bmwActiveTourer = new Producent("BMW", "Active Tourer");
        Producent toyotaYaris = new Producent("Toyota", "Yaris");
        Producent opelInsignia = new Producent("Opel", "Insignia");
        Producent bmwI4 = new Producent("BMW", "i4");
        Producent bmwX5 = new Producent("BMW", "X5");
        Producent opelAstra = new Producent("Opel", "Astra");
        Producent bmwGranTurismo = new Producent("BMW", "Gran Turismo");
        Producent toyotaAuris = new Producent("Toyota", "Auris");
        Producent hondaCivic = new Producent("Honda", "Civic");
        Producent hyundaiTuscon = new Producent("Hyundai", "Tuscon");


        Car car1 = new Car(bmwActiveTourer, true, marketBusiness, "medium",dimensionsList );
        Car car2 = new Car(toyotaYaris, false,marketBus, "standard",dimensionsList);
        Car car3 = new Car(opelInsignia,true,marketCargo,"standard", dimensionsList);
        Car car4 = new Car(bmwI4, true,marketBusiness, "premium", dimensionsList);
        Car car5 = new Car(bmwX5,false,marketTransport, "standard", dimensionsList);
        Car car6 = new Car(opelAstra,false,marketTaxi, "standard",dimensionsList);
        Car car7 = new Car(bmwGranTurismo,true,marketCargo, "standard", dimensionsList);
        Car car8 = new Car(toyotaAuris,false,marketTaxi, "medium", dimensionsList);
        Car car9 = new Car(hondaCivic,true,marketCargo,"premium", dimensionsList);
        Car car10 = new Car(hyundaiTuscon,true,marketBusiness, "premium", dimensionsList);
        Car car11 = new Car(bmwI4,true,marketTaxi, "standard", dimensionsList);
        Car car12 = new Car(opelAstra,false,marketTransport, "premium", dimensionsList);
        Car car13 = new Car(bmwActiveTourer,true,marketBus, "premium", dimensionsList);
        Car car14 = new Car(toyotaAuris,false,marketTransport,"standard",dimensionsList);
        Car car15 = new Car(bmwX5,false,marketCargo,"medium", dimensionsList);


        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);

        Car.displayCarsMeetingTheConditions(Car.filterCars(carList));


    }
}
