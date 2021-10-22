
public class Computer {

	private String modeloProcessador;
	private String capacidadeProcessador;
	private int quantidadeMemoriaRAM;
	private int tamanhoHD;
	
	public Computer(String mProcessador, String capacidadeProcessador,int ram, int hd) {
		this.modeloProcessador = mProcessador;
		this.capacidadeProcessador = capacidadeProcessador;
		this.quantidadeMemoriaRAM = ram;
		this.tamanhoHD = hd;
	}
	
	public String getModeloProcessador() {
		return modeloProcessador;
	}
	public void setModeloProcessador(String modeloProcessador) {
		this.modeloProcessador = modeloProcessador;
	}
	public String getCapacidadeProcessador() {
		return capacidadeProcessador;
	}
	public void setCapacidadeProcessador(String capacidadeProcessador) {
		this.capacidadeProcessador = capacidadeProcessador;
	}
	public int getQuantidadeMemoriaRAM() {
		return quantidadeMemoriaRAM;
	}
	public void setQuantidadeMemoriaRAM(int ram) {
		this.quantidadeMemoriaRAM = ram;
	}
	public int getTamanhoHD() {
		return tamanhoHD;
	}
	public void setTamanhoHD(int hd) {
		this.tamanhoHD = hd;
	}
	
	public void exibeDados() {
		System.out.println("------CONFIGURAÇÔES DO COMPUTADOR------");
		System.out.println("Modelo de processador :" + modeloProcessador);
		System.out.println("Modelo de processador :" + capacidadeProcessador);
		System.out.println("Modelo de processador :" + quantidadeMemoriaRAM);
		System.out.println("Modelo de processador :" + tamanhoHD);
		System.out.println("-------------------------------------");
	}
	
	
}
