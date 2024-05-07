package org.example.VendingMachine.States;

import org.example.VendingMachine.ChainOfResponsibility.SnackDispenseHandler;
import org.example.VendingMachine.Snack;
import org.example.VendingMachine.VendingMachine;

public class DispensingSnackState implements StateOfVendingMachine{
    @Override
    public void insertMoney(VendingMachine machine, double amount) {
        System.out.println("Dispensing snack...");
    }

    @Override
    public void selectSnack(VendingMachine machine, String snack) {
        System.out.println("Dispensing snack...");
    }

    @Override
    public void dispenseSnack(VendingMachine machine, SnackDispenseHandler handler) {
        Snack selected = machine.getSelectedSnack();
        handler.handleRequest(selected);
        double change = machine.getMoney() - selected.getPrice();
        System.out.printf("Here is your change:  $%.2f%n", change);
        System.out.println("Thank you....");
        machine.setMoney(0);
        machine.setState(new IdleState());
    }
}
