package ChangedPackage;

/** 
 * OLD: The changes in this class are to do with changes in methods,
 * when mutiple methods have the same name.
 */
public class ChangedMethods {

    /** This constructor should remain unchanged. */
    public ChangedMethods() {
    }

    /** This method should remain unchanged. */
    public void UnchangedMethod() {
    }

    // Test of changing one method in multiple methods

    /** This method should have been unchanged. */
    public void MethodA() {
    }
    /** 
     * OLD: This method should have been changed with the addition of a long 
     * parameter. 
     */
    public void MethodA(char a) {
    }
    /** This method should have been unchanged. */
    public void MethodA(char a, int b) {
    }

    // Test of changing two methods in multiple methods

    /** This method should have been unchanged. */
    public void MethodB() {
    }
    /** 
     * OLD: This method should have been changed with the addition of a long 
     * parameter. 
     */
    public void MethodB(char a) {
    }
    /** 
     * OLD: This method should have been changed with the addition of a String
     * parameter. 
     */
    public void MethodB(char a, int b) {
    }

    /** 
     * OLD: This method should have been changed with the addition of a byte 
     * parameter. 
     */
    public void MethodC() {
    }
    /** 
     * OLD: This method should have been changed with the addition of a long 
     * parameter. 
     */
    public void MethodC(char a) {
    }
    /** 
     * OLD: This method should have been changed with the addition of a String
     * parameter. 
     */
    public void MethodC(char a, int b) {
    }

    /** OLD: This method should have had a long parameter removed. */
    public String MethodWithRemovedParam(int a, long b, int c) {
        return "foo";
    }
}
