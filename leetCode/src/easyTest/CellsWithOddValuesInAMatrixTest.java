package easyTest;

import easy.CellsWithOddValuesInAMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CellsWithOddValuesInAMatrixTest {

    @Test
    void oddCells() {

        int temp [][] = {{0,1},{1,1}};
        Assertions.assertEquals(6, CellsWithOddValuesInAMatrix.oddCells(2,3,temp));
    }
}