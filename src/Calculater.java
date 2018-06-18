import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculater {

		    private static Scanner sc    = new Scanner(System.in); //
		 
		    private static Double   fn;
		    private static Double   sn;
		    private static Double   result;
		    private static int     op;
		 
		    public static void main(String[] args) {
		         		         
		        while(true) {
		             
		            System.out.print("Enter first value = ");
		            fn    = inputNumber();

		            System.out.print("Enter one options:\n 1 -> '+'\n 2 -> '-'\n 3 -> '*'\n 4 -> '/'\n");
		            System.out.print("Operator: ");
		            op      = inputOp();
		     
		            System.out.print("Enter second value = ");
		            sn    = inputNumber();
		            switch (op) {
		                case 1 : result = plus(fn, sn); 
		                 break;
		                  
		                case 2: result = minus(fn, sn); 
		                 break;
		                  
		                case 3: result = multiplication(fn, sn); 
		                 break;
		                  
		                case 4: result = division(fn, sn); 
		                 break;
		                 
		                default:
		                	System.out.println("Not a valid of menu options ");
		                 result = 0.0;
		            }
		            
		            System.out.println(result);
		        }
		 
		    }
		    
		    private static Double inputNumber() {
		    	Double num = 0.0;
		    	
		    	while(true) {
			    	try {
			    		num = sc.nextDouble();
			    		break;
			    	} catch (InputMismatchException e) {
			    		System.out.println("Incorrect input");
			    		System.out.print("Enter again... \n");
			    	} finally {
			    		sc.nextLine();
			    	}
		    	}
		    	
		    	return num;
		    }
		    
		    
		    private static int inputOp() {
		    	int num = 0;
		    	boolean t = true;
		    	
		    	while( t || num < 1 || num > 4 ) {
		    		
			    	try {
			    		num = sc.nextInt();
			    		t = false;
			    	} catch (InputMismatchException e) {
//			    		System.out.println("Not a valid of menu options ");
//			    		System.out.print("Enter again... \n");
			    	} finally {
			    		sc.nextLine();
						if (num < 1 || num > 4) {
							System.out.println("Not a valid of menu options ");
							System.out.print("Enter again... \n");
						}
			    	}
			    	
		    	}
		    	
		    	return num;
		    }
		     
		    private static Double plus(Double fn, Double sn){
		        Double result = fn + sn;
		        return result;
		    }
		     
		    private static Double minus(Double fn, Double sn){
		        Double result = fn - sn;
		        return result;
		    }
		    private static Double division(Double fn, Double sn) {
		        Double result = fn / sn;
		        return result;
		    }
		     
		    private static Double multiplication(Double fn, Double sn) {
		        Double result = fn * sn;
		        return result;
		    }

}

