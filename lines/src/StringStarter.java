import java.util.Scanner;

public class StringStarter
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String testStr = scan.next();
//        String testStr = "aaabbbcccccddddeefffffffvvvvvvvvvvvvvvvvvvvvvvvvvvvv";

        char prevChar = 'A';
        String prevMaxStr = "";
        String curStr = "";

        for (int i = 0; i < testStr.length(); i++) {
            char curChar = testStr.charAt(i);
            if (i == 0) {
                prevChar = curChar;
                curStr = curStr + curChar;
            } else {
                if (curChar == prevChar) {
                    curStr = curStr + curChar;
                } else {
                    if(curStr.length() > prevMaxStr.length()) {
                        prevMaxStr = curStr;
                    }
                    curStr = "" + curChar;
                    prevChar = curChar;
                }
            }
        }
        if(curStr.length() > prevMaxStr.length()) {
            prevMaxStr = curStr;
        }

        System.out.println(prevMaxStr);
    }
}
