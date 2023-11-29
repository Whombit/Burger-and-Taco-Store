public class Burger extends Food {

    //Instance variables for the burger
    private int patties;

    //No args  constructor for the burger
    public Burger() {
        patties = 2;
    }

    //Parameterized argument constructor for the burger
    public Burger(boolean meal, double price, int patties) {
        super(meal, price);
        this.patties = patties;
    }

    //Getters and setters for the burger
    public int getPatties() {
        return patties;
    }

    public void setPatties(int newPatties) {
        patties = newPatties;
    }

    //Prints the burger to console with the toString method
    public String toString() {
        return "Patty amount: " + getPatties() + "\n" + super.toString();
    }
}