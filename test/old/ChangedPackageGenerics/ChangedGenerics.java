package ChangedPackageGenerics;

import java.util.Collection;

/** 
 * OLD: The changes in this class are to do with changes in generics.
 */
public class ChangedGenerics {

    /** This constructor should remain unchanged. */
    public ChangedGenerics() {
    }

    /** This method should remain unchanged. */
    public void UnchangedMethod() {
    }

    // Test of changing one method in multiple methods

    /** This method should have been unchanged. */
    public void MethodA() {
    }
    /** 
     * OLD:  This method should have been changed in the type of Collection.
     */
    public void MethodA(Collection<Long> a) {
    }

    /** 
     * OLD:  This method should have been changed from non-generic to generic.
     */
    public void MethodB(String a) {
    }
    /** 
     * OLD:  This method should have been changed from generic to non-generic.
     */
    public void MethodC(Collection<String> a) {
    }
    /** 
     * OLD:  This method should have been unchanged.
     */
    public void MethodD(Collection<String> a) {
    }
}
