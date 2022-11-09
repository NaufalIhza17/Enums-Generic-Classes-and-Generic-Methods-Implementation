package com.mycompany.section11;

/*
 * @author M Naufal Ihza S
 */

//ENUMERATION IMPLEMENTATION

public enum Car {
    BMW(85),
    TOYOTA(86),
    HYUNDAI(90),
    MERCEDES(88),
    PEUGEOT(82);
    
    int carRating;
    
    Car (int carRating) {
        this.carRating = carRating;
    }
    
}

