public class Main {

    public static void main (String[] ARGS) {
        System.out.println("Welcome to our class calculator!");

        allNumbers Number1 = new allNumbers();

        //I need error-handling for letter in number areas
        System.out.println("Enter grades for Assignments!");
        for(int i = 1; i < 6; i++) {
            Number1.assignmentNumber(i);
        }

        System.out.println("\nAssignment Marks");
        for(int i = 1; i < 6; i++) {
            Number1.assignmentMarks(i);
        }

        System.out.println("\nEnter grades for Projects!");
        for(int i = 6; i < 7; i++) {
            Number1.projectNumber(i);
        }

        System.out.println("\nProject Marks");
        for(int i = 6; i < 7; i++) {
            Number1.projectMarks(i);
        }

        //I need to lose the lowest mark and add 1 to i
        System.out.println("\nEnter grades for Quizzes");
        for(int i = 7; i < 13; i++) {
            Number1.quizNumber(i);
        }

        System.out.println("\nQuiz Marks");
        for(int i = 7; i < 12; i++) {
            Number1.quizMarks(i);
        }

        Number1.totalGrade();

        selection selectionOptions = new selection();
        selectionOptions.setOption();
        selectionOptions.caseStatement();
    }
}
