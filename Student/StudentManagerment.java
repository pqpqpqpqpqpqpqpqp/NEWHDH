package Student;

import java.util.Scanner;

public class StudentManagerment {
    Student[] stus = new Student[10];
    Scanner sc = new Scanner(System.in);
    private int cnt = 0;
    Student stu = new Student();

    public void delete() {
        if (cnt == 0) {
            System.out.println("삭제할 것이 없습니다.");
        } else {
            System.out.println("삭제할 이름을 말하세요.");
            String stuName = sc.next();
            for (int i = 0; i < cnt; i++) {
                if (stus[i].getName().equals(stuName)) {
                    stus[i].setName("null");
                }
            }
        }
    }
}