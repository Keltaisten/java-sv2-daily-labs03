package day01;

public class School {
    public static void main(String[] args) {
        Students student = new Students();

        student.addHeight(165);
        student.addHeight(167);
        student.addHeight(175);

        System.out.println(student.isHeightsIncreasing());

    }
}
