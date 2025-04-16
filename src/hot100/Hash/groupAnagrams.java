package hot100.Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public static void main(String[] args) {

        String[] str = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, List> map = new HashMap<>();

        for (String s : str) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            System.out.println(charArray);

            String key = String.valueOf(charArray);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);

        }
        ArrayList list = new ArrayList(map.values());
        System.out.println(list);
        System.out.println(map);


    }
}
