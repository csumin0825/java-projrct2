package com.example.javaproject2.week4.day4;

import java.util.*;

class Student {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
// Student Class
// 멤버변수 code, testId, name
// code, testId, name을 파라매터로 받는 생성자
// 각 멤버변수의 getter와 setter

public class codeup3108 {
    private List<Student> students = new ArrayList<>();
    // 타입이 Student인 ArrayList 선언

    public Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }
    // 새로운 Student 객체를 만든 후 return하는 메서드

    private boolean isExist(Student pStudent) {
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) return true;
        }
        return false;
    }
    // testId의 중복 여부를 확인하는 메서드 (중복이 있으면 true, 없으면 false)
    // addAStudent에서만 사용하기 때문에 private으로 선언
    // pStudent의 testId와 students 리스트 요소들의 testId를 비교한다.


    private void deleteStudent(Student pStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getTestId() == pStudent.getTestId()) students.remove(i);
        }
    }
    // students.get(i).getTestId() : students의 i(index)번째 Student객체의 testId
    // pStudent의 testId가 students 리스트에 있으면 remove(i) : i(index)번째 객체 삭제
    // private로 선언

    public void process(String pStudent) {
        String[] splited = pStudent.split(" ");
        Student student = makeAStudent(splited[0], Integer.parseInt(splited[1]), splited[2]); // 파싱하는 코드
        if ("I".equals(student.getCode())) {
            addAStudent(student);
        } else {
            deleteStudent(student);
        }
    }
    // String타입의 pStudent를 띄어쓰기 기준으로 split
    // ex) "I 1011 한라산" -> splited = ["I", "1011", "한라산"]
    // makeALine(String code, int testId, String name) 메서드 호출 : 새로운 Student객체 생성
    // student 객체의 code가 I이면 addAStudent() 메서드 호출
    // code가 I가 아니면 deleteStudent() 메서드 호출

    private void addAStudent(Student student) {
        if (!isExist(student)) {
            students.add(student);
        }
    }
    // student가 students 리스트에 있는지 확인(isExist() 메서드 호출) 후,
    // 없으면 students 리스트에 student 객체 추가

    private void printSpecificStudent(int[] arr) {
        // 정렬
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });

        // 출력
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s\n", student.getTestId(), student.getName());
        }
    }
    // students 리스트를 정렬
    // : 각 요소의 TestId를 비교하여 오름차순 정렬
    // arr 요소에 해당하는 인덱스의 student 객체를 get()
    // 객체의 testId와 name 출력

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        codeup3108 codeup = new codeup3108();
        for (int i = 0; i < size; i++) {
            codeup.process(sc.nextLine());
        }

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        codeup.printSpecificStudent(arr);
    }
    // size 입력받기
    // sc.nextLine() : 한 줄이 더 입력되는 에러 방지
    // codeup3108 객체 생성
    // size만큼 정보를 입력받고 process() 메서드 호출
    // 위치를 나타낼 정수 5번 입력받기
    // 입력받은 정수 list로 printSpecificStudent() 메서드 호출
}
