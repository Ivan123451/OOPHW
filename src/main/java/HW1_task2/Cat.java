package HW1_task2;

public class Cat extends LivingOrganizm {

    String collor;
    String breed;


    public Cat(String name, int age, String collor, String breed) {
        super(name, age);
        this.collor = collor;
        this.breed = breed;
    }
    public void Myau() {
        System.out.println("Мяу-Мяу");

    }
    public void scratch(Human man){
        System.out.println("Царап царап диван");
        man.swearing();

    }

    @Override
    public String toString() {
        return "Я кошка " +
                "collor='" + collor + '\'' +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ' ';
    }
}
