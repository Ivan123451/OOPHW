package HW1_task1;

public class Childran extends Parents {

    String eyeColor;

    public Childran(int nunberOfHands, int numberOfLegs, String nationality, String famalyName, String eyeColor) {
        super(nunberOfHands, numberOfLegs, nationality, famalyName);


    }

    public void HiCildran() {
        System.out.println("Я класс ребенка");

    }
}
