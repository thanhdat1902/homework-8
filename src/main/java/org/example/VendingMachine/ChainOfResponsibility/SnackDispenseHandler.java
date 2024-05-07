package org.example.VendingMachine.ChainOfResponsibility;

import org.example.VendingMachine.Snack;
import org.example.VendingMachine.VendingMachine;

public class SnackDispenseHandler {
    private SnackDispenseHandler next;
    public SnackDispenseHandler(SnackDispenseHandler next) {
        this.next = next;
    }
    public void handleRequest(Snack snack ) {
        if (next != null) {
            next.handleRequest(snack);
        }
    }
}
