import java.io.IOException;
import java.util.Scanner;

public class VolumeDaTv{
	public static void main(String[] args) throws IOException{
		Scanner leitor = new Scanner(System.in);
		int V = leitor.nextInt();
		int T = leitor.nextInt();

		for (int trocas=0; trocas<T; trocas++){
			V = V + leitor.nextInt();
			
			if (V>100){
			  V=100;
			} else if(V<0){
			  V=0;
			}
		}
	System.out.println(V);
	}
}
