package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> name = new ArrayList<>();

    public boolean addStudent(String studentName){
        for(int i = 1;i< studentName.length();i++){
            if(studentName.indexOf(" ")> 0){
                name.add(studentName);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Journal journal = new Journal();
        System.out.println(journal.addStudent("Adam Kiss"));
        System.out.println(journal.name);
        System.out.println(journal.addStudent("John"));
        System.out.println(journal.name);
    }
}
