package com.cams.utils;
import java.security.Key;
import javax.crypto.Cipher;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;
import javax.crypto.spec.SecretKeySpec;

public class AESEncryption {


	    
	    private static final String ALGO = "AES";
	    private static final byte[] keyValue =
	            new byte[]{'D', 'h', 'e', 'B', 'e', 'S', 't', 'S', 'e', 'c', 'R', 'e', 't', 'K', 'e', 'Y'};

	    /**
	     * Encrypt a string with AES algorithm.
	     *
	     * @param data is a string
	     * @return the encrypted string
	     */
	    public static String encryptText(String data) throws Exception {
	        Key key = generateKey();
	        Cipher c = Cipher.getInstance(ALGO);
	        c.init(Cipher.ENCRYPT_MODE, key);
	        byte[] encVal = c.doFinal(data.getBytes());
	        return new BASE64Encoder().encode(encVal);
	    }

	    /**
	     * Decrypt a string with AES algorithm.
	     *
	     * @param encryptedData is a string
	     * @return the decrypted string
	     */
	    public static String decryptText(String encryptedData) throws Exception {
	        Key key = generateKey();
	        Cipher c = Cipher.getInstance(ALGO);
	        c.init(Cipher.DECRYPT_MODE, key);
	        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
	        byte[] decValue = c.doFinal(decordedValue);
	        return new String(decValue);
	    }

	    /**
	     * Generate a new encryption key.
	     */
	    private static Key generateKey() throws Exception {
	        return new SecretKeySpec(keyValue, ALGO);
	    }
	    
	    public static void main (String argv[]) throws Exception {
		   
	    	System.out.println(decryptText("FMEuuJsKO9YFsFUMXaJbUQ=="));
	    	System.out.println(encryptText("Etcj7pYQeR"));
		   
	   }
}
