public abstract class Animal implements Comparable <Animal>{            //abstract bc its parent class and implements comparable bc it uses it 
    public static int numAnimals;        //public static bc we're going to increment it(bc of test case 3)
    protected int weight;               //why protected, bc of parent class

    public Animal(int weight) {         //put what is protected inside parenthisises
        this.weight = weight;           //why this?
        numAnimals++;                   //incrementing to pass text case
    }

    public int compareTo(Animal a) {            //from test cases
        if(this.weight == a.weight) {           //memorize all if statements
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

    public int getWeight() {            //from .getweight in test cases
        return weight;
    }
}
