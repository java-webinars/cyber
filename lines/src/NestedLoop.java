public class NestedLoop
{
    public static void main(String[] args) {
        int size = 10;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if ( (col == 0) || (row == size - 1) || (col == row) ) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
