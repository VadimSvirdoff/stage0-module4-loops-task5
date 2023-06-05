package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int size) {
        if(size == 0) {
            System.out.print("");
        }else{
            drawHourglass(size);
        }
    }

    private void drawHourglass(int size) {
        int count = 0;

        while (count < size) {
            if(size - count > 1) {
                printLine(count / 2, ' ');
                printLine(size - count, '8');
                printLine(count / 2, ' ');
                System.out.println("");
            }
            count = count + 2;
        }
        while (count >= 2) {
            printLine((count - 2) / 2, ' ');
            printLine(size - count + 2, '8');
            printLine((count - 2) / 2, ' ');
            count = count - 2;
                System.out.println("");
        }
    }

    private void printLine(int count, char symbol) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }
}
