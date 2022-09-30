import java.util.ArrayList;

public class MangosNaranjas {
	private int mangos;
	private int naranjas;
	
	public MangosNaranjas(int mangos, int naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	}//constuctor

	public int getMangos() {
		return mangos;
	}

	public void setMangos(int mangos) {
		this.mangos = mangos;
	}

	public int getNaranjas() {
		return naranjas;
	}

	public void setNaranjas(int naranjas) {
		this.naranjas = naranjas;
	}
	
	public String mcd() {
		
		ArrayList <Integer> cajaM = new ArrayList<>();
		ArrayList <Integer> cajaN = new ArrayList<>();
		int cajaMayor = 0;
		
		for (int i = 2; i <= mangos; i++) { 
			if(mangos % i == 0) {
				cajaM.add(i);
			}else if(mangos %i !=0){
				cajaM.add(i);
			}//if mangos
		}//for mangos
		for (int i = 2; i <= naranjas; i++) { 
			if(naranjas % i == 0) {
				cajaN.add(i);
			}else if(naranjas %i !=0){
				cajaN.add(i);
			}//if naranjas
		}// if naranjas
		
		for (Integer caja : cajaN) {
			for (Integer cajaMa : cajaM) {
				if(caja == cajaMa && caja > cajaMayor) {
					cajaMayor = cajaMa;
				}//if cajas
				
			}//for cajamangos
		}//for cajanaranjas
		
		int numMango = mangos /  cajaMayor ;
		int numNaranja =  naranjas /  cajaMayor ;
		
		return "Total de cajas: " + cajaMayor + "\nMangos por caja: " + numMango +
				"\nNaranjas por caja: " + numNaranja;
	}// mcd
}//class mangosnaranjas
