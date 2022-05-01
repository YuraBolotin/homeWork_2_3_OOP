package com.bolotin;

public interface Service {
    void check(Car car);
    void check(Truck truck);
    void check(Bicycle bicycle);

    void updateTyre();

    void checkEngine();
    void checkTrailer();
}

