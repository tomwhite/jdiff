package com.acme.spextra;

import java.lang.*;

/**
 * This class is the new class for add-ons to SuperProduct.
 */
public class AddOns {

    /** Default constructor. */
    public AddOns() {
    }

    /** 
     * Switch SuperProduct to hyperdrive.
     *
     * @param warpSpeed How fast to go.
     * @return If successful, return true.
     */
    public boolean hyperdrive(int warpSpeed) {
        if (warpSpeed < 8)
            return true;
        else
            return false; // "The engine's canna handle it, cap'n!"
    }

}
