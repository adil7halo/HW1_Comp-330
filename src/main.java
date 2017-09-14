public class dog
{
    
    private static String name;
    
    void bark ()
    {
        System.out.print (name + " the dog says \"Woof!\"\n");
    }
    
    public dog (String name)
    {
        
        this.name = name;
    }
}