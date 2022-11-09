package com.mycompany.section11;

/*
 * @author M Naufal Ihza S
 */
public class Section11 {

    public static void main(String[] args) {
        System.out.println(Car.BMW);
        System.out.println("Car Rating -> " + Car.BMW.carRating);
        
        System.out.println(Car.TOYOTA);
        System.out.println("Car Rating -> " + Car.TOYOTA.carRating);
        
        System.out.println(Car.HYUNDAI);
        System.out.println("Car Rating -> " + Car.HYUNDAI.carRating);
        
        System.out.println(Car.MERCEDES);
        System.out.println("Car Rating -> " + Car.MERCEDES.carRating);
        
        System.out.println(Car.PEUGEOT);
        System.out.println("Car Rating -> " + Car.PEUGEOT.carRating);
    
        CarDeal<Integer> seeSeats = new CarDeal<>();
        CarDeal<String> lowHigh = new CarDeal<>();
        
        //pick a type of car
        seeSeats.setValue(7);
        lowHigh.setValue("High");
        
        
        CarList cl = new CarList();
        String[] mpvArray = {"Toyota Avanza", "Toyota Sienta"};
        String[] suvArray = {"Toyota Rush", "Toyota Fortuner"};
        
        if (seeSeats.getValue() > 5 && "High".equals(lowHigh.getValue())) {
            System.out.println("Choose MPV type of car");
            cl.printArray(mpvArray);
        } else {
            System.out.println("Choose SUV type of car");
            cl.printArray(suvArray);
        }
    }
    
    
}
