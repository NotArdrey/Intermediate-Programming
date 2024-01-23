/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaorderingprogram;

    public class Results extends MainSystem{
        private String MenuValue;
        private int PriceValue;

        public Results(String MenuValue, int PriceValue) {
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
 

