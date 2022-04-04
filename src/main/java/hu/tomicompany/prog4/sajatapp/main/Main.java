package hu.tomicompany.prog4.sajatapp.main;

import hu.tomicompany.prog4.sajatapp.exception.NoTransmissionException;
import hu.tomicompany.prog4.sajatapp.model.Bicycle;
import hu.tomicompany.prog4.sajatapp.model.Car;
import hu.tomicompany.prog4.sajatapp.service.CarService;


public class Main {

    public static void main(String[] args) throws NoTransmissionException {
        Car car = new Car(1L, 100, "BMW", "automatic");
        System.out.println(car.toString());
        Bicycle merida = new Bicycle(2L, 30, "Merida", true);
        System.out.println(merida.toString());

        CarService carService = new CarService();
        carService.pay(car);

    }
}
