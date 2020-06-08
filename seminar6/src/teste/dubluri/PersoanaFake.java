package teste.dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {
	private int varsta;

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return this.varsta;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

}
