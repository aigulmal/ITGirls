package lesson11;

public class Ship implements Swim{
    @Override
    public void swim(){
        fuel();
        System.out.println("Я корабль и я плыву!");
    }

    private void fuel(){
        System.out.println("Я корабль и я заправляюсь топливом");
    }

}
