package Calculadora;
import java.util.*;

public class clasePrincipal {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int numer,numer2;
		Calculadora cal=new Calculadora(8,15);
		System.out.println(cal.suma());
		System.out.println(cal.resta());
		System.out.println(cal.multiplicacion());
		System.out.println(cal.division());
		System.out.println("Introduzca el primer numero");
		numer=sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		numer2=sc.nextInt();
		Calculadora cal2=new Calculadora(numer,numer2);
		System.out.println(cal2.suma());
		System.out.println(cal2.resta());
		System.out.println(cal2.multiplicacion());
		System.out.println(cal2.division());
	}

}
