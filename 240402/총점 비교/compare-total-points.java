import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int s1, s2, s3;

    Student (String name, int s1, int s2, int s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void printInfo() {
        System.out.printf("%s %d %d %d\n", name, s1, s2, s3);
    }

    @Override
    public int compareTo(Student student) {
        return (this.s1 + this.s2 + this.s3) - (student.s1 + student.s2 + student.s3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] s = new Student[n];

        for(int i = 0; i < n; i ++) {
            s[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(s);

        for(int i = 0; i < n; i ++) {
            s[i].printInfo();
        }
    }
}