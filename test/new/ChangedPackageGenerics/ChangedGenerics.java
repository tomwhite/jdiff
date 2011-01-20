package ChangedPackageGenerics;

import java.util.Collection;

/** 
 * NEW: The changes in this class are to do with changes in generics.
 *
 * When you see the code <Type>, read it as "of Type"
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
     * NEW: This method should have been changed in the type of Collection.
     */
    public void MethodA(Collection<String> a) {
    }

    /** 
     * NEW:  This method should have been changed from non-generic to generic.
     */
    public void MethodB(Collection<String> a) {
    }
    /** 
     * NEW:  This method should have been changed from generic to non-generic.
     */
    public void MethodC(String a) {
    }
    /** 
     * NEW:  This method should have been unchanged.
     */
    public void MethodD(Collection<String> a) {
    }
}
