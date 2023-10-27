import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MegaSena {
    public static void main(String[] args) {
        int numberOfPicks = 6; // Número de escolhas na Mega-Sena
        int minNumber = 1;
        int maxNumber = 60;

        Set<Integer> picks = new HashSet<>();

        Random random = new Random();

        while (picks.size() < numberOfPicks) {
            int randomPick = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            picks.add(randomPick);
        }

        System.out.println("Números da Mega-Sena: " + picks);
    }
}
