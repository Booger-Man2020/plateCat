public class Plate {

    public int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public int decreaseFood(int n) {
        if (this.food >= n) {
            this.food -= n;
        }
        return n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }


    public int fillPlate() {
        while (food != 100) {
            food++;
        }
        return food;

    }
}





