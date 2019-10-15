public interface RPSinterface {
    String[] CHOICES = new String[] { "Rock", "Paper", "Scissors" };

    /**
     * Returns one of "Rock", "Paper", or "Scissors".
     */
    String play();
}