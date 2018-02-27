package Calculadora;

/**
 * descripcion breve: en la clase calculadora van definidas todas las funciones,
 *  en este caso estamos programando una calculadora.
 *  
 * @author alumno
 * @version 2.1
 * 
 *
 */

public class Calculadora {

	double op1;
	double op2;
	
	
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
/**
 * DESCRIPCION: estamos programando la funcion suma la cual va a sumar los
 * operadores op1 y op2  
 * @author isabel
 *@return devuelve el resultado de la operacion
 *@version 2.0
 *
 */
	double suma() {
		return op1+op2;
	}
	/**
	 * descripcion: lo que va ha hacer la funcion resta es restar los operadores.
 * @author alumno
 *@version 2.0
 *@return devuelve el resultado generado de la operacion
 */
	double resta() {
		return op1-op2;
	}
	/**
	 * descripcion: va a dividir los operadores la funcion division,
	 * y en un caso si el op2 es 0 va a dar un error ya que no se puede 
 * @author alumno
 *@version 2.0
 *@return devolvera el resultado de op1/op2.
 *@exception IllegalArgumentException
 */
	double division() {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
		}
		return op1/op2;
	}
	/**
	 * descripcion: va a elevar un numero a otro, pero hay varias excepciones como:
	 * Por convenio cualquier numero elevado a 0 es igual a 1.
	*Un numero "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
 * @author alumno
 * @version 2.0
 * @return el resultado Math.pow(op1,op2=
 *
 */
	double potencia() {
		
		if (op2==0) {
			
			
			return 1;
		}
		
		if (op2==-op2) {
			
			
			return Math.pow(1/op1, op2);
		}
		
		return Math.pow(op1, op2);
		
	}
	/**
	 * descripcion: esta funcion lo que nos va ha hacer es mostrar por pantalla los resultados
	 * y los operandos.
 * @author alumno
 * @version 2.0
 * @return nos va a devolver como queremos que nos salga por pantalla los resultados
 */

	
	@Override
	public String toString() {
		return "Calculadora [op1=" + op1 + ", op2=" + op2 + ", toString=" + toString() + "]";
	}
	
	
	
	//TODO: Añadir la operacion potencia, que devuelve
	//op1 elevado a op2 con las siguientes reglas: 
	//-Por convenio cualquier numero elevado a 0 es igual a 1.
	//-Un numero "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
	//Asi 232^0 = 1; y 2^(-3)=1/2^3=1/8
	
	
	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	
}
