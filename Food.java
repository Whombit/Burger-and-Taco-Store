public class Food {

    //instance variables for the food superclass
    private boolean meal;
    private double price;

    //no args constructor for the food superclass
    public Food() {
        this(false, 1.90);
    }

    //Parameters for the food superclass
    public Food(boolean meal, double price) {
        this.meal = meal;
        this.price = price;
    }

    //Getters for the food superclass
    public boolean getIsMeal() {
        return meal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void setMeal(boolean newMeal){
        meal = newMeal;
    }

    //Prints the food superclass to console with the toString method
    //This method is called by the subclasses when they print toString to minimize redundancy
    public String toString() {
        return "Price: " + getPrice() + "\nIs it a meal: " + getIsMeal();
    }
}