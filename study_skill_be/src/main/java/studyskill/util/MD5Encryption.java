package studyskill.util;

import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Encryption {
  public static String encryp(String password) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("MD5");
    byte[] input = password.getBytes();
    byte[] output = md.digest(input);
    return Base64.encodeBase64String(output);
  }
}