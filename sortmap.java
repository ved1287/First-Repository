import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class sortmap {
    public static void main(String[]args){
        Map<String,Integer> map=new HashMap<>();
        map.put("ved",48);
        map.put("om",108);
        map.put("abhi",38);
        map.put("somu",28);
        map.forEach((k,v)->System.out.println(k+"-"+v));
        System.out.println("After sorting by values");
        List<Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());
        list.forEach(System.out::println);
    }
    
}
