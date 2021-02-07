package exercicio02;

import exercicio01.Cachorro;
import exercicio01.Cavalo;
import exercicio01.Preguica;

public class Q02Animais {

	public static void main(String[] args) {
		Cachorro dog1 = new Cachorro("rex",5);
		Cavalo horse1 = new Cavalo("pé de pano", 7);
		Preguica Sloth1 = new Preguica("sid", 4);
		
		System.out.println(dog1.emitirSom());
		System.out.println(horse1.emitirSom());
		System.out.println(Sloth1.emitirSom());
	}
}
