package dogs;

public class Dog
{
    private double height;
    private double weight;

    public Dog(double height, double weight) {
        if (height <= 0.0 || weight <= 0.0) {
            RuntimeException wp = new RuntimeException("Wrong parameters");
            throw wp;
        }
        this.height = height;
        this.weight = weight;
    }

    public void bark() {
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
