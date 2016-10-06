package defaultPackage;
import com.ryanjamesbrown.TRJcalculator.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		boolean isTrue = false;
		
		ArrayList<Integer> num = new ArrayList<Integer>();  
		ArrayList<String> opEntered = new ArrayList<String>();  
		
		int count = 0;
		
		Scanner inp = new Scanner(System.in);
		
		Calculator workoutEq1 = new Calculator();
		
		System.out.print("Amazing Calculator:\n");

		do {

			System.out.println("Number:\n");
			
			String temp = inp.next();
			int tempNum = 0;
			
			try {
				tempNum = Integer.parseInt(temp);
			} catch(NumberFormatException e){
				System.out.println("Please enter a number");
			}
			
			num.add(tempNum);
			
			System.out.println("Operator:\n");
			
			String opE = inp.next();
			opEntered.add(opE);
			
			count = count + 1;
			
			if(opE.equals("f")){
				
				int be = opEntered.size() - 1;
				opEntered.remove(be);
				
				workoutEq1.setEquation(num, opEntered);
				
				workoutEq1.getTotal();
				workoutEq1.resetTotal();
			}
			
			if(opE.equals("r")){
				num.clear();
				opEntered.clear();
				workoutEq1.resetTotal();
			}
			
			if(inp.equals("e")){
				System.out.println("Bye Bye...");
				System.exit(0);
			}
			
		} while(isTrue != true);
		

	}

}
