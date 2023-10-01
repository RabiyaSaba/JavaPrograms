
public class Mother extends Women {
	
	public void MotherRole()
	{
		System.out.println("A women can be a  Mother: ");
	}


public static void main(String[] args) {
    Women w = new Women(); // Create a Animal object
    Mother m = new Mother();// Create a Pig object
    // Create a Dog object
    
   
    m.MotherRole();
    w.WomenRole();
    
    
  }
}

