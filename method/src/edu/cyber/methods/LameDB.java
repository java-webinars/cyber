package edu.cyber.methods;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A database (DB) is an organized collection of data. In other words, a database is used by an organization
 * as a method of storing, managing and retrieving information.
 * <p>
 * Implement the lameDb() method
 * <p>
 * This method has 4 String parameters and returns a String
 * db: information in database. Each item is separated by a #. Each element will also have a number in the
 * beginning about which element it is.
 * op: action that will be taken on database (add, edit, or remove)
 * id: The id number that will be manipulated
 * data: extra data that will be used alongside operation
 * The method returns the modifed database
 * Examples:
 * <p>
 * m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
 * returns:  1etsy#2wooden#3spoon#4aaa
 * <p>
 * m.lameDb("1etsy#2wooden#3spoon","add","1","bbb")
 * returns:  1bbb#2etsy#3wooden#4spoon
 * <p>
 * m.lameDb("1test#2bla#3foo","edit","2","bbb")
 * returns:  1test#2bbb#3foo
 * <p>
 * m.lameDb("1tst#2bla#3foo","delete","1","")
 * returns:  2bla#3foo
 */

public class LameDB
{
    public static void main(String[] args) {
        String a1 = lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa");
        System.out.println(a1);

        String a2 = lameDb("1etsy#2wooden#3spoon","add","1","bbb");
        System.out.println(a2);

        String a3 = lameDb("1test#2bla#3foo","edit","2","bbb");
        System.out.println(a3);

        String a4 = lameDb("1tst#2bla#3foo","delete","1","");
        System.out.println(a4);
    }

    public static String lameDb(String db, String op, String id, String data) {
        // Разбить на части для удобства
        String[] dbArray = db.split("#");
//        System.out.println("INITIAL ARRAY:" + Arrays.toString(dbArray));

        // Избавляемася от ведущих цисел (впереди каждой строки)
        for (int i = 0; i < dbArray.length; i++) {
//            System.out.println("BEFORE:" + dbArray[i]);
            // 0 индекс = 1, 1 индекс = 2?  8 индекс = 9, 9 индекс = 10
            // Если i > 8, это значит, что число занимет ДВА первых символа
            // Если i <= 8, это значит, что число занимет ОДИН первый символ
            dbArray[i] = dbArray[i].substring(i > 8 ? 2 : 1);
//            System.out.println("AFTER:" + dbArray[i]);
        }
//        System.out.println("ARRAY WITHOUT NUMBERS:" + Arrays.toString(dbArray));

        ArrayList<String> result = new ArrayList<>();
        // Рпеобразовать строку в число - например "1" в 1 и отнять 1 для учета индекса,
        // который начинается с 0
        int idInt = Integer.parseInt(id) - 1;
        // Используем входной параметр"op" как имя операции
        switch (op) {
            case "add": result = addData(dbArray, idInt, data); break;
            case "edit": result = editData(dbArray, idInt, data); break;
            case "delete": result = deleteData(dbArray, idInt); break;
        }
//        System.out.println("RESULT:" + result);

        String sb = "";
        for(int i = 0; i < result.size(); i++) {
            String str = result.get(i);
            sb += i == 0 ? (i + 1) + str : "#" + (i + 1) + str;
        }
//        System.out.println(sb);

        return sb;
    }

    private static ArrayList<String> addData(String[] dbArray, int id, String data) {
        // Создали обхъект ArrayList
        ArrayList<String> addResult = new ArrayList<>();
        // Заполнили объектт из элементов array - dbArray
        for(String s : dbArray) {
            addResult.add(s);
        }
        // ДОбавлили новый жлемент data на указанную позицию id
        addResult.add(id, data);
        return addResult;
    }

    private static ArrayList<String> editData(String[] dbArray, int id, String data) {
        // Создали обхъект ArrayList
        ArrayList<String> editResult = new ArrayList<>();
        // Заполнили объектт из элементов array - dbArray
        for(String s : dbArray) {
            editResult.add(s);
        }
        // Заменили жлемент на другой - id и data
        editResult.set(id, data);
        return editResult;
    }

    private static ArrayList<String> deleteData(String[] dbArray, int id) {
        // Создали обхъект ArrayList
        ArrayList<String> deleteResult = new ArrayList<>();
        // Заполнили объектт из элементов array - dbArray
        for(String s : dbArray) {
            deleteResult.add(s);
        }
        // Удалили жлемент с номером id
        deleteResult.remove(id);
        return deleteResult;
    }
}
