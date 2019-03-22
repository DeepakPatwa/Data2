package com.stackroute.PE5;

import java.util.Map;

public class PlayWithMap {
    public Map<String, String> mapPlay(Map<String, String> inputMap)
    {
        if(!inputMap.get("val1").equals(""))
        {
            inputMap.put("val2",inputMap.get("val1"));
            inputMap.put("val1", " ");
        }
        return  inputMap;
    }
}
