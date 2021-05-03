package edu.cyber.methods;

/**
 * 1. Берем символы из обеих строк до тех пор пока одна из строк не закончится.
 * 2. Куда-то прибавляем символ из 1-й и 2-й
 * <p>
 * 3. Если не равны по длине
 * 3.1 Если первая длиннее, берем остаток первой
 * Иначе берем остаток второй
 * 3.2 Куда-то прибавляем остаток
 */

public class MergeStrings
{
    public static void main(String[] args) {
        String str1 = "ace";
        String str2 = "bdfhjklmno";
        String result = "";

        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            result += "" + str1.charAt(i) + str2.charAt(i);
        }
        if (str1.length() != str2.length()) {
            result += str1.length() > str2.length() ?
                    str1.substring(str2.length()) : str2.substring(str1.length());
//            if (str1.length() > str2.length()) {
//                result += str1.substring(str2.length())~;
//            } else {
//                String extra = str2.substring(str1.length());
//                result += extra;
//            }
        }

        System.out.println(result);
    }
}

