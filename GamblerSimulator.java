import java.util.Random;
public class GamblerSimulator {
    public static int STAKE = 100;
    public static final int BET = 1;
	public static final int WIN = 1;
	public static final int LOOSE = 0;

    public static void main(String[] args) {
        System.out.println("Gambler starts betting for the day with : " + STAKE);
		Random random = new Random();
		int rand = random.nextInt(2);
		if(rand == WIN){
			STAKE = (STAKE + BET);	
		}
		else{
			STAKE = (STAKE - BET);
		}
		System.out.println("After Betting : " + STAKE);
    }
}
