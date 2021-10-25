package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    List<Integer> heightsOfStudents = new ArrayList<>();

    public void addHeight(int height){
        heightsOfStudents.add(height);
    }

    public boolean isHeightsIncreasing(){
        for(int i = 1; i < heightsOfStudents.size();i++){
            if(heightsOfStudents.get(i-1)>heightsOfStudents.get(i)){
                return false;
            }
        }
        return true;
    }
}
