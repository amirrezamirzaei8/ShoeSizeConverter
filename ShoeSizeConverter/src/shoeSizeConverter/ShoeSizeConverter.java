/*
 *  Student Name : Amirreza Mirzaei
 *  Date : November 15, 2023
 *  Modified:
 *  Description: This program converts the Canadian shoe size to UK size and EU size 
 */
package shoeSizeConverter;

public class ShoeSizeConverter {
	int shoeSize 	= 0;	// User's Canadian shoe size
	String gender	= null;	// User's gender
	
 	public ShoeSizeConverter() {	// No argument Constructor
		this(0,"");
	}
 
	public ShoeSizeConverter(int shoeSize, String gender) {	//	Creating a constructor with shoeSize and gender as the parameter list
		this.shoeSize = shoeSize;
		this.gender = gender;
	}
	// implementing getters and setters for instance variables (shoeSize and gender) 
	public double getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// implementing the createReport method as the work method
	public String createReport() {
		String report = null;
		
		switch(shoeSize) {
		
		case 7: report = "UK Size = 6 , EU size = 39";
			break;
			
		case 9: if(gender.equalsIgnoreCase("male")) {
			report = "UK Size = 8 , EU size = 42";
			}
		else if(gender.equalsIgnoreCase("Female")) {
			report = "UK Size = 7 , EU size = 40";
		} 
			break;
			
		case 10:  report = "UK Size = 9 , EU size = 43";
		
			break;
		default: report = "Size Not Found";
		} 
		return report;
	}
}


