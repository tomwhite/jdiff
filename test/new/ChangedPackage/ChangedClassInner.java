package ChangedPackage;

/** 
 * NEW: The changes in this class are to do with additions and removals and
 * changes of inner classes.
 */
public class ChangedClassInner {

    /** This constructor should remain unchanged. */
    public ChangedClassInner() {
    }

    /** Class added inside ChangedClassInner. */
    class AddedInner {
        AddedInner() {
        }
    }

    /** Class changed inside ChangedClassInner. */
    class ChangedInner {
        /** This constructor should remain unchanged. */
        ChangedInner() {
        }

        /** This method should have been added. */
        void AddedMethod() {
        }

        /** This method should have been changed. */
        void ChangedMethod(int addedThisParam) {
        }
    }
}

