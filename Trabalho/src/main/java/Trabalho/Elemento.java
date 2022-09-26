package Trabalho;

public class Elemento {

	private String nome;
	private String simbolo;
	private int numeroAtomico;
	private float massaAtomica;
	private int periodo;
	private int grupo;
	private String familia;
	
	public Elemento() {}
	
	public Elemento(String nome, String simbolo, int numeroAtomico, float massaAtomica, int periodo, int grupo,
			String familia) {
		super();
		this.nome = nome;
		this.simbolo = simbolo;
		this.numeroAtomico = numeroAtomico;
		this.massaAtomica = massaAtomica;
		this.periodo = periodo;
		this.grupo = grupo;
		this.familia = familia;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	public int getNumeroAtomico() {
		return numeroAtomico;
	}
	public void setNumeroAtomico(int numeroAtomico) {
		this.numeroAtomico = numeroAtomico;
	}
	public float getMassaAtomica() {
		return massaAtomica;
	}
	public void setMassaAtomica(float massaAtomica) {
		this.massaAtomica = massaAtomica;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public int getGrupo() {
		return grupo;
	}
	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	
	@Override
	public String toString() {
		return "[nome=" + nome + ", simbolo=" + simbolo + ", numeroAtomico=" + numeroAtomico
				+ ", massaAtomica=" + massaAtomica + ", periodo=" + periodo + ", grupo=" + grupo + ", familia="
				+ familia + "]";
	}
	
	public String quebra() {
		return nome + "," + simbolo + "," + numeroAtomico + "," + massaAtomica +
				"," + periodo + "," + grupo + "," + familia;
	}
	
	
	
}
