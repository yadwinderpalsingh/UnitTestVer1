package net.yadwinderpalsingh.unittestver1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yadwinderpalsingh on 2016-09-21.
 */
public class mathTest {

    math m;

    @Before
    public void setUp() throws Exception {
        m = new math();
    }

    @Test
    // Test Identifier: 1.1
    // Test Description: addition of two numbers
    // Method of Execution: Automated
    // Input Data: 2, 1
    // Expected Output: 3
    // Observed Output: Passed, 3
    // Actions: Report if test fails

    public void addition2_1() throws Exception {
        // 1. Arrange
        double i = 2;
        double j = 1;

        // 2. Act
        double result = m.addition(i, j);

        // 3. Assert
        assertEquals(3, result, 0.001);
    }

    @Test
    // Test Identifier: 1.2
    // Test Description: addition of two numbers
    // Method of Execution: Automated
    // Input Data: 5, 14
    // Expected Output: 19
    // Observed Output: Passed, 19
    // Actions: Report if test fails

    public void addition5_14() throws Exception {
        // 1. Arrange
        double i = 5;
        double j = 14;

        // 2. Act
        double result = m.addition(i, j);

        // 3. Assert
        assertEquals(19, result, 0.001);
    }

    @Test
    // Test Identifier: 1.3
    // Test Description: addition of two numbers
    // Method of Execution: Automated
    // Input Data: 7, 18
    // Expected Output: 25
    // Observed Output: Passed, 25
    // Actions: Report if test fails

    public void addition7_18() throws Exception {
        // 1. Arrange
        double i = 18;
        double j = 7;

        // 2. Act
        double result = m.addition(i, j);

        // 3. Assert
        assertEquals(25, result, 0.001);
    }

    @Test
    // Test Identifier: 1.4
    // Test Description: addition of two numbers
    // Method of Execution: Automated
    // Input Data: 100, 150
    // Expected Output: 250
    // Observed Output: Passed, 250
    // Actions: Report if test fails

    public void addition100_150() throws Exception {
        // 1. Arrange
        double i = 100;
        double j = 150;

        // 2. Act
        double result = m.addition(i, j);

        // 3. Assert
        assertEquals(250, result, 0.001);
    }

    @Test
    // Test Identifier: 1.5
    // Test Description: addition of two numbers
    // Method of Execution: Automated
    // Input Data: 200, 110
    // Expected Output: 310
    // Observed Output: Passed, 310
    // Actions: Report if test fails

    public void addition200_110() throws Exception {
        // 1. Arrange
        double i = 200;
        double j = 110;

        // 2. Act
        double result = m.addition(i, j);

        // 3. Assert
        assertEquals(310, result, 0.001);
    }

    @Test
    // Test Identifier: 2.1
    // Test Description: substraction of two numbers
    // Method of Execution: Automated
    // Input Data: 2, 1
    // Expected Output: 1
    // Observed Output: Passed, 1
    // Actions: Report if test fails

    public void substraction2_1() throws Exception {
        // 1. Arrange
        double i = 2;
        double j = 1;

        // 2. Act
        double result = m.substraction(i, j);

        // 3. Assert
        assertEquals(1, result, 0.001);
    }

    @Test
    // Test Identifier: 2.2
    // Test Description: substraction of two numbers
    // Method of Execution: Automated
    // Input Data: 14, 5
    // Expected Output: 9
    // Observed Output: Passed, 9
    // Actions: Report if test fails

    public void substraction14_5() throws Exception {
        // 1. Arrange
        double i = 14;
        double j = 5;

        // 2. Act
        double result = m.substraction(i, j);

        // 3. Assert
        assertEquals(9, result, 0.001);
    }

    @Test
    // Test Identifier: 2.3
    // Test Description: substraction of two numbers
    // Method of Execution: Automated
    // Input Data: 18, 7
    // Expected Output: 11
    // Observed Output: Passed, 11
    // Actions: Report if test fails

    public void substraction18_7() throws Exception {
        // 1. Arrange
        double i = 18;
        double j = 7;

        // 2. Act
        double result = m.substraction(i, j);

        // 3. Assert
        assertEquals(11, result, 0.001);
    }

    @Test
    // Test Identifier: 2.4
    // Test Description: substraction of two numbers
    // Method of Execution: Automated
    // Input Data: 150, 100
    // Expected Output: 50
    // Observed Output: Passed, 250
    // Actions: Report if test fails

    public void substraction150_100() throws Exception {
        // 1. Arrange
        double i = 150;
        double j = 100;

        // 2. Act
        double result = m.substraction(i, j);

        // 3. Assert
        assertEquals(50, result, 0.001);
    }

    @Test
    // Test Identifier: 2.5
    // Test Description: substraction of two numbers
    // Method of Execution: Automated
    // Input Data: 200, 110
    // Expected Output: 90
    // Observed Output: Passed, 90
    // Actions: Report if test fails

    public void substraction200_110() throws Exception {
        // 1. Arrange
        double i = 200;
        double j = 110;

        // 2. Act
        double result = m.substraction(i, j);

        // 3. Assert
        assertEquals(90, result, 0.001);
    }


    @Test
    // Test Identifier: 3.1
    // Test Description: multiplication of two numbers
    // Method of Execution: Automated
    // Input Data: 2, 1
    // Expected Output: 2
    // Observed Output: Passed, 2
    // Actions: Report if test fails

    public void multiplication2_1() throws Exception {
        // 1. Arrange
        double i = 2;
        double j = 1;

        // 2. Act
        double result = m.multiplication(i, j);

        // 3. Assert
        assertEquals(2, result, 0.001);
    }

    @Test
    // Test Identifier: 3.2
    // Test Description: multiplication of two numbers
    // Method of Execution: Automated
    // Input Data: 14, 5
    // Expected Output: 70
    // Observed Output: Passed, 70
    // Actions: Report if test fails

    public void multiplication14_5() throws Exception {
        // 1. Arrange
        double i = 14;
        double j = 5;

        // 2. Act
        double result = m.multiplication(i, j);

        // 3. Assert
        assertEquals(70, result, 0.001);
    }

    @Test
    // Test Identifier: 3.3
    // Test Description: multiplication of two numbers
    // Method of Execution: Automated
    // Input Data: 18, 7
    // Expected Output: 126
    // Observed Output: Passed, 126
    // Actions: Report if test fails

    public void multiplication18_7() throws Exception {
        // 1. Arrange
        double i = 18;
        double j = 7;

        // 2. Act
        double result = m.multiplication(i, j);

        // 3. Assert
        assertEquals(126, result, 0.001);
    }

    @Test
    // Test Identifier: 3.4
    // Test Description: multiplication of two numbers
    // Method of Execution: Automated
    // Input Data: 150, 100
    // Expected Output: 15000
    // Observed Output: Passed, 15000
    // Actions: Report if test fails

    public void multiplication150_100() throws Exception {
        // 1. Arrange
        double i = 150;
        double j = 100;

        // 2. Act
        double result = m.multiplication(i, j);

        // 3. Assert
        assertEquals(15000, result, 0.001);
    }

    @Test
    // Test Identifier: 3.5
    // Test Description: multiplication of two numbers
    // Method of Execution: Automated
    // Input Data: 200, 110
    // Expected Output: 22000
    // Observed Output: Passed, 22000
    // Actions: Report if test fails

    public void multiplication200_110() throws Exception {
        // 1. Arrange
        double i = 200;
        double j = 110;

        // 2. Act
        double result = m.multiplication(i, j);

        // 3. Assert
        assertEquals(22000, result, 0.001);
    }

    @Test
    // Test Identifier: 4.1
    // Test Description: division of two numbers
    // Method of Execution: Automated
    // Input Data: 2, 1
    // Expected Output: 2
    // Observed Output: Passed, 2
    // Actions: Report if test fails

    public void division2_1() throws Exception {
        // 1. Arrange
        double i = 2;
        double j = 1;

        // 2. Act
        double result = m.division(i, j);

        // 3. Assert
        assertEquals(2, result, 0.001);
    }

    @Test
    // Test Identifier: 4.2
    // Test Description: division of two numbers
    // Method of Execution: Automated
    // Input Data: 14, 5
    // Expected Output: 2.8
    // Observed Output: Passed, 2.8
    // Actions: Report if test fails

    public void division14_5() throws Exception {
        // 1. Arrange
        double i = 14;
        double j = 5;

        // 2. Act
        double result = m.division(i, j);

        // 3. Assert
        assertEquals(2.8, result, 0.001);
    }

    @Test
    // Test Identifier: 4.3
    // Test Description: division of two numbers
    // Method of Execution: Automated
    // Input Data: 18, 7
    // Expected Output: 2.571
    // Observed Output: Passed, 2.571
    // Actions: Report if test fails

    public void division18_7() throws Exception {
        // 1. Arrange
        double i = 18;
        double j = 7;

        // 2. Act
        double result = m.division(i, j);

        // 3. Assert
        assertEquals(2.571, result, 0.001);
    }

    @Test
    // Test Identifier: 4.4
    // Test Description: multiplication of two numbers
    // Method of Execution: Automated
    // Input Data: 150, 100
    // Expected Output: 1.5
    // Observed Output: Passed, 1.5
    // Actions: Report if test fails

    public void division150_100() throws Exception {
        // 1. Arrange
        double i = 150;
        double j = 100;

        // 2. Act
        double result = m.division(i, j);

        // 3. Assert
        assertEquals(1.5, result, 0.001);
    }

    @Test
    // Test Identifier: 4.5
    // Test Description: division of two numbers
    // Method of Execution: Automated
    // Input Data: 200, 100
    // Expected Output: 2
    // Observed Output: Passed, 2
    // Actions: Report if test fails

    public void division200_100() throws Exception {
        // 1. Arrange
        double i = 200;
        double j = 100;

        // 2. Act
        double result = m.division(i, j);

        // 3. Assert
        assertEquals(2, result, 0.001);
    }

}