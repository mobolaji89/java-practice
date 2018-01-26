package classesobjectsandmethods;

public class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon
    
    // constructor for Vehicle class
    Vehicle (int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    
    // calculate and return the range
    int range() {
        return mpg * fuelcap;
    }
    
    // calculate fuel necessary for given distance
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
