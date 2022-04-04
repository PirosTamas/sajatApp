package hu.tomicompany.prog4.sajatapp.controller;


import hu.tomicompany.prog4.sajatapp.exception.NoTransmissionException;
import hu.tomicompany.prog4.sajatapp.model.Bicycle;
import hu.tomicompany.prog4.sajatapp.model.Car;
import hu.tomicompany.prog4.sajatapp.model.Vehicle;
import hu.tomicompany.prog4.sajatapp.service.BicycleService;
import hu.tomicompany.prog4.sajatapp.service.CarService;
import hu.tomicompany.prog4.sajatapp.util.IdProvider;

import java.util.ArrayList;
import java.util.List;

public class Control {
    private final BicycleService bicycleService;
    private final CarService carService;
    private final IdProvider idProvider = IdProvider.getInstance();


    public Control() {
        this.bicycleService = new BicycleService();
        this.carService = new CarService();
    }

    public void start() throws NoTransmissionException {
        List<String[]> dummyList = this.createDummyList();

        for(String[] raw: dummyList)
        {
            Vehicle vehicle = this.convertFromString(raw);
            this.doIT(vehicle);
        }
    }

    public List<String[]> createDummyList() {
        List<String[]> dummyList = new ArrayList<>();
        dummyList.add(new String[]{"B", "50", "Merida", "true"});
        dummyList.add(new String[]{"C", "150", "Suzuki", "manual"});
        dummyList.add(new String[]{"B", "30", "ShitCycle", "false"});
        dummyList.add(new String[]{"C", "250", "BMW", "manual"});
        dummyList.add(new String[]{"B", "63", "GoodCycle", "true"});
        dummyList.add(new String[]{"C", "300", "Lamborghini", "automatic"});
        return dummyList;
    }

    public Vehicle convertFromString(String[] row) throws NoTransmissionException {
        switch (row[0]) {
            case "B":
                return new Bicycle(this.idProvider.nextiD(), Integer.parseInt(row[1]), row[2], Boolean.parseBoolean(row[3]));
            case "C":
                return new Car(this.idProvider.nextiD(), Integer.parseInt(row[1]), row[2], row[3]);
            default:
                System.out.println("Valami nem jo");
        }

        return null;
    }

    private void doIT(Vehicle vehicle) {
        if(vehicle instanceof Bicycle)
        {
            this.bicycleService.pay((Bicycle) vehicle);
        }
        else if(vehicle instanceof Car)
        {
            this.carService.pay((Car) vehicle);
        }
        else{
            throw new RuntimeException("Unknown type of Client: " + vehicle);
        }
    }
}
