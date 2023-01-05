package lesson12;

public class Zoo {
    public static void main(String[] args){
        Zookeeper zookeeper = new Zookeeper();

        Elephant elephant = new Elephant();
        Turtle turtle = new Turtle();
        Snake snake = new Snake();

        System.out.println("Сейчас смотритель за животными попросит выполнить команду ГОЛОС");
        System.out.println("----------------------------");
        zookeeper.makeVoice(elephant);
        System.out.println("----------------------------");
        zookeeper.makeVoice(turtle);
        System.out.println("----------------------------");
        zookeeper.makeVoice(snake);
        System.out.println("");
        System.out.println("Сейчас смотритель за животными попросит выполнить команду ХОДИТЬ");
        System.out.println("----------------------------");
        zookeeper.makeWalk(elephant);
        System.out.println("----------------------------");
        zookeeper.makeWalk(turtle);
        System.out.println("----------------------------");
        zookeeper.makeWalk(snake);
    }
}
