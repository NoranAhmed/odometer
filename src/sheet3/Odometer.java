
package sheet3;

public class Odometer {
    private double miles;
    private double effieciency;
    
    public void reset(){
        this.miles=0;
    }
    public void setEfficiency(double effieciency){
        this.effieciency=effieciency;
    }
    public void totalMiles(double miles){
        this.miles +=miles;
        
    }
    public double getFuel (){
        return miles/effieciency;
        
    }
}
