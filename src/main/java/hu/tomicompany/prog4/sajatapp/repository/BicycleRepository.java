package hu.tomicompany.prog4.sajatapp.repository;

import hu.tomicompany.prog4.sajatapp.model.Bicycle;
import hu.tomicompany.prog4.sajatapp.model.Vehicle;

import java.util.List;

public class BicycleRepository implements VehicleRepository<Bicycle> {
    @Override
    public List<Bicycle> listAll() {
        return null;
    }
}
