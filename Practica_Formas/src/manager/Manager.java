package manager;
import java.util.Scanner;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Rectangulo;
import modelo.Triangulo;

public class Manager {
	Scanner sc;
	Triangulo tri;
	Cuadrado cuad;
	Rectangulo rect;
	Circulo circ;
	
	public Manager() {
		sc = new Scanner(System.in);
		this.tri = new Triangulo("Triangulo", "este area es triangula con 3 lados.");
		this.cuad = new Cuadrado("Cuadrado", "este area es cuadrada con 4 lados.");
		this.rect = new Rectangulo("Rectangulo", "este area es rectangula con 4 lados.");
		this.circ = new Circulo("Circulo", "este area es esferica con 1 lado.");
	}
	
	public void crearFigura() {
		int resul=0;
		do {
			System.out.println("Que figura quieres saber su area?");
			System.out.println("1- Triangulo");
			System.out.println("2- cuadrado");
			System.out.println("3- rectangulo");
			System.out.println("4- Circulo");
			resul = sc.nextInt();
			if(resul == 1) {
				System.out.println("");
				System.out.println(this.tri.getArea());
				System.out.println("");
			}else if(resul == 2) {
				System.out.println("");
				System.out.println(this.cuad.getArea());
				System.out.println("");
			}else if(resul == 3) {
				System.out.println("");
				System.out.println(this.rect.getArea());
				System.out.println("");
			}else if(resul == 4) {
				System.out.println("");
				System.out.println(this.circ.getArea());
				System.out.println("");
			}
		}while(resul!=0);
	}
}
