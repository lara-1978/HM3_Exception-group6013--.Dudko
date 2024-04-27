package HW3;

import java.util.HashMap;
import java.util.Map;

public class SecondName {
    public static void main(String[] args)
    {
        Map<String, String> map = createHumanList();
        printHumanList(map);
    }

    public static Map<String, String> createHumanList()
    {
        
        Map<String, String> human = new HashMap<String,String>();
        for (int i = 0; i < 5; i++) {
            human.put("firstName" + i, "secondName"+ i);
        }
        human.put("firsName","secondName");

        return  (HashMap<String, String>) human;
    }

    public static void printHumanList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
