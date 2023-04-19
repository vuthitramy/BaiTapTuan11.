package BaiThucHanh2;

public class Cat extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "meo: meo meo";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
