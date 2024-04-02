import java.util.*;

class Student implements Comparable<Student> {
    int height, weight, num;

    Student (int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    public void printInfo() {
        System.out.printf("%d %d %d\n", this.height, this.weight, this.num);
    }

    @Override
    public int compareTo(Student student) {
        if(this.height == student.height) {
            if(this.weight == student.weight) {
                return this.num - student.num;
            }
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] s = new Student[n];
        int cnt = 1;

        for(int i = 0; i < n; i ++) {
            s[i] = new Student(sc.nextInt(), sc.nextInt(), cnt ++);
        }

        Arrays.sort(s);

        for(int i = 0; i < n; i ++) {
            s[i].printInfo();
        }
    }
}