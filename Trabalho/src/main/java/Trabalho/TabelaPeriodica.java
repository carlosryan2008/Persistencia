package Trabalho;

import java.util.List;


public class TabelaPeriodica {
	
	private List<Elemento> tabelaPeriodica;
	
	public TabelaPeriodica() {}
	
	public TabelaPeriodica(List<Elemento> tabelaPeriodica) {
		this.tabelaPeriodica = tabelaPeriodica;
	}

	public List<Elemento> getTabelaPeriodica() {
		return tabelaPeriodica;
	}

	public void setTabelaPeriodica(List<Elemento> tabelaPeriodica) {
		this.tabelaPeriodica = tabelaPeriodica;
	}

	@Override
	public String toString() {
		return "TabelaPeriodica [" + tabelaPeriodica + "]";
	}
	
	
}
