package rewiew;

import java.util.HashMap;
import java.util.Set;

public class Ten {
    public static void main(String[] args) {
        HashMap<String,String> password = new HashMap<>();

        //put
        password.put("UserName", "Password");
        password.put("UserName1","password2");
        password.put("UserName2","password3");

        //get
        String value = password.get("UserName");
        System.out.println("get : " + value);

        // remove
        password.remove("UserName");
        value = password.get("UserName");
        System.out.println("remove : " + value);

        // keySet
        Set<String> set = password.keySet();
        System.out.println("keySet : " + set);
        System.out.println();
        System.out.println("keySet : ");
        for (String key: set){
            System.out.println(key);
        }
    }
}
