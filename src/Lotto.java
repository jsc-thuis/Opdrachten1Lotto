import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Lotto {
    private Integer[] lottogetallen;
    private int bonusgetal;
    private Random random;

    public Lotto() {
        lottogetallen = new Integer[6];
        bonusgetal = 0;
        random = new Random();
    }

    public void trekking() {
        // array lottogetallen opvullen en afdrukken met for-lus
        lottogetallen[0] = random.nextInt(45) + 1;
        List<Integer> lottoList = Arrays.asList(lottogetallen);
        Integer nieuwGetal;

        System.out.print("De lottogetallen:  " + lottogetallen[0] + "  ");
        for (int i = 1; i < lottogetallen.length; i++) {
            nieuwGetal = random.nextInt(45) + 1;
            while (lottoList.contains(nieuwGetal)) {
                nieuwGetal = random.nextInt(45) + 1;
            }
            lottogetallen[i] = nieuwGetal;
            System.out.print(nieuwGetal + "  ");
        }

        bonusgetal = random.nextInt(45) + 1;
        while (lottoList.contains(bonusgetal)) {
            bonusgetal = random.nextInt(45) + 1;
        }
        System.out.println("  bonusgetal: " + bonusgetal);
    }

    public void sorteer() {
        Integer kopie[] = lottogetallen.clone();  // originele rij blijft behouden
        Arrays.sort(kopie);
        System.out.print("In rekenkundige volgorde:  ");
        for (Integer lottogetal : kopie) {
            System.out.print(lottogetal + "  ");
        }
        System.out.println("  bonusgetal: " + bonusgetal);
    }
}
