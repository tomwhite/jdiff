package ChangedPackageDoc2;

/** 
 * This is also a test for non UTF-8 characters such as "Fahrvergnügen", and 
 * also OLD: The changes in this class are only in documentation.
 */
public class ChangedMethod {

    /** OLD This constructor should remain unchanged. */
    public ChangedMethod() {
    }

    /** NEW This method should remain unchanged, but this comment changes. */
    public void UnchangedMethod() {
    }

    /** OLD This field should remain unchanged. */
    public boolean unchanged;
}
