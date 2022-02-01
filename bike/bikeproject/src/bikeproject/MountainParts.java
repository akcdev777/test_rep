package bikeproject;

public interface MountainParts {

	//mountain bike parts interface attributes and methods
	public final String TERRAIN = "off_road";
	
	public void setSuspension( String newValue);
	public void setType(String newValue);
	public String getSuspension();
	public String getType();
}//end interface
