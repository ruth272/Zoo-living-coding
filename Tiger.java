public class Tiger extends Animal {
    int furColor;

    public Tiger(int weight, int furColor) {
        super(weight);                      //why super
        this.furColor = furColor;
    }

    public String toString() {
        return weight + " " + furColor;
    }

    public void feed(int food) {
        weight += (int)(food / 0.3);
    }
}
