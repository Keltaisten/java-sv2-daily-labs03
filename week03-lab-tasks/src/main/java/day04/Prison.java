package day04;

import java.util.ArrayList;
import java.util.List;

public class Prison {
    int numberOfDoors = 100;
    List<Integer> openedDoors = new ArrayList<>();

    public void openFreeCells(){
        for(int i = 1; i<numberOfDoors;i++){
            if(i*i<=numberOfDoors) {
                openedDoors.add(i * i);
            }
        }
    }
}
