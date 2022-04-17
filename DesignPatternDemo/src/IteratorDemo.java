class IteratorDemo 
{ 
    public static void main(String args[]) 
    { 
        AlertCollection alertCollection = new AlertCollection(); 
        AlertBar alertBar = new AlertBar(alertCollection); 
        alertBar.printAlerts(); 
    } 
} 