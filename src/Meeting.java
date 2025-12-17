/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
    public abstract class Meeting extends Event {
        
        private double venueRentalFee;
        
        public Meeting(String name, String detail, String notes, String date, double venueRentalFee ) {
            super(name, detail, notes, date);
            this.venueRentalFee = venueRentalFee;
        }
        
        @Override
    public String getType() {
        return "Business Meeting";
    }
    
    public double calculationCost() {
        return venueRentalFee;
    }
}

