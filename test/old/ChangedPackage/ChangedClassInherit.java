package ChangedPackage;

import java.util.*;

/** 
 * OLD: The changes in this class are to do with inheritance.
 */
public class ChangedClassInherit {

    /** This constructor should remain unchanged. */
    public ChangedClassInherit() {
    }

}

/** 
 * OLD: The changes in this class are to do with inheritance.
 */
class ChangedClassInherit1 extends Hashtable {

    /** This constructor should remain unchanged. */
    public ChangedClassInherit1() {
    }

}

/** 
 * OLD: The changes in this class are to do with interfaces.
 */
class ChangedClassImplements {

    /** This constructor should remain unchanged. */
    ChangedClassImplements() {
    }

}

/** 
 * OLD: The changes in this class are to do with interfaces.
 */
class ChangedClassImplements2 implements Comparable {

    /** This constructor should remain unchanged. */
    ChangedClassImplements2() {
    }

    /** OLD: Method to compare two ChangedClassImplements objects. */
    public int compareTo(Object o) {
        return -1;
    }
}
