import java.util.Objects;
import java.util.Scanner;

public class allNumbers {
    int[] marksArray = new int[12];
    int input_grade;

    public void assignmentNumber(int i) {
        input(i);
    }

    public void assignmentMarks(int i) {
        System.out.println((i) + ": " + marksArray[i]);
    }

    public void projectNumber(int i) {
        input(i);
    }

    public void projectMarks(int i) {
        System.out.println((i) + ": " + marksArray[i]);
    }

    public void quizNumber(int i) {
        inputQUIZ(i);
    }

    public void quizMarks(int i) {
        System.out.println((i) + ": " + marksArray[i--]);
    }

    public void input(int i) {

        while (true) {

            System.out.println("Enter grade #" + i + ": ");
            Scanner myObj = new Scanner(System.in);
            input_grade = Integer.parseInt(myObj.nextLine());
            System.out.println("Grade: " + input_grade);

            //verify number between 0 and 100 - be part of the other question
            if ((input_grade > -1) && (input_grade < 101))
                System.out.println("Accepted");
            else {
                System.out.println("Not Accepted\n");
                continue;
            }

            //was the homework submitted in time?
            System.out.println("Was homework submitted on time? (Y/N)");
            String choice = myObj.nextLine();  // Read user input

            if ((Objects.equals(choice, "Y")) || (Objects.equals(choice, "N"))) {
                if (Objects.equals(choice, "Y"))
                    System.out.println("Accepted - Not Late\n");

                if (Objects.equals(choice, "N")) {
                    System.out.println("Accepted - Late");
                    System.out.println("Grade: " + (int) (input_grade * 0.80) + "\n");
                    input_grade = (int) (input_grade * 0.80);
                }

                //System.out.println("\n\n");
                int j = i--;
                marksArray[j] = input_grade;
                //System.out.println(j + "  " + input_grade);
                //System.out.println("class value:" + marksArray[j]);
                return;
            } else
                System.out.println("Not Accepted\n");

        }

    }

    public void inputQUIZ(int i) {
        if(i!=12) {
            while (true) {

                System.out.println("Enter grade #" + i + ": ");
                Scanner myObj = new Scanner(System.in);
                input_grade = Integer.parseInt(myObj.nextLine());
                System.out.println("Grade: " + input_grade);

                //verify number between 0 and 100 - be part of the other question
                if ((input_grade > -1) && (input_grade < 101))
                    System.out.println("Accepted");
                else {
                    System.out.println("Not Accepted");
                    continue;
                }

                //System.out.println("\n\n");
                int j = i--;
                marksArray[j] = input_grade;
                //System.out.println(j + "  " + input_grade);
                return;
            }
        }
        else{
            while(true) {
                int placeHolder;
                System.out.println("Enter grade #" + i + ": ");
                Scanner myObj = new Scanner(System.in);
                input_grade = Integer.parseInt(myObj.nextLine());
                System.out.println("Grade: " + input_grade);

                //verify number between 0 and 100 - be part of the other question
                if ((input_grade > -1) && (input_grade < 101))
                    System.out.println("Accepted");
                else {
                    System.out.println("Not Accepted");
                    continue;
                }

                for (int j = 6; j < 12; j++) {
                    if (input_grade > marksArray[j]) {
                        placeHolder = marksArray[j];
                        marksArray[j] = input_grade;
                        input_grade = placeHolder;
                    }
                }
                return;
            }
        }
    }

    public void totalGrade(){
        int avg, sum = 0;
        int length = marksArray.length;
        for(int i = 0; i < marksArray.length; i++) {
            sum += marksArray[i];
        }

        avg = sum / (length-1);
        //System.out.println("\nFinal Mark: "+ avg);

        letterGrades letters1 = new letterGrades();
        letters1.letterSelection(avg);
    }

}
