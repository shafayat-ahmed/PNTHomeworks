
public class TestComputer {

	public static void main(String[] args) {
		Computer comp1 = new Computer("Adam","Mac","iOS",2012,1200);
		comp1.displayInformaiton();
		
		Computer comp2 = new Computer("Abdul","Windows","WindowsOS",2015,800);
		comp2.displayInformaiton();
		
		Computer comp3 = new Computer("Billy","Mac","iOS",2015,1000);
	    comp3.displayInformaiton();
	    
	    Computer comp4 = new Computer("David");
	    comp4.displayInformaiton();
	    
	    Computer comp5 = new Computer();
	    
	    Computer.shareComputer();
	}
	

}
