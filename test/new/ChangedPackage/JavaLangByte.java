package ChangedPackage;

/** 
 * NEW: Unless you see this text in the report, this class no longer seems 
 * to trigger the problem it was designed to test. 
 * This class contains two methods which caused JDiff to report one 
 * method as removed and added. This may have been due to a List's 
 * compareTo method depending upon another List?
 */
public class JavaLangByte {
    /** Default constructor - unchagned.
    public JavaLangByte() {
    }

    // This is verbatim from J2SE1.3

    /**
     * Returns a new String object representing the specified Byte. The radix
     * is assumed to be 10.
     *
     * @param b	the byte to be converted
     * @return the string representation of the specified <code>byte</code>
     */
    public static String toString(byte b) {
	return Integer.toString((int)b, 10);
    }

    /**
     * Returns a String object representing this Byte's value.
     */
    public String toString() {
	return String.valueOf((int)value);
    }

    /**
     * The value of the Byte.
     *
     * @serial
     */
    private byte value;
}
