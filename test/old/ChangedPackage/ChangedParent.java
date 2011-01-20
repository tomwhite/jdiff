package ChangedPackage;

/** 
 * OLD: The changes in this class are to do with changes in inherited
 * methods and fields.
 */
public class ChangedParent {

    /** This constructor should remain unchanged. */
    public ChangedParent() {
    }

    /** OLD This method moves to its child. */
    public void MovingMethod2() {
    }

    /** OLD This method is removed from the parent. */
    public int OldParentMethod(int a) {
        return 1;
    }

    /** OLD This field moves to its child. */
    public int MovingField2;

    /** OLD This field is removed from the parent. */
    public String OldParentField;
}
