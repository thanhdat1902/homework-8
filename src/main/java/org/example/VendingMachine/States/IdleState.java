package org.example.VendingMachine.States;

import org.example.VendingMachine.ChainOfResponsibility.SnackDispenseHandler;
import org.example.VendingMachine.Snack;
import org.example.VendingMachine.VendingMachine;

public class IdleState implements StateOfVendingMachine{
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Cannot insert money. Please select a snack first.");
    }

    @Override
    public void selectSnack(VendingMachine machine, String snack) {
        machine.setSelectedSnack(snack);
        Snack selected = machine.getSelectedSnack();
        if (selected != null) {
            if(selected.getQuantity() > 0) {
                machine.setState(new WaitingForMoneyState());
                System.out.printf("%s is selected. Please insert $%.2f...%n", snack, selected.getPrice());
            } else {
                System.out.printf("%s is out of stock. Please choose another one.%n", snack);
            }
        } else {
            System.out.printf("%s is not available. Please choose another one.%n", snack);
        }
    }

    @Override
    public void dispenseSnack(VendingMachine machine, SnackDispenseHandler handler) {
        System.out.println("Cannot dispense. Please select a snack first.");
    }
}
