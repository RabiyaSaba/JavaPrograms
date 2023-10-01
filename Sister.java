// Again we have created a sister role which have women class 
public class Sister extends Women{
	
	public void SisterRole()
	{
		System.out.println("A sister is a women");
	}


public static void main(String[] args) {
    
    Women w = new Women();
    Sister s = new Sister();
    s.SisterRole();
    w.WomenRole();
    
  }
}


