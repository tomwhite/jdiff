package ChangedPackage;

import java.io.*;

/** 
 * OLD: The changes in this class are to do with changes in deprecation, 
 * modifiers, or exceptions.
 */
public abstract class ChangedClassModifiers {

    /** This constructor should remain unchanged. */
    public ChangedClassModifiers() {
    }

    /** This constructor should have been changed from protected to public. */
    protected ChangedClassModifiers(int removed) {
    }

    /** 
     * This constructor should have been deprecated. 
     */
    public ChangedClassModifiers(int a, int b) {
    }

    /** 
     * This constructor should have been changed from deprecated to 
     * non-deprecated. 
     *
     * @deprecated Deprecated to test JDiff.
     */
    public ChangedClassModifiers(int a, String b) {
    }

    /** This constructor should have removed exceptions. */
    public ChangedClassModifiers(long a) throws Exception {
    }
    /** This constructor should have added exceptions. */
    public ChangedClassModifiers(long a, long b) throws Exception, IOException {
    }
    /** This constructor should have changed exceptions. */
    public ChangedClassModifiers(long a, long b, long c) throws Exception, FileNotFoundException {
    }

    /** This method should remain unchanged. */
    public void UnchangedMethod() {
    }

    /** This method should have been changed from static to non-static. */
    public static void MethodBecomesNonStatic() {
    }
    /** This method should have been changed from non-static to static. */
    public void MethodBecomesStatic() {
    }

    /** This method should have been changed from abstract to non-abstract. */
    public abstract void MethodBecomesNonAbstract();
    
    /** This method should have been changed from non-abstract to abstract. */
    public void MethodBecomesAbstract() {
    }

    /** This method should have removed exceptions. */
    public void MethodRemovesExceptions() throws Exception {
    }

    /** This method should have added exceptions. */
    public void MethodAddsExceptions() throws Exception, IOException {
    }

    /** This method should have changed exceptions. */
    public void MethodChangesExceptions() throws Exception, IOException {
    }

    /** This method should have changed exceptions. */
    public void MethodChangesExceptions2() throws Exception, FileNotFoundException  {
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

    /** This field should remain unchanged. */
    public boolean unchanged;

    /** This field should have been changed from final to non-final. */
    public final boolean changedFinalToNonFinal = false;
    /** This field should have been changed from final to non-final. */
    public boolean changedNonFinalToFinal = false;

    /** This field should have been changed from public to protected. */
    public String fromPublicToProtected;
    /** This field should have been changed from protected to public. */
    protected String fromProtectedToPublic;

    /** This field should have been changed from static to non-static. */
    static String fromStaticToNonStatic;
    /** This field should have been changed from non-static to static. */
    String fromNonStaticToStatic;

    /** This field should have been changed from transient to non-transient. */
    transient String fromTransientToNonTransient;
    /** This field should have been changed from non-transient to transient. */
    String fromNonTransientToTransient;

    /** This field should have been changed from volatile to non-volatile. */
    volatile String fromVolatileToNonVolatile;
    /** This field should have been changed from non-volatile to volatile. */
    String fromNonVolatileToVolatile;
}
