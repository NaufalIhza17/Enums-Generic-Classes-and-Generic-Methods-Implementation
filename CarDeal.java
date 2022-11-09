package com.mycompany.section11;

/**
 *
 * @author M Naufal Ihza S
 */
public class CarDeal<T> {
    private T seat;
    
    public void setValue(T seats) {
        seat = seats;
    }
    
    public T getValue() {
        return seat;
    }
}
