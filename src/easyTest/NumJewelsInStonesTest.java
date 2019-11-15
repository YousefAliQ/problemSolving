package easyTest;

import easy.NumJewelsInStones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumJewelsInStonesTest {

    @Test
    void numJewelsInStones() {
        Assertions.assertEquals(3, NumJewelsInStones.numJewelsInStones("aA", "aAAbbbb"));
    }
}