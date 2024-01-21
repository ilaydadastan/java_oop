package oop_quiz_application;

import java.util.Scanner;

public class Quiz {
    void begin() {
        Question q1 = new Question("Which is a valid keyword in java?",
                "interface", "inherit", "derive", new Answer("interface"));
        Question q2 = new Question("Where does an object get created in memory?",
                "Stack", "Queue", "Heap", new Answer("Heap"));
        Question q3 = new Question("Which keyword is used to prevent a method from getting overriden?",
                "extends", "final", "static", new Answer("final"));

        Question[] questionArr = {q1, q2, q3};
        int countTotal = 0;
        int countCorrect = 0;
        int countWrong = 0;

        for (Question q : questionArr) {
            System.out.println(q.getQuestion());
            System.out.println("A. " + q.getOption1());
            System.out.println("B. " + q.getOption2());
            System.out.println("C. " + q.getOption3());

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            char option = scanner.next().charAt(0);
            String answer = "";

            switch (option) {
                case 'A':
                    answer = q.getOption1();
                    break;
                case 'B':
                    answer = q.getOption2();
                    break;
                case 'C':
                    answer = q.getOption3();
                    break;
                default:
                    break;
            }

            if (answer.equals(q.answer.getAnswer())) {
                System.out.println("...........");
                System.out.println("Correct Answer");
                countCorrect++;
            } else {
                System.out.println("...........");
                System.out.println("Wrong Answer");
                countWrong++;
            }
            countTotal++;
        }
        IResult result = new Result(countTotal, countCorrect, countWrong);
        result.showResult();

    }
}
