package org.example.VendingMachine;

import org.example.VendingMachine.ChainOfResponsibility.*;
import org.example.VendingMachine.States.IdleState;
import org.example.VendingMachine.States.StateOfVendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private Map<String, Snack> snacks;
    private StateOfVendingMachine state;
    private SnackDispenseHandler snackDispenser;
    private Snack selectedSnack;
    private double money;
    public VendingMachine() {
        this.snacks = new HashMap<>();
        snacks.put("Coke", new Snack("Coke", 2.99, 12));
        snacks.put("Pepsi", new Snack("Pepsi", 2.49, 21));
        snacks.put("Cheetos", new Snack("Cheetos", 5.00, 3));
        snacks.put("Doritos", new Snack("Doritos", 4.00, 4));
        snacks.put("KitKat", new Snack("KitKat", 1.49, 9));
        snacks.put("Snickers", new Snack("Snickers", 1.19, 2));

        snackDispenser = new CokeHandler(new PepsiHandler(new CheetosHandler(new DoritosHandler(new KitKatHandler(new SnickersHandler(null))))));
        state = new IdleState();
    }

    public void setSelectedSnack(String snack){
        this.selectedSnack = snacks.getOrDefault(snack, null);
    }
    public Snack getSelectedSnack(){
        return selectedSnack;
    }

    public void setMoney(double amount) {
        this.money = amount;
    }

    public double getMoney() {
        return this.money;
    }


    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }
    public StateOfVendingMachine getState() {
        return state;
    }
    public void selectSnack(String snack){
        getState().selectSnack(this,snack);
    }
    public void insertMoney(double money){
        getState().insertMoney(this,money);
    }
    public void dispenseSnack(){
        getState().dispenseSnack(this, snackDispenser);
    }


}
