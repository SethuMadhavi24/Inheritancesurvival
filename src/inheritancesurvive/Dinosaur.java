package inheritancesurvive;

import inheritancesurvive.LavaDinosaur;

public class Dinosaur extends LavaDinosaur {
	private String species;
	private String locomotionType;
	private String hasHeatResistence;
	public Dinosaur(String species, String locomotionType,String hasHeatResistence) {
		super(species, locomotionType);
		this.hasHeatResistence = hasHeatResistence;
	}
	public void display()
	{
		super.display();
		System.out.println("Is Resistence: "+hasHeatResistence);
		System.out.println("Dino Details");
		//boolean v= "yes";
		//boolean s=Boolean.compare(hasHeatResistence,v);
		int v=hasHeatResistence.compareTo("yes");
		if(v==0)
		{
			System.out.println("Lives on underground");
		}
		else {
			System.out.println("Did not survive");
		}
		
		
	}

}
