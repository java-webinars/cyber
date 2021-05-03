package edu.cyber.methods;

public class CountLetters
{
    public static void main(String[] args) {
        String source = "aaaddeeerrffdddaabbccffrree";
        String[] charsSource = source.split("");
        String result = "";

        for (String tested : charsSource) {
            int count = 0;
            if (!result.contains(tested)) {
                for (String current : charsSource) {
                    if (current.equals(tested)) {
                        count++;
                    }
                }
                result += count + tested;
            }
        }

        System.out.println(result);
    }
}
