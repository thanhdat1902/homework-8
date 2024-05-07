package org.example.VendingMachine.States;

import org.example.VendingMachine.ChainOfResponsibility.SnackDispenseHandler;
import org.example.VendingMachine.VendingMachine;

public interface StateOfVendingMachine {
    public void insertMoney(VendingMachine machine, double amount);
    public void selectSnack(VendingMachine machine, String snack);
    public void dispenseSnack(VendingMachine machine, SnackDispenseHandler handler);
}
