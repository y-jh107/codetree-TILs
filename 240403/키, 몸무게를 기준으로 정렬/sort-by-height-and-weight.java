import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.printf("%s %d %d\n", name, height, weight);
    }

    @Override
    public int compareTo(Person person) {
        if(this.height == person.height) {
            return person.weight - this.weight;
        }

        return this.height - person.height;
    } 
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] p = new Person[n];

        for(int i = 0; i < n; i ++) {
            p[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(p);

        for(int i = 0; i < n; i ++) {
            p[i].printInfo();
        }
    }
}