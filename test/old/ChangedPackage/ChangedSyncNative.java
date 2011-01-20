package ChangedPackage;

import java.io.*;

/* OLD */

/** 
 * The changes in this class are to do with changes in synchronized and 
 * native. These changes will not be seen unless -showAllChanges is used.
 */
public abstract class ChangedSyncNative {

    /** This constructor should remain unchanged. */
    public ChangedSyncNative() {
    }
    /** This method should have changed from native to non-native. */
    public native void MethodChangesNativeToNonNative();

    /** This method should have changed from non-native to native. */
    public void MethodChangesNonNativeToNative() {
    }

    /** This method should have changed from synchronized to non-synchronized. */
    public synchronized void MethodChangesSynchronizedToNonSynchronized() {
    }
    /** This method should have changed from non-synchronized to synchronized. */
    public void MethodChangesNonSynchronizedToSynchronized() {
    }
}
