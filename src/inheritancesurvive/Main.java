package inheritancesurvive;
import java.util.Scanner;

import inheritancesurvive.Dinosaur;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String species=sc.nextLine();
		String locomotionType=sc.nextLine();
		
		String hasHeatResistence=sc.nextLine();
		Dinosaur dino=new Dinosaur(species,locomotionType,hasHeatResistence);
		dino.display();
		System.out.println("Species:"+species);
		System.out.println("Travel by: "+locomotionType);

	}

}
