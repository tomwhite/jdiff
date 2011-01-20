package ChangedPackage;

/** 
 * NEW: The changes in this class are to do with changes in inherited
 * methods and fields.
 */
public class ChangedChild extends ChangedParent {

    /** This constructor should remain unchanged. */
    public ChangedChild() {
    }

    /** NEW This method moves to its child. */
    public void MovingMethod2() {
    }

    /** NEW This is a new method in the child. */
    public void NewChildMethod() {
    }

    /** NEW This field moves to its child. */
    public int MovingField2;

    /** NEW This is a new field in the child. */
    public char NewChildField;
}
