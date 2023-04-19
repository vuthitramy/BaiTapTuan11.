package BaiThucHanh2;

import BaiThucHanh2.Animal;
import BaiThucHanh2.Cat;
import BaiThucHanh2.Edible;


public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[1];
        animals[0] = new Cat();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Cat) {
                Cat edibler = (Cat) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
