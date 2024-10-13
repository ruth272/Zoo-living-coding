public class Animal {
    public static int numAnimals;
    protected int weight;               //why protected?

    public Animal(int weight) {
        this.weight = weight;           //why this?
        numAnimals++;                   //incrementing to pass text case
    }

    public int compareTo(Animal a) {
        if(this.weight == a.weight) {
            return 0;
        }
        else if(this.weight > a.weight) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public void move(int distance) {
        weight -= 0.1 * distance;
    }

    public int getWeight() {
        return weight;
    }
}
