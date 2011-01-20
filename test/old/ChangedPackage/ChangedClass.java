package ChangedPackage;

/** 
 * OLD: The changes in this class are to do with additions and removals and
 * changes of parameter and return types.
 * There are no changes in deprecation, modifiers, inheritance or exceptions.
 * There are also no tests for finding the first sentence of a comment.
 */
public class ChangedClass {

    /** This constructor should remain unchanged. */
    public ChangedClass() {
    }

    /** This constructor should have been removed. */
    public ChangedClass(int removed) {
    }

    /** This constructor should have been changed. */
    public ChangedClass(int a, int b) {
    }

    /** This method should remain unchanged. */
    public void UnchangedMethod() {
    }

    /** This method should have been removed. */
    public void RemovedMethod() {
    }

    /** This method should have been changed. */
    public void ChangedMethod() {
    }

    /** This field should remain unchanged. */
    public boolean unchanged;

    /** This field should have been removed. */
    public boolean removed;

    /** This field should have been changed. */
    public boolean changed;
}
