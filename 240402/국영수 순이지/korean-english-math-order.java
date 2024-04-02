import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;

    Student (String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.kor + " " + this.eng + " " + this.math);
    }

    @Override
    public int compareTo(Student student) {
        if(this.kor == student.kor) {
            if(this.eng == student.eng) 
                return student.math - this.math;
            return student.eng - this.eng;
        }
        return student.kor - this.kor;
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