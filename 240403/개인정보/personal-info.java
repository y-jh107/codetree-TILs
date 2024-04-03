import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.printf("%s %d %.1f", name, height, weight);
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[5];

        for(int i = 0; i < 5; i ++) {
            p[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        Arrays.sort(p);

        System.out.println("name");
        for(int i = 0; i < 5; i ++) {
            p[i].printInfo();
            System.out.println();
        }

        System.out.println();

        Arrays.sort(p, new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                return p2.height - p1.height;
            }
        });

        System.out.println("height");
        for(int i = 0; i < 5; i ++) {
            p[i].printInfo();
            System.out.println();
        }
    }
}