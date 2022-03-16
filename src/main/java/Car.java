import java.util.ArrayList;

public class Car {

    private Producent producent;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private ArrayList<Dimension> dimensions;

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public Producent getProducent() {
        return producent;
    }

    public Market getMarket() {
        return market;
    }

    public int getValuesOfTrankCapacity() {
        int value = 0;
        for (Dimension dimensionElement : dimensions) {
            value = dimensionElement.getTrankCapacity();
        }
        return value;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public static ArrayList<Car> filterCars(ArrayList<Car> carList) {
        ArrayList<Car> filteredCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getProducent().getModel().equals("BMW")) {
                if (car.isAutomaticGear()) {
                    if (car.getValuesOfTrankCapacity() > 300) {
                        filteredCarList.add(car);
                    }
                }
            }
        }
        return filteredCarList;
    }

    public static void displayCarsMeetingTheConditions(ArrayList<Car> carList){

        for (Car car : carList){
            System.out.println(car.getProducent().getModel()+","+car.getProducent().getType()+" has meet the requirements and"+" "+"is available on"+" "+car.getMarket().getName()+" market. Car can be ordered in countries displayed on list below:");
            Country.getElementsFromCountryList(car.getMarket().getCountries());
            System.out.println();
        }
    }
}

