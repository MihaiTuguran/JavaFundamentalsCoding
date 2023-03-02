package ro.sda.fundamentals._6_classes.part_3;

public class Main {
    public static void main(String[] args) {

//        we created an instance of the class Wall(variable/ reference called wall1
        Wall wall1 = new Wall();
        Wall wall2 = new Wall(15, -2.98);
//        we called the setter for the width field on the instance that was previously created
        wall1.setWidth(-100);
//        we called the setter for the height field on the instance that was previously created
//        - using this setter we will initialize the field/attribute/instance variable height
//        of the instance (wall1) with the value is sent as a parameter
        wall1.setHeight(45);
        System.out.println("Width = " + wall1.getWidth());
        System.out.println("Width = " + wall2.getWidth() + " and Height is " + wall2.getHeight());

        System.out.println("Area is " + wall1.getArea());
        System.out.println("Area2 is " + wall2.getArea());
    }
}
