import java.io.IOException;
import java.util.Scanner;
 
public class QuantaMandioca {
   
    public static final int[] porcoes = { 300, 1500, 600, 1000, 150 };
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
    
        int somaPorcoes = 0;

	for (int porcao : porcoes){
		somaPorcoes = somaPorcoes + porcao * leitor.nextInt();
	}

	System.out.println(somaPorcoes=somaPorcoes+225);	



        }
        


}
