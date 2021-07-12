public class MarineObject
{
    protected double x = 0.0;
    protected double y = 0.0;
    protected double speed = 10.0;
    protected double course = 0.0;

    public void move() {
        x = x + speed * Math.cos(course);
        y = y + speed * Math.sin(course);
    }
}
