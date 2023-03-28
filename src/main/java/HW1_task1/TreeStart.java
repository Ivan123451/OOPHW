package HW1_task1;
//1. Реализовать, с учетом ооп подхода, генеалогическое дерево Человек.
//Идея: описать некоторое количество компонент, например:
//модель человека
//компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение,
// брат, свекровь, сестра и т. д.
//компонент для проведения исследований
//дополнительные компоненты по желанию, например отвечающие за вывод данных в консоль, загрузку и сохранения
// в файл, получение\построение отдельных моделей человека
//Под “проведением исследования” можно понимать получение всех детей выбранного человека.
public class TreeStart {
    public static void main(String[] args) {
        Parents man = new Parents(2, 2, "Russian", "Ivanov");
        man.Hi();
        System.out.println("моя нациолнальность - " + man.getNationality());
        man.setNationality("Belarus");
        System.out.println("моя национальность поменялась, теперь я " + man.getNationality());

        System.out.println(man.toString());

        Childran man2 = new Childran(2, 2,"Indian", "Ivanov","Blue");

        System.out.println("_________________________________________");
        man2.HiCildran();
        System.out.println(man2.toString());
        man2.eyeColor = "Blue";
        System.out.println("А еще у меня цвет глаз - " + man2.eyeColor);


    }
}
