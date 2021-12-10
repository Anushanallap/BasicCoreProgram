
import java.util.Scanner;

public class FlipCoin {
	
public static void main(String[] args) {
		
		int x , h_cnt = 0, t_cnt = 0;
		double heads, tails;


		System.out.print("enter no. of times you want to flip the coin: ");
		Scanner n  =  new Scanner(System.in);
		  x = n.nextInt();
		for (int j = 0; j < x; j++) {
			double random = Math.random();
			System.out.println(random);
			if (random < 0.5)
				t_cnt++;
			else
				h_cnt++;
		}

		heads = h_cnt / (double) x * 100;
		tails = t_cnt / (double) x * 100;
		System.out.println("Percentage of heads: " + heads + "%");
		System.out.println("Percentage of tails: " + tails + "%");

	}

}

