package hu.tomicompany.prog4.sajatapp.repository;

import java.util.List;

public interface VehicleRepository<T> {
    List<T> listAll();
}
