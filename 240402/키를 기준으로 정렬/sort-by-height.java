import java.util.*;
class Person implements Comparable<Person> {
    String name;
    int height, weight;

    Person (String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        if(this.height > person.height) return 1;
        else if(this.height == person.height) return 0;
        else return -1;
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
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight);
        }
    }
}