import java.util.Random;

public class CPU implements RPSinterface {
    private final Random random;

    public CPU(Random random) {
        this.random = random;
    }

    public String play() {
        return CHOICES[this.random.nextInt(CHOICES.length)];
    }
}