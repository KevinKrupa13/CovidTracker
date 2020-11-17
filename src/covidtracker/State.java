/**
 * 
 */
package covidtracker;

/**
 * @author suhad
 *
 */
public class State {
    
    private String name;
    private double stateCFR;
    private LinkedList<Race> race;
    
    public State(String name) {
        this.name = name;
        
    }
    
    
    /**
     * gets name of state
     */
    public String getName() {
        return name;
    }
    
    

}
