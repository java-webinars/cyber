package dogs;

public class Senbernar extends Dog
{
    private String name;

    public Senbernar(double height, double weight, String name) {
        super(height, weight);
        this.name = name;
    }

    public void savePeople() {
    }

    public String getName() {
        return name;
    }
}
