public class PP7_10QuizTime {

    public static void main(String args[]){
        PP7_10Quiz quiz = new PP7_10Quiz();
        quiz.addQuestion("this is test1");
        quiz.addQuestion("this is test2");
        quiz.addQuestion("this is test3");
        String quizlist[] = quiz.giveQuiz();
        System.out.println(quizlist[1]);
    }

}
