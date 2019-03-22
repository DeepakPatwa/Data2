package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void initializeBoard() {
        ChessBoard cb = new ChessBoard();
        String[][] Board=new String[8][8];
        String[][] checkBoard={{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
        assertArrayEquals("InitializeBoard is failing ",checkBoard, cb.InitializeBoard(Board));
    }
}