package lesson12;

public class Snake extends AbstractAnimal{
    @Override
    void voice(){
        System.out.println("Я змея и я шиплю");
    }
    @Override
    void walk(){
        System.out.println("Я змея и я умею только ползать");
    }

}
