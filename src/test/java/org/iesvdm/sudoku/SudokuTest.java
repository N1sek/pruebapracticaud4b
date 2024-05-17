package org.iesvdm.sudoku;

//import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class SudokuTest {

    @Test
    void failTest() {
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardBasedInCluesRandomlySolvable();
        //sudoku.fillBoardBasedInCluesRandomly();
        sudoku.printBoard();
    }

    @Test
    public void testFillBoardRandomly() {
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardRandomly();
        assertNotNull(sudoku.getBoard());
    }

    @Test
    public void testFillBoardBasedInCluesRandomly() {
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardBasedInCluesRandomly();
        assertNotNull(sudoku.getBoard());
    }

    @Test
    public void testFillBoardBasedInCluesRandomlySolvable() {
        //Test falla
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardBasedInCluesRandomlySolvable();
        assertTrue(sudoku.solveBoard());
    }

    @Test
    public void testFillBoardSolvable() {
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardSolvable();
        assertTrue(sudoku.solveBoard());
    }

    @Test
    public void testFillBoardUnsolvable() {
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardUnsolvable();
        assertFalse(sudoku.solveBoard());
    }

    @Test
    public void testPutNumberInBoard() {
        Sudoku sudoku = new Sudoku();
        sudoku.setGridSize(9);
        sudoku.fillBoardRandomly();
        sudoku.putNumberInBoard(5, 0, 0);
        assertEquals(5, sudoku.getBoard()[0][0]);
    }

    @Test
    public void testIsNumberInRow() {
        Sudoku sudoku = new Sudoku();
        sudoku.setGridSize(9);
        sudoku.fillBoardRandomly();
        sudoku.putNumberInBoard(5, 0, 0);
        assertTrue(sudoku.isNumberInRow(5, 0));
    }

    @Test
    public void testIsNumberInColumn() {
        Sudoku sudoku = new Sudoku();
        sudoku.setGridSize(9);
        sudoku.fillBoardRandomly();
        sudoku.putNumberInBoard(5, 0, 0);
        assertTrue(sudoku.isNumberInColumn(5, 0));
    }

    @Test
    public void testIsNumberInBox() {
        Sudoku sudoku = new Sudoku();
        sudoku.setGridSize(9);
        sudoku.fillBoardRandomly();
        sudoku.putNumberInBoard(5, 0, 0);
        assertTrue(sudoku.isNumberInBox(5, 0, 0));
    }

    @Test
    public void testIsValidPlacement() {
        //Test falla
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardRandomly();
        assertTrue(sudoku.isValidPlacement(7, 0, 0));
    }

    @Test
    public void testSolveBoard() {
        Sudoku sudoku = new Sudoku();
        sudoku.fillBoardSolvable();
        assertTrue(sudoku.solveBoard());
    }



}
