package HW1_task1;

public class Parents {
    private int nunberOfHands;
    private int numberOfLegs;
    private String nationality;
    private String famalyName;

    public void Hi() {
        System.out.println("Привет, я Человек");
    }

    public Parents(int nunberOfHands, int numberOfLegs, String nationality, String famalyName) {
        this.nunberOfHands = nunberOfHands;
        this.numberOfLegs = numberOfLegs;
        this.nationality = nationality;
        this.famalyName = famalyName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Подробнее про меня " +
                "Количестов рук= " + nunberOfHands +
                ", Количествро ног= " + numberOfLegs +
                ", национальнсоть = '" + nationality + '\'' +
                ", фамилия = '" + famalyName + '\'' +
                ' ';
    }
}
