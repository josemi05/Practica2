package Calculadora;

public class Calculadora {
	
	private int numero1;
	private int numero2;
	private int resultado;
	
	// constructores
		
	
	public Calculadora(int numero1,int numero2){
		this.numero1=numero1;
		this.numero2=numero2;
		
	} 
	//metodos
	public int suma(){
		return this.numero1+this.numero2;
		
	}
	public int resta(){
		return this.numero1-this.numero2;
	}
	public double division (){
		return(double)this.numero1/this.numero2;
	}
	public int multiplicacion(){
		return this.numero1*this.numero2;
	}

}
