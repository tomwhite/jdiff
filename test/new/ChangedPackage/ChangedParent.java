package ChangedPackage;

/** 
 * NEW: The changes in this class are to do with changes in inherited
 * methods and fields.
 */
public class ChangedParent {

    /** This constructor should remain unchanged. */
    public ChangedParent() {
    }

    /** NEW This method moves to its parent. */
    public void MovingMethod1() {
    }

    /** NEW This is a new method in the parent. */
    public void NewParentMethod() {
    }

    /** NEW This field moves to its parent. */
    public int MovingField1;

    /** NEW This is a new field in the parent. */
    public char NewParentField;
}
