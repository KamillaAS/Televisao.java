//4. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e 
//trocar os canais da televisão. O controle de volume permite:

//aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;

//aumentar e diminuir o número do canal em uma unidade;

//trocar para um canal indicado;

//consultar o valor do volume de som e o canal selecionado;

//Crie depois um programa principal que interaja com as suas classes, não se esqueça dos
//modificadores de acesso e dos getters e setters em suas classes.


public class Controle {
	private Televisao televisao;
	private int volumeMaximo;
	
	public Controle(int volumeMaximo) {// int canlaAtual, int volumeAtual) 
		this.volumeMaximo = volumeAtual;
		this.televisao = new Televisao(0, 0);
	}
	
	
	
	public int diminuiVolume() {
		this.televisao.setvolumeAtual(this.televisao.getvolumeAtual() -1);
		return this.televisao
		
		
	}
	
	public int aumentaCanal() {
		
		
	}
}
	