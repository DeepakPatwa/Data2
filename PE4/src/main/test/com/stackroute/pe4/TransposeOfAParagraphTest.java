package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfAParagraphTest {

    @Test
    public void transpose() {
        TransposeOfAParagraph transposeOfAParagraph=new TransposeOfAParagraph();
        String InputString="a quick brown fox jumps over the lazy dog";
        String ExpectedString="a kciuq nworb xof spmuj revo eht yzal god";
        String ResultingString=transposeOfAParagraph.Transpose(InputString);

        assertEquals("TransposeOfAParagraph is failing",ExpectedString,ResultingString);
    }
}