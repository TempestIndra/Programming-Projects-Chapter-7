public class PP7_11Quiz {

    private String [][] quiz = new String [25][2];
    public int questionNum = 0;

    public void addQuestion (String addQ)//adds questions to quiz
    {
        quiz[questionNum][0] = addQ;
        quiz[questionNum][1] = null;
        questionNum++;
    }

    public void addQuestion (String addQ, int Complexity)//adds questions to quiz
    {
        quiz[questionNum][0] = addQ;
        quiz[questionNum][1] = Integer.toString(Complexity);
        questionNum++;
    }
    public String[][] giveQuiz ()//give the quiz to the user
    {
        return quiz;
    }
}
