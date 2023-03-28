package HW1_task2;

public class LivingOrganizm {
    protected String name;
    protected int age;

    public LivingOrganizm(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialization(){
        System.out.println("Hi I'm Living Organizm");
    }
}
