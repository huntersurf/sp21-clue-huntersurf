package edu.miracosta.cs113;

import model.Theory;
import model.AssistantJack;
import model.TheoryItem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JaneSolver {
    public static void main(String[] args) {
        // DECLARATION + INITIALIZATION
        int answerSet, solution, murder, weapon, location;
        Theory answer = null;
        AssistantJack jack;
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> wrongAnswers = new ArrayList<Integer>();

        // INPUT
        System.out.print("Which theory would like you like to test? (1, 2, 3[random]): ");
        answerSet = keyboard.nextInt();

        jack = new AssistantJack(answerSet);



        do {
            weapon = random.nextInt(6) + 1;
            location = random.nextInt(10) + 1;
            murder = random.nextInt(6) + 1;
            solution = jack.checkAnswer(weapon, location, murder);

            if(solution == 1)
            for(int i = 1; i <= 6; i++) {
                System.out.println(jack.checkAnswer(i, i, i));
            }

            System.out.println(weapon + ", " + location + ", " + murder + " solution: " + solution);
        } while (solution != 0);

        System.out.println(jack.checkAnswer(weapon, location, murder));

        solution = jack.checkAnswer(weapon, location, murder);


        answer = new Theory(weapon, location, murder);

        System.out.println(jack.getTimesAsked());

    }
}
