public class Pen {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.println("Pen per student is: " + pensPerStudent);
        System.out.println("Remaining not distributed is: " + remainingPens);
    }
}



//OUTPUT ->

// Pen per student is: 4
// Remaining not distributed is: 2
