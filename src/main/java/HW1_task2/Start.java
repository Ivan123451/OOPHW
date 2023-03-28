package HW1_task2;
//2.Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек. Какие члены должны быть
//у каждого из классов (у меня на семинаре студенты пришли к тому, чтобы продумать логику взаимодействия жена разрешает
//открыть дверцу шкафа мужу, после чего эту дверцу можно открыть)
//Подумать как описать логику взаимодействия человека и домашнего питомца. Сценарий: “Человек “зовёт” котика
//“кис-кис”, котик отзывается. Какое ещё взаимодействие может быть?

public class Start {
    public static void main(String[] args) {
        LivingOrganizm Igor = new Human("Igor", 33, "Ivanov", 1000000);
        System.out.println(Igor.toString());
        LivingOrganizm Murka = new Cat("Murka", 5, "white", "persian");
        System.out.println(Murka.toString());
        Igor.initialization();
        Murka.initialization();
        System.out.println("---------------------------------------------------------------");
        ((Human) Igor).zov((Cat) Murka);
        System.out.println("---------------------------------------------------------------");

        ((Cat) Murka).scratch((Human) Igor);


    }


}

