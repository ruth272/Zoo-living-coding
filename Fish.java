public class Fish extends Animal {
    int numFins;

    public Fish(int weight, int numFins) {
        super(weight);
        this.numFins = numFins;
    }

    public String toString() {
        return weight + " " + numFins;
    }

    public void feed(int food) {
        weight += (int)(food * 0.5 +11);
    }
}
