/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
public class Birthday extends Event {
    private double partyBudget;
    
    public Birthday (String name, String detail, String notes, String date, double partyBudgaet) {
        super(name, detail, notes, date);
        this.partyBudget = partyBudget;
    }
    
    @Override
    public String getType() {
        return "Birthday Party";
    }
    
    @Override
    public double calculateCost() {
        return partyBudget;
    }
}
    
    
