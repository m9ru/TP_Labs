import java.security.MessageDigest;
public class e8 {
    public static String bytesToHex(String str) {
        try{
            MessageDigest dig = MessageDigest.getInstance("SHA-256");
            byte[] hesh = dig.digest(str.getBytes("UTF-8"));
            StringBuffer hexStr = new StringBuffer();
            for (int i = 0; i < hesh.length; i++) {
                String hexS = Integer.toHexString(0xff & hesh[i]);
                if(hexS.length() == 1)
                    hexStr.append('0');
                hexStr.append(hexS);
            }
            return hexStr.toString();
        } catch(Exception exc){
           throw new RuntimeException(exc);
        }
    }
    public static void main(String[] args) {
        System.out.println(bytesToHex("Fluffy@home"));
    }
}