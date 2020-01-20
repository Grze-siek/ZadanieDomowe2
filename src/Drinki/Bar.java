package Drinki;

public class Bar {
    public static void main(String[] args) {

        Drink drink1 = new Drink();
        drink1.drinkName = "Ostry kac";
        drink1.drinkPrice = 20;
        drink1.isWhitAlkohol = true;

        drink1.ingredient1 = new Ingredient();
        drink1.ingredient1.ingredientName = "orange juice";
        drink1.ingredient1.ingredientQuantityInMililiters = 50;

        drink1.ingredient2 = new Ingredient();
        drink1.ingredient2.ingredientName = "tequilla";
        drink1.ingredient2.ingredientQuantityInMililiters = 30;

        drink1.ingredient3 = new Ingredient();
        drink1.ingredient3.ingredientName = "vodka";
        drink1.ingredient3.ingredientQuantityInMililiters = 20;

        drink1.capacity = drink1.ingredient1.ingredientQuantityInMililiters + drink1.ingredient2.ingredientQuantityInMililiters + drink1.ingredient3.ingredientQuantityInMililiters;

        Drink drink2 = new Drink();
        drink2.drinkName = "Baby drink";
        drink2.drinkPrice = 12;
        drink2.isWhitAlkohol = false;

        drink2.ingredient4 = new Ingredient();
        drink2.ingredient4.ingredientName = "water";
        drink2.ingredient4.ingredientQuantityInMililiters = 45;

        drink2.ingredient5 = new Ingredient();
        drink2.ingredient5.ingredientName = "apple juice";
        drink2.ingredient5.ingredientQuantityInMililiters = 40;

        drink2.ingredient6 = new Ingredient();
        drink2.ingredient6.ingredientName = "coconut juice";
        drink2.ingredient6.ingredientQuantityInMililiters = 25;

        drink2.capacity = drink2.ingredient4.ingredientQuantityInMililiters + drink2.ingredient5.ingredientQuantityInMililiters + drink2.ingredient6.ingredientQuantityInMililiters;

        System.out.println("Lista drinków:");
        System.out.println();
        System.out.println("1. " + drink1.drinkName);
        System.out.printf("1.1 Cena: %d zł\n", drink1.drinkPrice);
        System.out.println("1.2 Składniki: " + drink1.ingredient1.ingredientName + ", " + drink1.ingredient2.ingredientName + ", " + drink1.ingredient3.ingredientName);
        System.out.printf("1.3 Czy drink jest alkoholowy: %b\n", drink1.isWhitAlkohol);
        System.out.println("1.4 Pojemność drinka: " + drink1.capacity + " ml");
        System.out.println();
        System.out.println("2. " + drink2.drinkName);
        System.out.printf("2.1 Cena: %d zł\n", drink2.drinkPrice);
        System.out.println("2.2 Składniki: " + drink2.ingredient4.ingredientName + ", " + drink2.ingredient5.ingredientName + ", " + drink2.ingredient6.ingredientName);
        System.out.printf("2.3 Czy drink jest alkoholowy: %b\n", drink2.isWhitAlkohol);
        System.out.println("2.4 Pojemność drinka: " + drink2.capacity + " ml");

    }
}
