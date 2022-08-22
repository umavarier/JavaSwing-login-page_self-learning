import java.util.HashMap;

public class IDandPasswords {

     HashMap<String, String> loginInfo = new HashMap<String, String>();

     IDandPasswords() {
         loginInfo.put("Uma", "google");
         loginInfo.put("Sreyas", "qburst");
         loginInfo.put("unni", "kv123");

     }
   protected HashMap getLoginInfo() {
         return loginInfo;

     }
}




