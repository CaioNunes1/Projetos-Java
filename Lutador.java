package classes;

public class Lutador implements ControladorLutador {
	private String nome;
	private int idade;
	private String nacionalidade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int vida;
	

	public Lutador(String nome,int  idade,String nacionalidade,float altura,float peso,int vitorias,
			int derrotas,int empates,int vida){
		this.setNome(nome);
		this.setIdade(idade);
		this.setNacionalidade(nacionalidade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setCategoria();
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
		this.setVida(vida);
		
	}
	
	public void apresentar() {
		System.out.println("O nome do lutador é "+this.getNome());
		System.out.println("A sua idade é:"+this.getIdade());
		System.out.println("Diretamente de "+this.getNacionalidade());
		System.out.println("A sua altura é:"+this.getAltura());
		System.out.println("O peso do lutador é:"+this.getPeso());
		System.out.println("Número de vitórias:"+this.getVitorias());
		System.out.println("Número de derrotas:"+this.getDerrotas());
		System.out.println("Número de empates:"+this.getEmpates());
		System.out.println("");
	}
	@Override
	public void status() {
		System.out.println("O lutador:"+this.getNome()+" é peso "+getCategoria());
		System.out.println("Número de vitórias:"+this.getVitorias());
		System.out.println("Número de derrotas:"+this.getDerrotas());
		System.out.println("Número de empates:"+this.getEmpates());
		System.out.println("");
	}
	@Override
	public void ganharLuta() {
		this.setVitorias(getVitorias()+1);
		
	}
	@Override
	public void perderLuta() {
		this.setDerrotas(getDerrotas()+1);
		
	}
	@Override
	public void empatarLuta() {
		this.setEmpates(getEmpates()+1);
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso<=52.2)
		{
			this.categoria="invalida";
		}
		else if(this.peso <=70.3)
		{
			this.categoria="Leve";
		}
		else if(this.peso<=83.9)
		{
			this.categoria="medio";
		}
		else if(this.peso<=120.2)
		{
			this.categoria="Pesado";
		}
		else
		{
			this.categoria="Inválido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	

}
