package org.example.VendingMachine.ChainOfResponsibility;

import org.example.VendingMachine.Snack;
import org.example.VendingMachine.VendingMachine;

public class KitKatHandler extends SnackDispenseHandler{
    public KitKatHandler(SnackDispenseHandler next) {
        super(next);
    }
    public void handleRequest(Snack snack) {
        if (snack.getName().equalsIgnoreCase("KitKat") && snack.getQuantity() > 0) {
            snack.setQuantity(snack.getQuantity() - 1);
            System.out.printf("Dispensing successfully... Grab your '%s' in dispensing tray.%n", snack.getName());
        } else {
            super.handleRequest(snack);
        }
    }
}
