package classes;

import java.util.Random;
import java.util.Scanner;

public class Luta {
	private Lutador desafiado;
	private Lutador  desafiante;
	private int rounds;
	private boolean aprovada;
	Scanner scan=new Scanner(System.in);
	int acabouLuta=1;
	
	public void marcarLuta(Lutador desafiado,Lutador desafiante)
	{
		if(desafiado.getCategoria().equals(desafiante.getCategoria())&& desafiado!=desafiante)
		{
			this.setAprovada(true);
			this.setDesafiado(desafiado);
			this.setDesafiante(desafiante);
		}
		else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	public void lutar()
	{
		if(getAprovada())
		{	
			System.out.println("###DESAFIADO###");
			this.desafiado.apresentar();
			System.out.println("###DESAFIANTE###");
			this.desafiante.apresentar();
			
			Random aleatorio=new Random();
			int comeca= aleatorio.nextInt(2);
			int turno=0;
			
			if(comeca==0) {//desafiado começa atacando
				System.out.println("O lutador "+desafiado.getNome()+" vai começar atacando");
				
			}
			else if(comeca==1) {
				System.out.println("O lutador "+desafiante.getNome()+" vai começar atacando");
			}
			
			do {
				Random aleatorio1=new Random();
				Random aleatorio2=new Random();
				char teclaCombate;
				
				int acertou=aleatorio1.nextInt(100);
				int acertou2=aleatorio2.nextInt(100);
				
				System.out.println("Digite 'x' para começar a luta");
				char tecla=scan.next().charAt(0);
				if(tecla=='x')
				{
					if(comeca==0) {//desafiado comeca atacando
					
					do {
						System.out.println("Vida de "+this.desafiado.getNome()+":"+this.desafiado.getVida()
						+" x Vida de "+this.desafiante.getNome()+":"+this.desafiante.getVida());
						System.out.println("Digite x para atacar");
						teclaCombate=scan.next().charAt(0);
						if(teclaCombate=='x') {
						clearScreen();
						if(turno % 2 ==0)//turnos 
						{
							if(acertou>=50)
							{
								System.out.println(this.desafiado.getNome()+" acertou "+this.desafiante.getNome());
								this.desafiante.setVida(this.desafiante.getVida()-10);
								turno++;
							}
							else
							{
								System.out.println(this.desafiado.getNome()+" errou o ataque");
								this.desafiante.setVida(this.desafiante.getVida());
								turno++;
							}
							
						}
						
						else if( turno %2==1) 
						{
							if(acertou2>=50)
							{
								System.out.println(this.desafiante.getNome()+" acertou "+this.desafiado.getNome());
								this.desafiado.setVida(this.desafiado.getVida()-10);
								turno++;
							}
							else
							{
								System.out.println(this.desafiante.getNome()+" errou o ataque");
								this.desafiado.setVida(this.desafiado.getVida());
								turno++;
							}
						}
						}
						
					}while(this.desafiado.getVida()<1 || this.desafiante.getVida()<1);
					if(this.desafiado.getVida()<1)
					{
						System.out.println("O jogador "+this.desafiante.getNome()+" ganhou a batalha!!");
					}
					else if(this.desafiante.getVida()<1)
					{
						System.out.println("O jogador "+this.desafiado.getNome()+" ganhou a batalha!!");
					}
					acabouLuta=0;
					
					}// cochete if comeca ==0 desafiado comeca
					
					if(comeca==1) {//desafiante comeca atacando
						
						do {
							System.out.println("Vida de "+this.desafiante.getNome()+":"+this.desafiante.getVida()
							+" x Vida de "+this.desafiado.getNome()+":"+this.desafiado.getVida());
							System.out.println("Digite x para atacar");
							teclaCombate=scan.next().charAt(0);
							if(teclaCombate=='x') {
								
							if(turno % 2 ==0)//turnos 
							{
								if(acertou>=50)
								{
									System.out.println(this.desafiante.getNome()+" acertou "+this.desafiado.getNome());
									this.desafiado.setVida(this.desafiado.getVida()-10);
									turno++;
								}
								else
								{
									System.out.println(this.desafiante.getNome()+" errou o ataque");
									this.desafiante.setVida(this.desafiado.getVida());
									turno++;
								}
								
							}
							
							else if( turno %2==1) 
							{
								if(acertou2>=50)
								{
									System.out.println(this.desafiado.getNome()+" acertou "+this.desafiante.getNome());
									this.desafiante.setVida(this.desafiante.getVida()-10);
									turno++;
								}
								else
								{
									System.out.println(this.desafiado.getNome()+" errou o ataque");
									this.desafiante.setVida(this.desafiante.getVida());
									turno++;
								}
							}
							}
							
						}while(this.desafiado.getVida()<1 || this.desafiante.getVida()<1);
						if(this.desafiado.getVida()<1)
						{
							System.out.println("O jogador "+this.desafiante.getNome()+" ganhou a batalha!!");
						}
						else if(this.desafiante.getVida()<1)
						{
							System.out.println("O jogador "+this.desafiado.getNome()+" ganhou a batalha!!");
						}
						acabouLuta=0;
						
						}// cochete if comeca
					
				}//cochete tecla ==x
				
			}while(acabouLuta!=0);
			
			
			/*switch(vencedor) {
			
			case 0:
			
			System.out.println("Empatou!!");
			this.desafiado.empatarLuta();
			this.desafiante.empatarLuta();
			break;
			
			case 1: 
			
			System.out.println("O desafiado "+this.desafiado.getNome()+"ganhou a luta");
			this.desafiado.ganharLuta();
			this.desafiante.perderLuta();
			break;
			
			case 2:
			
			System.out.println("O desafiante "+this.desafiante.getNome()+"ganhou a luta");
			this.desafiante.ganharLuta();
			this.desafiado.perderLuta();
			break;
			}*/
		}
		else
		{
			System.out.println("A luta não pode acontecer");
		}
	}
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}

}
