/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
public abstract class Event {
    private String name;
    private String meetingOrBdayDetail;
    private String notes;
    private String date;
    
    public Event(String name, String detail, String notes, String date) {
        this.name = name;
        this.meetingOrBdayDetail = detail;
        this.notes = notes;
        this.date = date;
    }
    
    public String getName() {
        return name;
    }
    
    public String getMeetingOrBdayDetail() {
        return meetingOrBdayDetail;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public abstract String getType();
    public abstract double calculateCost();
    
    public String getDetails() {
        return "Type: " + getType() + "\nName: " + name + "\nDate: " + date + "\nDetail/Location: " + meetingOrBdayDetail + "\nNotes: " + notes;
    }
}
  