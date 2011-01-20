package ChangedPackage;

/** 
 * OLD: The changes in this class are to do with additions and removals and
 * changes of inner classes.
 */
public class ChangedClassInner {

    /** This constructor should remain unchanged. */
    public ChangedClassInner() {
    }

    /** Class removed inside ChangedClassInner. */
    class RemovedInner {
        RemovedInner() {
        }
    }

    /** Class changed inside ChangedClassInner. */
    class ChangedInner {
        /** This constructor should remain unchanged. */
        ChangedInner() {
        }

        /** This method should have been removed. */
        void RemovedMethod() {
        }

        /** This method should have been changed. */
        void ChangedMethod() {
        }
    }
}

