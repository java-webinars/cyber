public class Simple
{
    public static void main(String[] args) {
        Submarine sub1 = new Submarine();
        Torpedo t1 = new Torpedo();
        Torpedo t2 = new Torpedo();

        Submarine sub2;
        sub2 = new Submarine();
        MarineObject mo;
        mo = sub2;
        


        for (int i = 0; i < 1800; i++) {
            sub1.getInfo(sub2);
            sub1.sendNewCourse(t1);
            sub1.sendNewCourse(t2);

            sub1.calculateCourse();
            sub1.move();
            sub2.calculateCourse();
            sub2.move();

            t1.move();
            t2.move();

            if (t1.foundOut(sub2) || t2.foundOut(sub2)) {
                break;
            }
        }
    }
}
