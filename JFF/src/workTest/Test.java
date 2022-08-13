package workTest;

public class Test {
	public static void main(String args[]){
		Account acct1 = new Account("California", "90815");
		Account acct2 = new Account("Arizona", "43221");
		Account acct3 = new Account("92417");
		Territory territory1 = territory(acct1);
		Territory territory2 = territory(acct2);
		Territory territory3 = territory(acct3);
		System.out.println(territory1.getName());
		System.out.println(territory2.getName());
		System.out.println(territory3.getName());
		
	}
	
	public static Territory territory(Account x){
		Territory territory = new Territory();
		
		if(x.getZipCode().startsWith("900")||x.getZipCode().startsWith("901")||x.getZipCode().startsWith("902")||x.getZipCode().startsWith("903")
			||x.getZipCode().startsWith("904")||x.getZipCode().startsWith("905")||x.getZipCode().startsWith("906")||x.getZipCode().startsWith("907")
			||x.getZipCode().startsWith("908")||x.getZipCode().startsWith("926")||x.getZipCode().startsWith("927")||x.getZipCode().startsWith("928")
			||x.getZipCode().startsWith("916")||x.getZipCode().startsWith("917")||x.getZipCode().startsWith("918")) {
			territory.setName("Orange County"); 
		}
		else if(x.getZipCode().startsWith("910")||x.getZipCode().startsWith("911")||x.getZipCode().startsWith("912")||x.getZipCode().startsWith("914")
				||x.getZipCode().startsWith("915")||x.getZipCode().startsWith("931")||x.getZipCode().startsWith("933")||x.getZipCode().startsWith("935")){
			territory.setName("Los Angeles"); 
		}
		else if(x.getZipCode().startsWith("919")||x.getZipCode().startsWith("920")||x.getZipCode().startsWith("921")||x.getZipCode().startsWith("922")
				||x.getZipCode().startsWith("923")||x.getZipCode().startsWith("924")||x.getZipCode().startsWith("925")){
			territory.setName("San Diego"); 
		}
		else if(x.getZipCode().startsWith("913")||x.getZipCode().startsWith("930")||x.getZipCode().startsWith("932")||x.getZipCode().startsWith("934")){
			territory.setName("North Los Angeles"); 
		}
		else if(x.getState().equals("Arizona")) {territory.setName("Arizona");} 
		else{territory.setName("Misc.");}
		x.setTerritory(territory);
		return territory;
	}

}
