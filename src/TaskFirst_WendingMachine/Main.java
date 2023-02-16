package TaskFirst_WendingMachine;

import TaskFirst_WendingMachine.Classes.*;

// На основе кода с урока добавить еще один класс продукта,
// (Молоко, шоколад ,и т.п., можно добавить несколько классов),
// они должны наследоваться от класса Product,
// надо переопределить метод toString и попробовать включить эти классы в VendingMachine,
// вывести список товаров из VendingMachine
public class Main {

    public static void main(String[] args) {

        WendingMachine store = new WendingMachine();

        store.addProduct(new Edible(1,"Lenin's" , 55.55 , true))
                .addProduct(new Edible(2,"Bred" , 11.11 , 3, 7))
                .addProduct(new Edible(6,"Choke-lad" , 98.76 ,true))
                .addProduct(new Drink(3,"K.O.-fii" , 22.22 , "caffeine" , 6.7))
                .addProduct(new Drink(4,"Al'gul" , 333.9 , "alcohol" , 42.5))
                .addProduct(new Drink(5,"Mealk" , 36.7 , "fat" , 2.5))
        ;

        System.out.println(store);

        System.out.println("searching for Lay's");
        System.out.println(store.findProduct("ys"));
        System.out.println("searching for Bred");
        System.out.println(store.findProduct("Bred"));

        System.out.println("buying Bred" );
        store.buy("Bred", 11.11);
        System.out.println(store);

        System.out.println("buying Mealk by token" );
        store.buy(5);
        System.out.println(store);

    }

}
