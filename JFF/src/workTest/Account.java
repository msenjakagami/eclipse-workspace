package workTest;

public class Account {

	private String ZipCode;
	private String State;
	private Territory territory;
	
	public Account(String State, String ZipCode){
		this.State = State;
		this.ZipCode = ZipCode;
		territory = new Territory();
	}
	
	public Account(String ZipCode){
		this.ZipCode = ZipCode;
		territory = new Territory();
	}
	
	public void setTerritory(Territory x){
		territory = x;
	}
	public String getState(){
		return State;
	}
	
	public String getZipCode(){
		return ZipCode;
	}
}
