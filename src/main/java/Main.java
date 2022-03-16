public class Main {

    public static void main(String[] args) {
        DataStorage dataStorage = new DataStorage();

        dataStorage.generateCountriesForBus();
        dataStorage.generateCountriesForBusiness();
        dataStorage.generateCountriesForCargo();
        dataStorage.generateCountriesForTaxi();
        dataStorage.generateCountriesForTransport();
        dataStorage.generateMarketList();
        dataStorage.generateListOfDimensions();
        dataStorage.generateListOfProducents();
        dataStorage.generateListOfCars();

        Car.displayCarsThatMeetTheRequirements(Car.filterCars(dataStorage.generateListOfCars()));
    }


}