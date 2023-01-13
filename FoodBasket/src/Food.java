//Code written by Meagan Townsend
//PROG1400/3031 - Intro to OOP
//Exercise 01 - Food Basket
//IT-Programming
//13-01-2023


public class Food {

    //Food properties
    private String foodName;
    public String foodType;
    private String color;
    private String size;
    private String shape;
    private int numofServings;

    //CONSTRUCTOR method
    public Food(String foodName, String foodType, String color, String size, String shape, int numofServings) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.color = color;
        this.size = size;
        this.shape = shape;
        this.numofServings = numofServings;

    }

    public void eatIt() {
        this.foodName = foodName;
        System.out.println("");
        System.out.println("The" + this.size +"" + this.shape + "" + this.foodName + " is"+ foodType +" and I will eat it up!");
    }

    public void denyIt() {
        this.foodName = foodName;
        System.out.println("");
        System.out.println("The" + this.size + "" + this.shape + "" + this.foodName + " is"+ foodType +" and I can't eat it.  I'm lactose intolerant!");
    }
}