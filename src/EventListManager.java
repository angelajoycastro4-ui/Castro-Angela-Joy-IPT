import java.util.ArrayList;
import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
public class EventListManager {
    private static EventListManager instance = new EventListManager();
    
    private List<Event> events;
    private EventListManager() {
        events = new ArrayList<>();
    }
    
    public static EventListManager getInstance() {
        return instance;
    }
    
    public void addEvent(Event event) {
        events.add(event);
        System.out.println("Event added: " + event.getName());
    }
    
    public List<Event> getallEvents() {
        return events;
    }
}
