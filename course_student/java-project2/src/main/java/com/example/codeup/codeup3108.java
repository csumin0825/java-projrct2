package com.example.codeup;

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

public class codeup3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }

    private boolean isExist(Student pStudent) { // addAStudent에서만 사용하기때문에 private으로
        // 중복 여부 check
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) return true;
        }
        return false;
    }

    private void deleteStudent(Student pStudent) {
        // pStudent가 students에 몇 번째에 있는지 알아야 함
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getTestId() == pStudent.getTestId()) students.remove(i);
        }
    }

    public void process(String pStudent) {
        String[] splited = pStudent.split(" ");
        Student student = makeAStudent(splited[0], Integer.parseInt(splited[1]), splited[2]); // 파싱하는 코드
        if ("I".equals(student.getCode())) {
            addAStudent(student);
        } else {
            deleteStudent(student);
        }
//        switch (student.getCode()) {
//            case "I" -> addAStudent(student);
//            case "D" -> deleteStudent(student);
//        }
    }

    private void addAStudent(Student student) {
        // 중복 체크한 후 넣는다.
        if (!isExist(student)) {
            students.add(student);
        }
    }

    private void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

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


//        String[] arr1 = sc.nextLine().split(" ");
//        int[] arr2 = new int[arr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = Integer.parseInt(arr1[i]);
//        }
//        codeup.printSpecificStudent(arr2);

//        codeup.process("I 1011 한라산");
//        codeup.process("I 999 백두산");
//        codeup.process("I 999 오대산");
//        codeup.process("D 999 백두산");
//        codeup.process("I 800 백두산");
//        codeup.process("D 500 한라산");
//        codeup.process("I 900 남산");
//        codeup.process("I 950 금강산");
//        codeup.process("I 1205 지리산");
//        codeup.process("I 700 북한산");
    }
}
