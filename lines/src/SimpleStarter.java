import java.util.Scanner;

public class SimpleStarter
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String testStr = scan.next();
        String cat = "cat";
        String dog = "dog";
        int catCount = 0;
        int dogCount = 0;

        int start = testStr.indexOf(cat);
        while (start >= 0) {
            catCount++;
            start = testStr.indexOf(cat, start + 1);
        }

        start = testStr.indexOf(dog);
        while (start >= 0) {
            dogCount++;
            start = testStr.indexOf(dog, start + 1);
        }
        System.out.println("Cat:" + catCount);
        System.out.println("Dog:" + dogCount);

        System.out.println("RESULT:" + (catCount == dogCount));
    }
}
