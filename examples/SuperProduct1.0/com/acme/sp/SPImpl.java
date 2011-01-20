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
     */
    public int saveName(String name, int value) {
        return 1;
    }

    /** This method will be be removed one day. */
    protected static void createTable(SP instance) {
    }

    /** Not sure if we've got the signature quite right in this release. */
    protected void buildLog(String logName, int timeout) {
    }
}
