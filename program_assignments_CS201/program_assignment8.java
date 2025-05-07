
import java.util.*;
public class program_assignment8 {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.print("How many scores?");
        int score_num= keyboard.nextInt();
        double[] scores= new double[score_num];
        double total_score=0;
        double avg_score= 0;
        double max= scores[0];
        double avg_difference= 0;
        String above_or_below="";
        for(int i=0; i<score_num; i++)
        {
            System.out.print("Enter a score:");
            scores[i]=keyboard.nextDouble();
            total_score= total_score + scores[i];
            avg_score= (total_score/ scores.length);
            if(scores[i] > max)
            {
             max= scores[i];
            }
        }
        keyboard.close();

        System.out.printf("The average score is %.2f", avg_score);
        System.out.println();
        System.out.printf("The highest score is %.1f", max);
        System.out.println();
        

        for (int i=0; i < scores.length; i++)
        {
            if (scores[i] < avg_score)
            {
                above_or_below= "below"; 
                avg_difference= avg_score- scores[i]; 
                System.out.printf("%.1f is %s average by %.2f", scores[i], above_or_below, avg_difference);
                System.out.println();
                
            } else if (scores[i] > avg_score)
            {
                above_or_below= "above";
                avg_difference= scores[i]- avg_score; 
                System.out.printf("%.1f is %s average by %.2f", scores[i], above_or_below, avg_difference);
                System.out.println();
               
                
            }else
                System.out.println(scores[i] + " is equal to the average");
                
            
        }
    
        
    }

    
}
