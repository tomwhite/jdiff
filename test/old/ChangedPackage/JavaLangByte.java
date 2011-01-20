package ChangedPackage;

/** 
 * OLD: This class contains two methods which caused JDiff to report one 
 * method as removed and added. This may have been due to a List's 
 * compareTo method depending upon another List?
 */
public class JavaLangByte {
    /** Default constructor - unchagned.
    public JavaLangByte() {
    }

    // This is verbatim from J2SE1.2

    /**
     * Returns a new String object representing the specified Byte. The radix
     * is assumed to be 10.
     *
     * @param b	the byte to be converted
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
