package ChangedPackage;

import java.util.*;

/** 
 * NEW: The changes in this class are to do with inheritance.
 */
public class ChangedClassInherit extends Hashtable {

    /** This constructor should remain unchanged. */
    public ChangedClassInherit() {
    }

}

/** 
 * NEW: The changes in this class are to do with inheritance.
 */
class ChangedClassInherit1 {

    /** This constructor should remain unchanged. */
    public ChangedClassInherit1() {
    }

}

/** 
 * NEW: The changes in this class are to do with interfaces.
 */
class ChangedClassImplements implements Comparable {

    /** This constructor should remain unchanged. */
    ChangedClassImplements() {
    }

    /** NEW: Method to compare two ChangedClassImplements objects. */
    public int compareTo(Object o) {
        return -1;
    }
}

/** 
 * NEW: The changes in this class are to do with interfaces.
 */
class ChangedClassImplements2 {

    /** This constructor should remain unchanged. */
    ChangedClassImplements2() {
    }

}
