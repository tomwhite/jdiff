package com.acme.sp;

import java.lang.*;

/**
 * This class is the interface for accessing an SP object.
 */
public class SPImpl implements SP {

    /** Default constructor. */
    private SPImpl() {
    }
    
    /** Method to create a new SP object, hidden for future flexibility. */
    public static SP createSP() {
        SPImpl spimpl = new SPImpl();
        return spimpl;
    }

    /** 
     * This method was inherited from the SP interface.
     *
     * @deprecated Use some other method instead.
     */
    public int saveName(String name, int value) {
        return 1;
    }

    /** 
     * This is the new method for flushing tables. 
     *
     * @since SuperProduct 2.0
     */
    public void flushTable(SP instance) {
    }

    /** 
     * We've changed the signature in the 2.0 release. 
     */
    public static void buildLog(String logName, int timeout, 
                                boolean isDisk, int numRollovers) {
    }
}
