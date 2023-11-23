import javax.swing.plaf.synth.SynthScrollBarUI;

public class DemoConditions {
    public static void main(String[] args) {

        char grade = 'A';
        if (grade == 'A') {
            System.out.println("grade=A");
        } else if (grade == 'A') {
            System.out.println("grade=B");
        } else if (grade == 'A') {
            System.out.println("grade=C");
        } else if (grade == 'A') {
            System.out.println("grade=D");
        } else if (grade == 'A') {
            System.out.println("grade=E");
        } else { // grade == 'F'
            System.out.println("Fail");
        }

        // int score = 75;
        // if
        // >=90 -> A, >=80 and <90 -> B, 70-79 -> c, 60-69 -> D
        // 50-59 -> E, <50 -> F
        int score = 75;
        if (score >= 90) {
            System.out.println("your grade is A");
        } else if (score >= 80) {
            System.out.println("your grade is B");
        } else if (score >= 70) {
            System.out.println("your grade is C");
        } else if (score >= 60) {
            System.out.println("your grade is D");
        } else if (score >= 50) {
            System.out.println("your grade is E");
        } else if (score <= 50) {
            System.out.println("your grade is Fail");

        }
        // other code
        int result = 60;
        if (result >= 90 && result <= 100) {
            grade = 'A';
        } else if (result >= 80 && result <= 90) {
            grade = 'B';
        } else if (result >= 70 && result <= 80) {
            grade = 'C';
        } else if (result >= 60 && result <= 70) {
            grade = 'D';
        } else if (result >= 50 && result <= 60) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("you result is" + grade);


        // Approach 2, remove upper limited
        int score2 = 40;
        // score and score2 >= 50, (score+score2) / 2 -> grade
        // either score or score < 50 -> grade F
        // both score and score2 < 50 -> grade
        if ((score + score2) / 2 >= 90) {
            System.out.println("your grade is A");
        } else if ((score + score2) / 2 >= 80) {
            System.out.println("your grade is B");
        } else if ((score + score2) / 2 >= 70) {
            System.out.println("your grade is D");
        } else if ((score + score2) / 2 >= 60) {
            System.out.println("your grade is E");
        } else if ((score + score2) / 2 >= 50) {
            System.out.println("you grade is Fail");
        }


        char grade2 = 'A';
        int score3 = 50;
        int score4 = 90;
        if (score3 < 50 || score4 < 50) {
            grade2 = 'F';
        } else {
            double averageScore2 = (score3 + score4) / 2;
            if (averageScore2 >= 90) {
                grade2 = 'A';
            } else if (averageScore2 >= 80) {
                grade2 = 'B';
            } else if (averageScore2 >= 70) {
                grade2 = 'C';
            } else if (averageScore2 >= 60) {
                grade2 = 'D';
            } else if (averageScore2 >= 50) {
                grade2 = 'E';
            }
            System.out.println("Grade 2 =" + grade2);
        }
    }
}


