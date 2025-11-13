package com.reactnativesunmiprinter;

/**
 * Utility class for ESC/POS printer command bytes.
 * Compatible with Android 6 (API 23) and above.
 */
public final class ESCUtil {

     private ESCUtil() {
        throw new UnsupportedOperationException("Utility class");
    }

    // Control characters
    public static final byte ESC = 0x1B;  // Escape
    public static final byte FS  = 0x1C;  // File Separator
    public static final byte GS  = 0x1D;  // Group Separator
    public static final byte DLE = 0x10;  // Data Link Escape
    public static final byte EOT = 0x04;  // End Of Transmission
    public static final byte ENQ = 0x05;  // Enquiry
    public static final byte SP  = 0x20;  // Space
    public static final byte HT  = 0x09;  // Horizontal Tab
    public static final byte LF  = 0x0A;  // Line Feed
    public static final byte CR  = 0x0D;  // Carriage Return
    public static final byte FF  = 0x0C;  // Form Feed
    public static final byte CAN = 0x18;  // Cancel

    /**
     * Enable bold font.
     *
     * @return byte command to turn bold on
     */
    public static byte[] boldOn() {
        return new byte[]{ESC, 0x45, 0x0F};
    }

    /**
     * Disable bold font.
     *
     * @return byte command to turn bold off
     */
    public static byte[] boldOff() {
        return new byte[]{ESC, 0x45, 0x00};
    }
}
