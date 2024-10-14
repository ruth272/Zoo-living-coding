public class Fish extends Animal {
    private int numFins;            //so it can only be accessed in this class

    public Fish(int weight, int numFins) {
        super(weight);
        this.numFins = numFins;
    }

    public String toString() {              //from .toString in test cases
        return weight + " " + numFins;
    }

    public void feed(int food) {            //from zoo
        weight += (int)(food * 0.5 +11);
    }
}
