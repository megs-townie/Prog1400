//Code written by Meagan Townsend
//PROG1400/3031 - Intro to OOP
//Exercise 01 - Food Basket
//IT-Programming
//13-01-2023


public class Main {
    public static void main(String[] args) {


        //Instantiating 3 different foods
        Food dairy = new Food(" Cheddar"," dairy", " orange", " small" ,
                " chunk", 2);

        Food protein = new Food(" Roast"," protein", " brown", " medium",
                " round", 6);

        Food veggies = new Food(" Cucumber"," veggie", " green", " medium",
                " round",6);

        Food[] picnicBasket = new Food[] {dairy, protein, veggies};

        //Using a for loop to check each array index
        for (int i = 0; i < picnicBasket.length; i++) {
            Food currentFood = picnicBasket[i];

       // If/Else statement to check food type and use either the eatIt or denyIt method based on food type
            if (currentFood.foodType == dairy.foodType){
                    currentFood.denyIt();}
            else {currentFood.eatIt();}
        }
    }
}