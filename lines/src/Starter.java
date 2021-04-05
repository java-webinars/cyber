import java.util.Scanner;

public class Starter
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String testStr = scan.next();
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < testStr.length(); i++) {
            char c = testStr.charAt(i);
            if (c == 'c'  && i < (testStr.length() - 1)) {
                i++;
                c = testStr.charAt(i);
                if (c == 'a' && i < (testStr.length() - 1)) {
                    c = testStr.charAt(++i);
                    if (c == 't') {
                        catCount++;
                    }
                }
            }
            if (c == 'd'  && i < (testStr.length() - 1)) {
                i++;
                c = testStr.charAt(i);
                if (c == 'o' && i < (testStr.length() - 1)) {
                    c = testStr.charAt(++i);
                    if (c == 'g') {
                        dogCount++;
                    }
                }
            }
        }

        System.out.println("Cat:" + catCount);
        System.out.println("Dog:" + dogCount);

        System.out.println("RESULT:" + (catCount == dogCount));
    }
}