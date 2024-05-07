package org.example;

import org.example.VendingMachine.VendingMachine;

public class Driver {
    public static void main(String[] args) {
        VendingMachine vendingMachine=new VendingMachine();
        String[] snackSelector = new String[]{"Coke", "Pepsi", "Cheetos", "Doritos", "KitKat", "Snickers","Snickers","Snickers", "Burger"};
        for(String snack: snackSelector ){
            vendingMachine.selectSnack(snack);
            vendingMachine.insertMoney(4.20);
            vendingMachine.dispenseSnack();
            System.out.println("======================================");
        }

    }
}