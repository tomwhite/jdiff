package ChangedPackage;

/** 
 * NEW: The changes in this class are to do with additions and removals and
 * changes of parameter and return types.
 * There are no changes in deprecation, modifiers, inheritance or exceptions.
 * There are also no tests for finding the first sentence of a comment.
 */
public class ChangedClass {

    /** This constructor should remain unchanged. */
    public ChangedClass() {
    }

    /** This constructor should have been added. */
    public ChangedClass(String added) {
    }

    /** This constructor should have been changed. */
    public ChangedClass(int a, String b) {
    }
    
    /** This method should remain unchanged. */
    public void UnchangedMethod() {
    }

    /** This method should have been added. */
    public void AddedMethod() {
    }

    /** This method should have been changed. */
    public int ChangedMethod(String newarg1, String newarg2, AddedClass newarg3) {
        return 0;
    }

    /** This field should remain unchanged. */
    public boolean unchanged;

    /** This field should have been added. */
    public boolean added;

    /** This field should have been changed. */
    public String changed;
}

