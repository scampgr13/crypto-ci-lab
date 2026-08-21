import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import javax.crypto.Cipher;

public class VulnerableCrypto {
    public static void main(String[] args) throws Exception {
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        MessageDigest sha256_2 = MessageDigest.getInstance("SHA-256");

        Cipher aesGcm = Cipher.getInstance("AES/GCM/NoPadding");
        Cipher aesGcm2 = Cipher.getInstance("AES/GCM/NoPadding");

        KeyPairGenerator rsa = KeyPairGenerator.getInstance("RSA");
        rsa.initialize(2048);

        System.out.println(
            sha256 + " " +
            sha256_2 + " " +
            aesGcm + " " +
            aesGcm2 + " " +
            rsa
        );
    }
}
