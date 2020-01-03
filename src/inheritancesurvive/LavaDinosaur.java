package inheritancesurvive;

public class LavaDinosaur {
	private String species;
	private String locomotionType;

	public LavaDinosaur(String species, String locomotionType) {
		super();
		this.species = species;
		this.locomotionType = locomotionType;
		
	}
	public void display()
	{
		
		System.out.println("Enter species: "+species);
		System.out.println("Enter locomotionType: "+locomotionType);
	}

}
