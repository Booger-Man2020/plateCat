public class Cat {

    public int appetite;
    private String name;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        boolean satyety = satiety;
    }

    public void eat(Plate p) {
        if (this.appetite <= p.food) {
            p.decreaseFood(appetite);
        }
    }


    public int getAppetite() {
        return appetite;
    }

    private void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean satiety(Plate p) {
        boolean c = (p.food - appetite >= 0);
        return c;
    }

//
}





