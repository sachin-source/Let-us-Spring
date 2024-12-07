package car.example.constructor.injection;

public class Car {
    private Specification specification;

    public void displayDetails(){
        System.out.println( "Car details : " + specification.toString());
    }
}
