package interfaceSegregationPrinciple;

public class LoroImpl implements IAve, IAveVoladora{


	@Override
	public void comer() {	
		
		System.out.println("Loro comiendo...");
	}

	@Override
	public void volar() {
		
		System.out.println("Loro volando...");		
	}

}
