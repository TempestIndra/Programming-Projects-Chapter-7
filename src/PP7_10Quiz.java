public class PP7_10Quiz {

    private String [] quiz = new String [25];
    public int questionNum = 0;

    public void addQuestion (String addQ)//adds questions to quiz
    {
        quiz[questionNum] = addQ;
        questionNum++;
    }

    public String[] giveQuiz ()//give the quiz to the user
    {
        return quiz;
    }
}

/*
 * Define a class Quiz that manage a set of up to 25
 * question objects, Define the add method of the main Quiz class
 * to add a question to a quiz. Define the giveQuiz method of the
 * Quiz class to present each question in turn to the user, accept an
 * answer for each one ,and keep track of the results. Define a class
 * called QuizTime with a main method that populates a quiz, presents
 * it,and prints the final result
 * */