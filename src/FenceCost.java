import java.util.Scanner;

public class FenceCost {

	
	public static void main (String[]args){
		
		int wodden_fence=25;
		int chain_fence=15;
		int gate_cost=150;
		int building_permit=50;
		double tax_rate=.06;
		
		System.out.println("Enter the perimeter of the yard in feet ");
		Scanner sc = new Scanner(System.in);
	    int fence_length = sc.nextInt();
		
	    System.out.println("Enter the no of gates desired");
		Scanner se = new Scanner(System.in);
	    int no_of_gates = sc.nextInt();
	    
		
		
		double total_cost= wodden_fence*fence_length+ no_of_gates*gate_cost + building_permit;
		double tax= total_cost*tax_rate;
		double final_cost= total_cost +tax_rate;
		
		
		System.out.println("The total cost is $ "+ final_cost);
		
		
	}
}
