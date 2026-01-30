import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        while (true) {
            System.out.print("Enter the size: ");
            size = in.nextInt();
            if (size < 1) {
                System.out.println("too small!");
                continue;
            }
            if (size > 5) {
                System.out.println("too big!");
                continue;
            }
            break;
        }

        int totalRows = 2 * size;
        for (int row = 0; row < totalRows; row++) {
            int mirrorRow = row < size ? row : (totalRows - 1 - row);
            int start = mirrorRow + 1;
            for (int col = 0; col < size; col++) {
                System.out.print(start + col);
            }
            for (int col = size - 1; col >= 0; col--) {
                System.out.print(start + col);
            }
            System.out.println();
        }
    }
}
