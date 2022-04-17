
public class AlertIterator implements Iterator {

    Alert[] alertList; 
    int index = 0; 
    
    public  AlertIterator(Alert[] alertList) 
    { 
        this.alertList = alertList; 
    } 
    
	@Override
    public Object next() 
    { 
        Alert alert =  alertList[index]; 
        index += 1; 
        return alert; 
    } 
	
	@Override
    public boolean hasNext() 
    { 
        if (index >= alertList.length || 
            alertList[index] == null) 
            return false; 
        else
            return true; 
    } 

}
