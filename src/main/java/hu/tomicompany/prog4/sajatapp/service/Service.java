package hu.tomicompany.prog4.sajatapp.service;

import hu.tomicompany.prog4.sajatapp.model.Vehicle;

public interface Service <T extends Vehicle> {

    void pay(T vehicle);
}
