public class GameTracker {
    private int gamesPlayed;
    private int gamesWon;
    private double winPerc;

    public GameTracker(){

    }
    public void setGamesPlayed(int played){
        this.gamesPlayed = played;
    }
    public int getGamesPlayed(){
        return gamesPlayed;
    }
    public void setGamesWon(int won){
        this.gamesWon = won;
    }
    public int getGamesWon(){
        return gamesWon;
    }
    public void setWinPerc(int gamesPlayed, int gamesWon){
        this.winPerc = (double)(gamesWon/gamesPlayed) * 100;
    }
    public double getWinPerc(){
        return winPerc;
    }
    public String printStats(){
        return "You played " + gamesPlayed + ". You won " + gamesWon +
                ". \n Your win percentage is: " + winPerc + "%"; //FIXME (limit digits displayed)
    }
}
