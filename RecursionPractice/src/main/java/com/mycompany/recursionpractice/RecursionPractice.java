package com.mycompany.recursionpractice;
import java.util.Scanner;
import java.util.ArrayList;

public class RecursionPractice {
    static String UserInput;

    public static void main(String[] args) {
        ShoppingList(new ArrayList<>());
    }

    public static void ShoppingList(ArrayList<Result> currentList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Shopping List");
        System.out.println("A. Tomato (20)");
        System.out.println("B. Fish (90)");
        System.out.println("C. Tiger (150)");
        System.out.println("Enter an item to add to cart");
        System.out.println("Enter 'Done' if you are done");
        UserInput = input.nextLine();

        if (UserInput.equalsIgnoreCase("Done")) {
            displayReceipt(currentList);
        } else {
            Result shoppingCart = ItemList(UserInput);
            currentList.add(shoppingCart);
            ShoppingList(currentList);
        }
    }

    public static Result ItemList(String letter) {
        switch (letter.toUpperCase()) {
            case "A":
                return new Result("Tomato ", 20);
            case "B":
                return new Result("Fish ", 90);
            case "C":
                return new Result("Tiger ", 150);
            default:
                return new Result("Invalid ", 0);
        }
    }

    public static void displayReceipt(ArrayList<Result> currentList) {
        Scanner input = new Scanner(System.in);
        double totalCost = 0;
        double UserCash = 0;
        double Change;
        System.out.println("Summary");
        for (Result result : currentList) {
            System.out.println(result.getMenuValue() + result.getPriceValue());
            totalCost += result.getPriceValue();
        }
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Enter Amount");
        UserCash = input.nextDouble();
        
        Change = UserCash - totalCost;
        
        if(UserCash >= totalCost){
            System.out.println("Sucessfully paid your change is: " + Change);
        
        }else{
            System.out.println("Not enough money enter another");
            displayReceipt(currentList);
       
        }
        
    }

    static class Result {
        private String MenuValue;
        private int PriceValue;

        public Result(String MenuValue, int PriceValue) {
            this.MenuValue = MenuValue;
            this.PriceValue = PriceValue;
        }

        public String getMenuValue() {
            return MenuValue;
        }

        public int getPriceValue() {
            return PriceValue;
        }
    }
}
