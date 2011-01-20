package com.acme.util;

import java.lang.*;

/**
 * This class contains utility methods for SP and
 * should be removed in a later release.
 *
 * @deprecated No replacement.
 */
public class SPUtil {

    /** 
     * Return the bracketed form of the given String. 
     *
     * @param st The string to be bracketed.
     * @return The bracketed string.
     */
    public static String bracketedString(String st) {
        String bs = "[" + st + "]";
        return bs;
    }

}
