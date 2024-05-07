package org.example.VendingMachine.States;

import org.example.VendingMachine.ChainOfResponsibility.SnackDispenseHandler;
import org.example.VendingMachine.VendingMachine;

public class WaitingForMoneyState implements StateOfVendingMachine{
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        machine.setMoney(amount);
        System.out.printf("Detected insert: $%s %n", amount);
        if (machine.getMoney() >= machine.getSelectedSnack().getPrice()) {
            machine.setState(new DispensingSnackState());
        }
        else{
            double change = machine.getMoney();
            System.out.println("Amount is not sufficient. Please try again.");
            machine.setMoney(0);
            machine.setState(new IdleState());
        }
    }

    @Override
    public void selectSnack(VendingMachine machine, String snack) {
        System.out.println("Already choose snack. Insert money to dispense.");
    }

    @Override
    public void dispenseSnack(VendingMachine machine, SnackDispenseHandler handler) {
        System.out.println("Not enough amount. Please try again.");
    }
}
