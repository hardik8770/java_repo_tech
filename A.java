//for Loops
import java.util.*;
class A{
	public static void main(String[] args){
		//case: 1 
		int i = 0;

		for (i = 1 ; i <= 10 ; i++ ){
			System.out.println(i);
		}
		System.out.println("End for loop at i :"+ i);
		

		//case:2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();

		/*for(int i = 0; i < n ; i++){
			for(int j = 0; j < n ; j++){
				System.out.print("*     ");
			}
			System.out.println();
		}*/
		
		for(int i = 0; i < n ; i++){
			for(int j = 0; j <= i ; j++){
				System.out.print("*  ");
			}
			System.out.println();
		}

		System.out.println("Java8");
	}
}