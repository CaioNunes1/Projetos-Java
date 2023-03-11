
public class ControleRemoto implements Controlador {
	int volume;
	boolean ligado;
	boolean tocando;

	public ControleRemoto(){
		this.volume=50;
		this.ligado=false;
		this.tocando=false;
	}
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado()) {
			System.out.println("A tv está ligada?"+this.getLigado());
			System.out.println("A tv está tocando?"+this.getTocando());
			System.out.println("O volume é:"+this.getVolume());
			for(int i=0;i<this.getVolume();i+=10)
			{
				System.out.print("|");
			}
		}
		
		else
		{
			System.out.println("A tv não está ligada");
		}
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
		
	}

	@Override
	public void aumVolume() {
		if(this.getLigado()) 
		{
		this.setVolume(this.getVolume()+5);
		}
		else
		{
			System.out.println("A tv não está ligada");
		}
	}

	@Override
	public void dimVolume() {
		if(this.getLigado()) 
		{
		this.setVolume(this.getVolume()-5);
		}
		else
		{
			System.out.println("A tv não está ligada");
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume()>0)
		{
			this.setVolume(0);
		}
		else
		{
			System.out.println("A tv não está ligada");
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume()==0)
		{
			this.setVolume(50);
		}
		else
		{
			System.out.println("A tv não está ligada");
		}
		
	}

	@Override
	public void play() {
		if(this.getLigado() && !this.getTocando())
		{
			this.setTocando(true);
		}
		else
		{
			System.out.println("A tv não está ligada ou já está tocando");
		}
	}

	@Override
	public void pausar() {
		if(this.getLigado()&& this.getTocando())
		{
			this.setTocando(false);
		}
		else
		{
			System.out.println("A tv não está ligada ou já está pausada");
		}
		
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

}
