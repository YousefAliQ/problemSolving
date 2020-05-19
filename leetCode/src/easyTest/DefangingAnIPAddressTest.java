package easyTest;

import easy.DefangingAnIPAddress;

import static org.junit.jupiter.api.Assertions.*;

class DefangingAnIPAddressTest {

    @org.junit.jupiter.api.Test
    void defangIPaddr() {

        assertEquals("1[.]1[.]1[.]1", DefangingAnIPAddress.defangIPaddr( "1.1.1.1"));



    }
}