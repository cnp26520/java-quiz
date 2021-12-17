import java.util.Scanner;

interface Quizzes{
     public void greeting();
}
public class QuizProgram implements Quizzes{
     public void greeting(){
          System.out.println("                Thanks for coming to the quiz!");
     }
     static QuizProgram myquiz = new QuizProgram();

     //Initializaions and Instantiations
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args)
    {     
           double score = 0;
           final double NumberofQuestions = 5;

          System.out.println("\n\n\n\n\n\n\n\t\tQuiz 1.0\n\n");

           //Store questions and answers in 2 dimensional array
           String[][] QandA = {
                               {"What element on the periodic table is represented by Ga:?","\nPress 1 for Gallium \nPress 2 for Georgium  \nPress 3 for Gabium \nPress 4 for Gapium ","1"},
                               {"What element on the periodic table is represented by N:?","\nPress 1 for Nitro \nPress 2 Nitrogen \nPress 3 for Nicotine \nPress 4 Nickel ","2"},
                               {"What element on the periodic table is represented by O:?","\nPress 1 for Oxycodin \nPress 2 for Opium  \nPress 3 for Oxygen \nPress 4 for Onyx ","3"},
                               {"What element on the periodic table is represented by He:?","\nPress 1 for Hydrogen \nPress 2 for Hopium  \nPress 3 for Heatorium \nPress 4 for Helium ","4"},
                               {"What element on the periodic table is represented by Au:?","\nPress 1 for Plutonium \nPress 2 Australium  \nPress 3 for Aubergine \nPress 4 for Gold ","4"} };
          String[] Answers = new String[(int) NumberofQuestions];

         //loop through each string in the array and compare it to answers
         //for(int x = 0; x < NumberofQuestions; x++)
          int x=0;
          do
         {
              System.out.print("" + (x+1) + ". " + QandA[x][0] + "   "+QandA[x][1]);

              Answers[x] = String.valueOf(cin.nextInt());

              Answers[x].toLowerCase();

              if(QandA[x][2].equals(Answers[x]))
              {
                   score++;
              }//close if 
              else
              {
                  System.out.println("\n Incorrect. The right answer is "+QandA[x][2]);
              }

              System.out.print("\n");
              x++;
         }while(x<NumberofQuestions);//close outer loop                                 
         
         System.out.println("\n\t\tYou got " + score + " of "
                            + NumberofQuestions + " right!\n\n\n"); 

         System.out.println("\n\t\tYour percentage is " + ((score/NumberofQuestions)*100)+"%"); 

         

         
         
         myquiz.greeting();
         System.exit(0);
    }//close main() function  
//-------------------------------------------------------------------------------

}//close Quiz class