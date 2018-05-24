public class Room {

    private Player player1;
    private Player player2;
    private int reward;
    private boolean completionStatus;

    public Room(Player player1, Player player2, int reward){
        this.player1 = player1;
        this.player2 = player2;
        this.reward = reward;
        this.completionStatus = false;
    }


    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public int getReward() {
        return this.reward;
    }

    public boolean getCompletionStatus() {
        return this.completionStatus;
    }

    public String getWinner() {
        if (player1.getHealth() > player2.getHealth()){
            return "Player 1 Wins!!!";
        }
        else {
            return "Player 2 Wins!!!";
        }

    }
}
