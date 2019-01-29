package entities;

public class Manager extends Person {
    private double weight;

    public Manager(String name, int age, Job job, double pay, double weight) {
        super(name, age, job, pay);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.weight;
    }
}
