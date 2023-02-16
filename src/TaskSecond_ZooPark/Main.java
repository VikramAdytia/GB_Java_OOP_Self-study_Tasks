package TaskSecond_ZooPark;
//Реализовать абстрактный класс Animal и его наследники
// Cat, Dog, и прочее. Родитель имеет в себе общие данные
// (пример: кличка, количествор лап, какие звуки издают и тд),
// а наследники собственные параметры (тип перемещения).
// Можно сделать дополнительную абстракцию, хищники и травоядные

import TaskSecond_ZooPark.Zoo.*;
import TaskSecond_ZooPark.Zoo.Animals.*;

import java.util.List;

// Создать интерфейс, скорость плаванья
//Добавить новое животное, способное плавать
//Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
public class Main {
    public static void main(String[] args) {

        Zoo zoopark = new Zoo();
        zoopark.addAnimals(List.of(new Tulpa("i") ,
                new Cat("Whale"),
                new Dog("Ladybug"),
                new Duck( "Trump"),
                new Crab( "Mr. Eugene Harold Krabbs"),
                new Fish("Mone")
                , new Parrot("Donkey")
                ));

        for (HasVocal item : zoopark.getVocals()) {
            System.out.println(item.sound() );
        }

        for (Animal item : zoopark.getAnimals()) {
            System.out.println(item);
        }

        separator();
        System.out.println(zoopark.getFastestRunner());

        //separator();
        //System.out.println(zoopark.getFastestFlyer());

        //separator();
        //System.out.println(zoopark.getFastestSwimmer());

        separator();
        System.out.println("the loudest is");
        System.out.println(zoopark.getLoudest());

    }

    private static void separator() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}