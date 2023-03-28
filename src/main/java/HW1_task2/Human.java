package HW1_task2;

public class Human extends LivingOrganizm {

    String FamalyName;
    int monthlyIncome;

    public Human(String name, int age, String famalyName, int monthlyIncome) {
        super(name, age);
        FamalyName = famalyName;
        this.monthlyIncome = monthlyIncome;
    }

    public void zov(Cat ZovCat) {
        System.out.println("Кис-кис-кис");
        ZovCat.Myau();
    }
    public void swearing(){
        System.out.println("Плохая кошка");
    }


    @Override
    public String toString() {
        return " Я человек " +
                "FamalyName='" + FamalyName + '\'' +
                ", name='" + name + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                ", age=" + age +
                '}';
    }
}
