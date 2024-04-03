import java.util.*;
class Student implements Comparable<Student> {
    int height, weight, num;

    public Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    public void printInfo() {
        System.out.printf("%d %d %d\n", height, weight, num);
    }

    @Override
    public int compareTo(Student s) {
        if(this.height == s.height) {
            return s.weight - this.weight;
        }

        return this.height - s.height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] s = new Student[n];

        for(int i = 0; i < n; i ++) {
            s[i] = new Student(sc.nextInt(), sc.nextInt(), i + 1);
        }

        Arrays.sort(s);

        for(int i = 0; i < n; i ++) {
            s[i].printInfo();
        }
    }
}