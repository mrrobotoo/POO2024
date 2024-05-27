package mx.com.cuh;

public class main {

	public static void main(String[] args) {
		float num1 =5;
		float num2 =6;
		
		System.out.println("Calculadora 1.Suma, 2. Resta, 3.Division, 4.multiplicación, 5. Exponente");
		int opcion =1;
		
		if (opcion ==1) {
			System.out.println(num1 + num2);
		}else if (opcion ==2) {
			System.out.println(num1 - num2); 
		}else if (opcion ==3) {
			System.out.println(num1 * num2); 
		}else if (opcion ==4) {
			System.out.println(num1 / num2); 
		}else if (opcion ==5) {
			System.out.println(Math.pow(num1,num2)); 
		}
		
	}

}
