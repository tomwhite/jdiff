package ChangedPackage;

/** 
 * OLD: The changes in this class are to do with changes in inherited
 * methods and fields.
 */
public class ChangedChild extends ChangedParent {

    /** This constructor should remain unchanged. */
    public ChangedChild() {
    }

    /** OLD This method moves to its parent. */
    public void MovingMethod1() {
    }

    /** OLD This method is removed from the child. */
    public int OldChildMethod(int a) {
        return 1;
    }

    /** OLD This field moves to its parent. */
    public int MovingField1;

    /** OLD This field is removed from the child. */
    public String OldChildField;
}
