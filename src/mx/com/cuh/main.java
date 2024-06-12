package mx.com.cuh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import mx.com.cuh.DTO.Persona;

public class main {

	/*public static void Main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	     System.out.println("Ingresa el primer número: ");
	     int numero = scanner.nextInt();
	     int numeroParaDo =  numero;
	     int temp =1;
	     for (int i = 0; i < temp ; i++) {
	    	 System.out.println("paso número " + i);
	    	 if(numero ==1) {
	    		break; 
	    	 }
	    	 //Saber si es par o impar
		     if(numero%2 == 0) {//par
		    	  numero = numero / 2;
		     }else {//impar
		    	  numero = 3*numero+1;
		     }
		     temp = temp+1;
	     }
	     System.out.println("for  " +numero);
	    
	     int contadorDeDo =0;
	     do {
	    	 contadorDeDo =contadorDeDo +1;
	    	 //Saber si es par o impar
		     if(numeroParaDo%2 == 0) {//par
		    	 numeroParaDo = numeroParaDo / 2;
		     }else {//impar
		    	 numeroParaDo = 3*numeroParaDo+1;
		     }
		     
		} while (numeroParaDo !=1);
	     
	     //System.out.println("do  pasos "+contadorDeDo+ "numero es" + numeroParaDo);
	     
		
	}*/
	
	/*public class fibonacci {*/
	
	/*	public static void main(String[] args) {
			int n = 10;
			int num1 = 0;
			int num2 = 1;
			int temp;
			
			for (int i =0; i < n; i ++ ) {
				System.out.println(num1  + "" );
					
				num1 = num2 + num1;
				temp = num1;
				num2 = temp;
				
			 }
		 }
 		 
}*/
	
/*	public static double calcularIMC(double peso, double estatura) {
		return peso  / Math.pow(estatura, 2);
	}
	
	public static String nivelDePeso(double IMC) {
		if (IMC < 16 )
			return "Delgadez severa";
		else if (IMC >= 16 && IMC <=17)
			return "Delgadez moderada";
		else if (IMC >= 17 && IMC <=18.5)
			return "Delgadez leve";
		else if (IMC >= 18.5 && IMC <=25)
			return "Peso normal";
		else if (IMC >= 25 && IMC <=30)
			return "Sobrepeso";
		else if (IMC >= 30 && IMC <=35)
			return "Obesidad leve";
		else if (IMC >= 35 && IMC <=40)
			return "Obesidad moderada";
		else 
			return "Obesidad morbida";
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double peso;
		double estatura;
		 
		System.out.println("Ingresa tu peso: ");
		peso = scanner.nextDouble();
		System.out.println("Ingresa tu estatura: ");
		estatura = scanner.nextDouble();
		
		System.out.println("Su peso esta en la categoria de: " + nivelDePeso(calcularIMC(peso,estatura)));
		
		
	}
}*/
	
	 /*public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
		
         int temporal = n;
         int  a;
         int sum=0;
 
         while(n>0){
 
            a = n%10;
            n=n/10;
            sum= sum + a*a*a;
 
        }
        if(temporal == sum)
            System.out.println("Es amstrong");
 
        else
 
            System.out.println("No es amstrong");
 
    }
		
}*/


	/*public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
		
		
		int resultado;
		int suma = 0;
		
		for (int i = 1; i < numero; i++) {
			resultado = numero%i;
			if (resultado == 0) {
				suma  = suma +i;
			}
		}
		if (suma == numero) {
			System.out.println("El número es perfecto");
		}else {
			System.out.println("El número no es perfecto");
		}

	}

}*/

		public static void main(String[] args) {
		
		int i;
		int suma=0;
		int num1;
		int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        num2 = scanner.nextInt();
  
        for(i = 1;i < num1;i++){                                 
             if(num1%i==0){
                suma=suma+i;
             }
        }
        if(suma==num2){
           suma=0;
           for(i = 1;i < num2;i++){                                          
                if(num2%i==0){
                   suma=suma+i;
                }
            }
           if(suma==num1){
              System.out.println("Son Amigos");
           }else{
              System.out.println("No son amigos");
           }
        }    
        else{
             System.out.println("No son amigos");
        }
    }
}	 	 	