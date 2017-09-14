public class myApp
{
    
    public static void main (String[] args) 
    {
        
        userInterview ui = new userInterview ();
        
        String dogName = ui.getUserInput ("What would you like your dog to be named?");
        
        dog d = new dog (dogName);
        
        d.bark (); 
    }
}