package interfaceSegregationPrinciple;

public class PinguinoImpl implements IAve, IAveNadadora{

	@Override
	public void nadar() {
		System.out.println("Pinguino nadando...");
	}

	@Override
	public void comer() {
		System.out.println("Pinguino comiendo...");
	}

}
