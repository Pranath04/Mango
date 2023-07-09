package mango;
import java.util.Scanner;

public class Mango{
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int rows=scan.nextInt();
		int columns=scan.nextInt();
		int tree_number=scan.nextInt();
		scan.close();
		if((tree_number<=(rows *columns))&& ((1<=tree_number && tree_number<=rows)|| tree_number%rows==1 || tree_number%rows==0)){
			System.out.println(true);
			
		}
		else {
			System.out.println(false);
		}
	}
}