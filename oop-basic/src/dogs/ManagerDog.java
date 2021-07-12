package dogs;

import java.io.IOException;

public class ManagerDog
{
    public static void main(String[] args) {

        // Mandatory parameters for cionstructor
        Dog dog = new Dog(60.0, 40.0);
//        Dog dog = new Dog(0.0, 0.0);

        // Direct reference
        Senbernar s = new Senbernar(50.0, 40.0, "Spike");
        s.bark();
        s.savePeople();
        trim(s);

        // Upcasting
        Dog d;
        d = new Senbernar(50.0, 40.0, "Spike");
        d.bark();
        trim(d);

        if (d instanceof Senbernar) {
            // Downcasting
            Senbernar st = (Senbernar) d;
            st.savePeople();
            trim(st);
        }


        // Direct reference
        KavkazOvcharka ko = new KavkazOvcharka();
        // Upcasting - two steps up
        Dog od = new KavkazOvcharka();
        // Upcasting - one step up
        Ovcharka o = new KavkazOvcharka();

        // Error after downcasting
//        Ovcharka ovError = new Ovcharka();
//        KavkazOvcharka koError = (KavkazOvcharka) ovError;

        try {
            String line = readLineFromFile("asd");
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("OK");
    }

    public static void trim(Dog d) {
        System.out.println("Trim:" + d);
    }

    public static String readLineFromFile(String fileName) throws IOException {
        return readLineFromFileInternal(fileName);
    }

    public static String readLineFromFileInternal(String fileName) throws IOException {
        if (true) {
            IOException e = new IOException("Fignya");
            throw e;
        }
        return "12345";
    }
}
