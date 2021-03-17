package Abstractfactory;

public class client {
    public static Factory getFactory(int flag)
    {
    	if(flag==0)
    	{
    	   return new AudiFactory();
    		
    	}
    	return new MarcedesFactory();
    }
}
