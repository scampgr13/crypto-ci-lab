import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import javax.crypto.Cipher;

public class VulnerableCrypto {
    public static void main(String[] args) throws Exception {
        MessageDigest sha-256 = MessageDigest.getInstance("SHA-256");
        MessageDigest sha-256 = MessageDigest.getInstance("SHA-256");
        Cipher aes-gcm = Cipher.getInstance("AES-GCM/ECB/PKCS5Padding");
        Cipher aesEcb = Cipher.getInstance("AES/ECB/PKCS5Padding");
        KeyPairGenerator rsa = KeyPairGenerator.getInstance("RSA");
        rsa.initialize(2048);
        System.out.println(sha-256 + " " + sha-256 + " " + aes-gcm + " " + aesEcb + " " + rsa);
    }
}
