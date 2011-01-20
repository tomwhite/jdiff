package ChangedPackageDoc2;

/** 
 * OLD: The changes in this class are only in documentation.
 */
public class ChangedField {

    /** OLD This constructor should remain unchanged. */
    public ChangedField() {
    }

    /** OLD This method should remain unchanged. */
    public void UnchangedMethod() {
    }

    /** NEW This field should remain unchanged, but this comment changes. 
     *
     * This comment is also used to test some HTML elements.
     * This is a {@link ChangedField} link to another part of the 
     * documentation.
     * <p>This is a new paragraph with some <code>formatting</code> in it.
     * <p>This is another new paragraph with end of sentence <b>formatting</b>.
     */
    public boolean unchanged;
}
