package lesson11;

public class MainClass {
    public static void main(String[] args){
        Fish fish = new Fish();
        Ship ship = new Ship();

        SwimExecutor swimExecutor = new SwimExecutor();
        swimExecutor.makeSwim(fish);
        swimExecutor.makeSwim(ship);
    }

}
