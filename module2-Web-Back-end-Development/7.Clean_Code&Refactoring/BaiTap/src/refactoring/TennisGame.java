package refactoring;

public class TennisGame {

    public static final int score0 = 0;
    public static final int score1 = 1;
    public static final int score2 = 2;
    public static final int score3 = 3;
    private String playerScore = "";
    private int tempScore = 0;
    public static String getScore(String playerName1, String playerName2, int playerScore1, int playerScore2) {

        if (playerScore1 == playerScore2)
        {
            getPlayerScore(playerScore1);
        }
        else if (playerScore1 >= 4 || playerScore2 >= 4)
        {
            int minusResult = playerScore1 - playerScore2;
            if (minusResult == 1)
                playerScore = "Advantage player1";
            else if (minusResult == -1)
                playerScore ="Advantage player2";
            else if (minusResult >= 2)
                playerScore = "Win for player1";
            else
                playerScore ="Win for player2";
        }
        else
        {
            for (int i = 1; i < 3; i++)
            {
                if (i == 1)
                    tempScore = playerScore1;
                else {
                    playerScore = playerScore + "-";
                    tempScore = playerScore1;}
                    switch(tempScore) {
                    case score0:
                        playerScore = playerScore + "Love";
                        break;
                    case score1:
                        playerScore = playerScore + "Fifteen";
                        break;
                    case score2:
                        playerScore = playerScore + "Thirty";
                        break;
                    case score3:
                        playerScore = playerScore + "Forty";
                        break;
                }
            }
        }
        return playerScore;
    }

    private static void getPlayerScore(int playerScore1) {
        switch (playerScore1)
        {
            case score0:
                playerScore = "Love-All";
                break;
            case score1:
                playerScore = "Fifteen-All";
                break;
            case score2:
                playerScore = "Thirty-All";
                break;
            case score3:
                playerScore = "Forty-All";
                break;
            default:
                playerScore = "Deuce";
                break;

        }
    }
}
