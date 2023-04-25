package classes;

public class Main {
	public static void main(String[] args) {
		Lutador l1[]= new Lutador[6]; 
		l1[0]=new Lutador("Pretty boy",31,"França",1.72f,62.2f,11,2,1,100);

		
		l1[1]= new Lutador("Putscript",29,"Brasil",1.69f,57.8f,14,2,3,100);
		
		
		l1[2]= new Lutador("Snapshadow",35,"EUA",1.65f,80.9f,12,2,1,100);
		
		
		l1[3]=new Lutador("Dead Code",28,"Australia",1.93f,81.6f,13,0,2,100);
		
		
		l1[4]=new Lutador("Uf0Cubol",37,"Brasil",1.70f,119.3f,5,4,3,100);
		
		
		l1[5]=new Lutador("Nerdartt",30,"EUA",1.81f,105.7f,12,2,4,100);
		
		
		Luta uec=new Luta();
		uec.marcarLuta(l1[4], l1[5]);
		uec.lutar();
		
	}

}
