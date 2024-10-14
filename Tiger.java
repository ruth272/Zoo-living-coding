public class Tiger extends Animal {
    private String furColors;       //so it can only be accessed in this class

    public Tiger(int weight, String furColors) {
        super(weight);                      //super bc its calling from the animal class
        this.furColors = furColors;         //
    }

    public String toString() {                  //from .toString in test cases
        return weight + " " + furColors;
    }

    public void feed(int food) {            //from zoo
        weight += (int)(food / 0.3);
    }
}
