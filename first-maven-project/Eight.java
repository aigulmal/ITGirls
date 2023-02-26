import java.util.*;

public class Eight {
    void PrintFirst(LinkedList<String> programmingLanguages) {
        System.out.println(programmingLanguages);
        System.out.println(programmingLanguages.peekFirst());
        System.out.println(programmingLanguages.peekLast());
        System.out.println(programmingLanguages.pollFirst());
        System.out.println(programmingLanguages.pollLast());
    }

    LinkedList<String> First() {
        LinkedList<String> programmingLanguages = new LinkedList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add(1, "C++");
        programmingLanguages.addFirst("Python");
        programmingLanguages.addLast("Fortran");

        return programmingLanguages;
    }

    void Second() {
        HashMap<String, String> langAndName = new HashMap<>();
        langAndName.put("Java", "James");
        langAndName.put("C++", "Bjarne");
        langAndName.put("Python", "Guido");
        langAndName.put("Fortran", "John");

        for (Map.Entry<String, String> element : langAndName.entrySet()) {
            System.out.println(element);
        }

        Set<String> keys = langAndName.keySet();
        System.out.println("Языки программирования: " + keys);

        ArrayList<String> values = new ArrayList<>(langAndName.values());
        System.out.println("Программисты в компании: " + values);
    }

    void Third(LinkedList<String> linkedList) {
        Eight eight = new Eight();
        HashMap<Integer, String> Third = new HashMap<>();
        ArrayList<String> values = new ArrayList<>(linkedList);

        for (int i=0;i<values.size();i++)
        {
            Third.put(i, values.get(i));
        }

        for (Map.Entry<Integer,String> element : Third.entrySet()){
            System.out.println(element);
        }
    }


    public static void main(String[] args) {
        Eight eight = new Eight();
        //eight.PrintFirst(eight.First()); //1 задание
        //eight.Second(); //2 задание
        eight.Third(eight.First()); //3 задание
    }
}

