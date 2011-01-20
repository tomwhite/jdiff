package com.acme.sp;

import java.lang.*;

/**
 * This class is the implementation of the interface SP.
 */
public abstract interface SP {

    /** 
     * This method must be implemented by all classes which implement this 
     * interface.
     */
    public int saveName(String name, int value);
}
