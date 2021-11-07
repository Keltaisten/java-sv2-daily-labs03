package day04;

public class Sultan {
    public static void main(String[] args) {
        Prison prisonBreak = new Prison();
        prisonBreak.openFreeCells();
        System.out.println(prisonBreak.openedDoors);
    }
}
