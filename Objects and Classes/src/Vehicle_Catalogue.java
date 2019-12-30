import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle_Catalogue {

    static class Vehicals {
        private String type;
        private String model;
        private String color;
        private int horsepower;

        public String getType() {
            return type;
        }
        //за промяна при входна дума само с малки букви, да стане думата с първа главна
//        type = type.replace(type.charAt(0), Character.toUpperCase(type.charAt(0)));
        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Integer getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(Integer horsepower) {
            this.horsepower = horsepower;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicals> vehicalForPrint = new ArrayList<>();

        String[] vehical = scanner.nextLine().split(" ");

        while (!vehical[0].equals("End")) {

            Vehicals car = new Vehicals();
            car.setType(vehical[0]);
            car.setModel(vehical[1]);
            car.setColor(vehical[2]);
            car.setHorsepower(Integer.parseInt(vehical[3]));

            vehicalForPrint.add(car);

            vehical = scanner.nextLine().split(" ");
        }


        String typeVehical = scanner.nextLine();

        List<String> modelForPrint = new ArrayList<>();
        while (!typeVehical.equals("Close the Catalogue")) {

            modelForPrint.add(typeVehical);

            typeVehical = scanner.nextLine();
        }
        ModelVehicles(vehicalForPrint, modelForPrint);
        HorsepowerVehicles(vehicalForPrint);
    }

    public static void ModelVehicles(List<Vehicals> vehical, List<String> model) {
        for (String m : model) {
            for (Vehicals veh : vehical) {
                if (veh.getType().equals("truck")) {
                    if (veh.getModel().equals(m)) {
                        System.out.printf("Type: Truck%nModel: %s%nColor: %s%nHorsepower: %d%n", veh.getModel(), veh.getColor(), veh.getHorsepower());
                    }
                } else {
                    if (veh.getModel().equals(m)) {
                        System.out.printf("Type: Car%nModel: %s%nColor: %s%nHorsepower: %d%n", veh.getModel(), veh.getColor(), veh.getHorsepower());
                    }
                }
            }
        }
    }

    public static void HorsepowerVehicles(List<Vehicals> vehical) {
        Double horsepowerCar = 0.0;
        int counterCar = 0;
        Double horsepowerTruck = 0.0;
        int counterTruck = 0;
        for (Vehicals veh : vehical) {
            if (veh.getType().equals("car")) {
                horsepowerCar += veh.getHorsepower();
                counterCar += 1;
            } else if (veh.getType().equals("truck")) {
                horsepowerTruck += veh.getHorsepower();
                counterTruck += 1;
            }
        }
        Double avrHorsePowerCar = 0.0;
        Double avrHorsePowerTruck = 0.0;
        if (counterCar !=0){
            avrHorsePowerCar = horsepowerCar / counterCar;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", avrHorsePowerCar);
        if (counterTruck !=0){
            avrHorsePowerTruck = horsepowerTruck / counterTruck;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avrHorsePowerTruck);
    }
}
