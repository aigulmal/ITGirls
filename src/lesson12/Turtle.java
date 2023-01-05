package lesson12;

public class Turtle extends AbstractAnimal{
    @Override
    void  voice(){
        System.out.println("Я черепаха и я молчу");
    }
    @Override
    void walk(){
        super.walk();
        System.out.println("Я черепаха и умею не только ходить, но и плавать"); //переопределяем walk
    }
}
