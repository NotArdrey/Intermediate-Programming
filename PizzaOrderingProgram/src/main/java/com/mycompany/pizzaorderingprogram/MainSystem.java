/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaorderingprogram;
import java.util.Scanner;
import java.util.ArrayList;

public class MainSystem {
    public static String UserInput, SelectPizza, Option;
    
    
    public static void MainMenu(ArrayList<Results> currentList){
    Scanner input = new Scanner(System.in); 
    
    System.out.println("Choose a type of pizza");
    System.out.println("A. Veggie");
    System.out.println("B. NonVeggie");
    SelectPizza = input.nextLine();

    
    if(SelectPizza.equalsIgnoreCase("A")){
        Veggie.VeggieMenu();
        System.out.println("\n Enter first type of topping");
        UserInput = input.nextLine();
        Results shoppingCart = VeggieList(UserInput);
        currentList.add(shoppingCart);
        System.out.println("Do you still want to add more? yes or no");
        Option = input.nextLine();
        
        if(Option.equalsIgnoreCase("yes")){
            Veggie.VeggieMenu();
            System.out.println("\n Enter second type of topping");
            UserInput = input.nextLine();
            currentList.add(shoppingCart);

        }else if(Option.equalsIgnoreCase("no")){
            System.out.println("Proceed to add ons");
        }else{
            System.out.println("Invalid please enter again");
            Veggie.VeggieMenu();
        }
     
    }else if(SelectPizza.equalsIgnoreCase("B")){
        NonVeggie.NonVeggieMenu();
        System.out.println("\n Enter first type of topping");
        UserInput = input.nextLine();
        Results shoppingCart = NonVeggieList(UserInput);
        currentList.add(shoppingCart);
        System.out.println("Do you still want to add more? yes or no");
        Option = input.nextLine();
        
        if(Option.equalsIgnoreCase("yes")){
            NonVeggie.NonVeggieMenu();
            System.out.println("\n Enter second type of topping");
            UserInput = input.nextLine();
            currentList.add(shoppingCart);

        }else if(Option.equalsIgnoreCase("no")){
            System.out.println("Proceed to add ons");
        }else{  
            System.out.println("Invalid please enter again");
            NonVeggie.NonVeggieMenu();

        }       
    }else{
        System.out.println("Invalid please enter again");
        MainMenu(currentList);

    }

    AddonsMenu();
    System.out.println("\n Enter first type of topping");
    UserInput = input.nextLine();
    Results shoppingCart = AddonsList(UserInput);
    currentList.add(shoppingCart);
    System.out.println("\nDo you still want to add more? yes or no");
    Option = input.nextLine();
    
        if(Option.equalsIgnoreCase("yes")){
            AddonsMenu();
            System.out.println("\n Enter second type of topping");
            UserInput = input.nextLine();
                if (currentList.contains(shoppingCart)) {
                    System.out.println("You have already added this add-on. Choose another.");
                      AddonsMenu();
                } else {
                  currentList.add(shoppingCart);
                }
            System.out.println("\nDo you still want to add more? yes or no");
            Option = input.nextLine();
    
            if(Option.equalsIgnoreCase("yes")){
                System.out.println("\n Enter third type of topping");
                UserInput = input.nextLine();
                currentList.add(shoppingCart);
                if (currentList.contains(shoppingCart)) {
                    System.out.println("You have already added this add-on. Choose another.");
                      AddonsMenu();
                } else {
                  currentList.add(shoppingCart);
                }                
            }

        }else if(Option.equalsIgnoreCase("no")){
            System.out.println("Transaction done");
            
        }else{
            System.out.println("Invalid please enter again");
            AddonsMenu();
        }
         
    System.out.println("Enter 'Done' if you are done");
    UserInput = input.nextLine();

    if (UserInput.equalsIgnoreCase("Done")) {
            displayReceipt(currentList);
        } else {
            MainMenu(currentList);  
        }
}
        public static void displayReceipt(ArrayList<Results> currentList) {
        Scanner input = new Scanner(System.in);
        double totalCost = 0;
        double UserCash = 0;
        double Change;
        System.out.println("Summary");
        for (Results result : currentList) {
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

    
    public static Results VeggieList(String letter) {
        switch (letter.toUpperCase()) {
            case "A":
                return new Results("Mushroom ", 10);
            case "B":
                return new Results("Onion ",    15);
            case "C":
                return new Results("Tomato ",   20);
            case "D":
                return new Results("Jalapenos ", 25);
            case "E":
                return new Results("Pineapple ", 25);
            default:
                return new Results("Invalid ", 0);
        }
    }
    public static Results NonVeggieList(String letter) {
        switch (letter.toUpperCase()) {
            case "A":
                return new Results("Pepperoni ", 10);
            case "B":
                return new Results("Sausage ",    15);
            case "C":
                return new Results("Bacon ",   20);
            case "D":
                return new Results("Ham ", 20);
            case "E":
                return new Results("Meatballs ", 25);
            default:
                return new Results("Invalid ", 0);
        }
    }
    public static Results AddonsList(String letter) {
        switch (letter.toUpperCase()) {
            case "A":
                return new Results("Extra Cheese ", 15);
            case "B":
                return new Results("Corn ",    15);
            case "C":
                return new Results("Roasted red peppers ",   20);
            case "D":
                return new Results("Fresh Herbs ", 20);
            case "E":
                return new Results("Pesto swirl ", 20);
            case "F":
                return new Results("BBQ Sauce ", 30);
            default:
                return new Results("Invalid ", 0);
        }
    }
    public static void AddonsMenu(){
    System.out.println("Choose 3 add-ons (Cannot be repeated)");
    System.out.println("A. Extra Cheese        (15)");
    System.out.println("B. Corn                (15)");
    System.out.println("C. Roasted red peppers (20)");
    System.out.println("D. Fresh Herbs         (20)");
    System.out.println("E. Pesto swirl         (20)");
    System.out.println("F. BBQ Sauce           (30)");

    }
      public static void verify(){
      Scanner input = new Scanner(System.in);
      System.out.println("Do you want to enter a new transaction yes or no?");
      String Option = input.nextLine();
      
      if(Option.equalsIgnoreCase("yes")){
          MainSystem.MainMenu(new ArrayList<>());    
      }else if(Option.equalsIgnoreCase("no")){
          System.out.println("transaction done");
      }else{
          verify();
      }
    
}
}

