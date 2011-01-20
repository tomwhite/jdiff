package ChangedPackage;

import java.io.*;

/** 
 * NEW: The changes in this class are to do with changes in deprecation, 
 * modifiers, or exceptions.
 */
public abstract class ChangedClassModifiers {

    /** This constructor should remain unchanged. */
    public ChangedClassModifiers() {
    }

    /** 
     * This constructor should have been changed from protected to public. 
     */
    public ChangedClassModifiers(int removed) {
    }

    /** 
     * This constructor should have been deprecated. 
     *
     * @deprecated Deprecated to test JDiff.
     */
    public ChangedClassModifiers(int a, int b) {
    }

    /** 
     * This constructor should have been changed from deprecated to 
     * non-deprecated. 
     */
    public ChangedClassModifiers(int a, String b) {
    }

    /** 
     * This constructor should have removed exceptions. 
     */
    public ChangedClassModifiers(long a) {
    }
    /** This constructor should have added exceptions. */
    public ChangedClassModifiers(long a, long b) throws Exception, IOException, FileNotFoundException {
    }
    /** This constructor should have changed exceptions. */
    public ChangedClassModifiers(long a, long b, long c) throws Exception, IOException {
    }

    /** This method should remain unchanged. */
    public void UnchangedMethod() {
    }

    /** This method should have been changed from static to non-static. */
    public void MethodBecomesNonStatic() {
    }
    /** This method should have been changed from non-static to static. */
    public static void MethodBecomesStatic() {
    }

    /** This method should have been changed from abstract to non-abstract. */
    public void MethodBecomesNonAbstract() {
    }
    /** This method should have been changed from non-abstract to abstract. */
    public abstract void MethodBecomesAbstract();

    /** This method should have removed exceptions. */
    public void MethodRemovesExceptions() {
    }

    /** This method should have added exceptions. */
    public void MethodAddsExceptions() throws Exception, IOException, FileNotFoundException {
    }

    /** 
     * This method should have changed exceptions. In fact, the 
     * exceptions' order was just reversed.  
     */
    public void MethodChangesExceptions() throws IOException, Exception {
    }

    /** This method should have changed exceptions. */
    public void MethodChangesExceptions2() throws Exception, IOException {
    }

    /** This method should have changed from native to non-native. */
    public void MethodChangesNativeToNonNative() {
    }
    /** This method should have changed from non-native to native. */
    public native void MethodChangesNonNativeToNative();

    /** This method should have changed from synchronized to non-synchronized. */
    public void MethodChangesSynchronizedToNonSynchronized() {
    }
    /** This method should have changed from non-synchronized to synchronized. */
    public synchronized void MethodChangesNonSynchronizedToSynchronized() {
    }

    /** This field should remain unchanged. */
    public boolean unchanged;

    /** This field should have been changed from final to non-final. */
    public boolean changedFinalToNonFinal = false;
    /** This field should have been changed from final to non-final. */
    public final boolean changedNonFinalToFinal = false;

    /** This field should have been changed from public to protected. */
    protected String fromPublicToProtected;
    /** This field should have been changed from protected to public. */
    public String fromProtectedToPublic;

    /** This field should have been changed from static to non-static. */
    String fromStaticToNonStatic;
    /** This field should have been changed from non-static to static. */
    static String fromNonStaticToStatic;

    /** This field should have been changed from transient to non-transient. */
    String fromTransientToNonTransient;
    /** This field should have been changed from non-transient to transient. */
    transient String fromNonTransientToTransient;

    /** This field should have been changed from volatile to non-volatile. */
    String fromVolatileToNonVolatile;
    /** This field should have been changed from non-volatile to volatile. */
    volatile String fromNonVolatileToVolatile;

}
