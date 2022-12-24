package lesson11;

public class Fish implements Swim{
    @Override
    public void swim(){
        eat();
        System.out.println("Я рыбка и я плыву!");
    }

    private void eat(){
        System.out.println("Я рыба и я ем");
    }

}
