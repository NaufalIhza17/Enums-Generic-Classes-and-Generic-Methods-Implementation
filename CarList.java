package com.mycompany.section11;

/*
 * @author M Naufal Ihza S
 */

public class CarList {
    public <T> void printArray(T[] array) {
        for (T arrayitem : array) {
            System.out.println(arrayitem);
        }
    }
}
