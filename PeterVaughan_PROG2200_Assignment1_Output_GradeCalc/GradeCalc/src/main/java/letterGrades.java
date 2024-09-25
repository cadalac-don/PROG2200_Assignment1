import java.util.Scanner;

public class letterGrades {
    int option;
    public void letterSelection(int gradeAverage) {

        System.out.println("\n\nFinal Mark: " + gradeAverage);

        //letter grade
        if (gradeAverage < 60)
            System.out.println("Letter Mark: F\n");

        else if (gradeAverage < 70)
            System.out.println("Letter Mark: D\n");

        else if (gradeAverage < 80)
            System.out.println("Letter Mark: C\n");

        else if (gradeAverage < 90)
            System.out.println("Letter Mark: B\n");

        else if (gradeAverage < 100)
            System.out.println("Letter Mark: A\n");

        else if (gradeAverage == 100)
            System.out.println("Letter Mark A - Perfect Marks\n");
    }

    public void setOption() {
        System.out.println("Enter an integer for the corresponding option \n1 - End Program\n2 - Remove Grade" +
                "\n3 - Read Message Before Exiting \nEnter Number now:");
        Scanner myObj = new Scanner(System.in);
        option = Integer.parseInt(myObj.nextLine());
    }

    public void caseStatement(){

        //Refer to readme file about this
        switch(option){
            case 1 :
                System.out.println("Ending Program");
                break;
            case 2 :
                //Does not actually remove grade - outside scope of class assignment
                System.out.println("Remove Grade");
                break;
            case 3 :
                //we can add a messaging system here if we wanted to expand code
                System.out.println("No Messages Found");
                break;
            default :
                System.out.println("Invalid");
        }
    }
}

