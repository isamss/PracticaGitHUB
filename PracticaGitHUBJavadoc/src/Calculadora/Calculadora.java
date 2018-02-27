package Calculadora;

public class Calculadora {

	double op1;
	double op2;
	
	
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	double suma() {
		return op1+op2;
	}
	
	double resta() {
		return op1-op2;
	}
	
	double division() {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
		}
		return op1/op2;
	}
	
	//TODO: Añadir la operación potencia, que devuelve
	//op1 elevado a op2 con las siguientes reglas: 
	//-Por convenio cualquier número elevado a 0 es igual a 1.
	//-Un número "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
	//Así 232^0 = 1; y 2^(-3)=1/2^3=1/8
	
	
	//TODO: Añadir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	
}
