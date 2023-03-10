// "Let's get together and hash it out." - Tony Stark

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashes {

    // Based off of the makeHash() method and the getHashedStr(), these look like our mutator nad accessor methods.
    // Therefore, hashedStr is the variable set in makeHash() and is returned in getHashedStr().
    // Possibly complete
    private String hashedStr;

    public void makeHash(String hashName) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] byteArr = md.digest(hashName.getBytes(StandardCharsets.UTF_8));

        StringBuilder buildStr = new StringBuilder();

        for (byte b : byteArr) {
            buildStr.append(String.format("%02x", b));
        }

        // Possibly complete
         hashedStr = buildStr.toString();
    }

    // Possibly complete
    public String getHashedStr() {
        return hashedStr;
    }

}
