package com.example.javaproject2.week7.Day4.test;

import com.example.javaproject2.week7.Day4.service.OpGame;
import com.example.javaproject2.week7.Day4.service.PlusOperatorLevelOne;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

/**
 * @author jun
 * <p>
 * 1. 덧셈
 * 2. 기회 3회
 * 3. 격려
 * 4. 결과는 10 이하
 */
public class GameTest {

    @Test
    public void test() {
        OpGame game = new OpGame(new PlusOperatorLevelOne());

        game.makeQuestion();
        String question = game.getQuestion();

        assertEquals("1 + 1 = ", question);
        assertEquals(3, game.getRemainingAnswers());
        assertEquals(false, game.isAnswer(3));
        assertEquals(2, game.getRemainingAnswers());
        assertEquals("한번 더 해보자", game.getCheeringUpMsg());
        assertEquals(true, game.isAnswer(2));
    }

    @Test
    public void testRandom() {
        System.out.println((int) (Math.random() * 10));
    }

    @Test
    public void testSumMax(int max) {
        max = 10;
        int a = (int) (Math.random() * max);
        int b = (int) (Math.random() * (max - a));
        System.out.printf("%d + %d = %d", a, b, a + b);
        assertTrue(a + b < max);
    }

    @Test
    public void testMinus() {
        int max = 10;
        int a = (int) (Math.random() * max);
        int b = (int) (Math.random() * (max));
        if (a < b) {
            int tmp = b;
            a = b;
            b = tmp;
        }
        System.out.printf("%d + %d = %d", a, b, a - b);
        assertTrue(a + b >= 0);
    }

}

