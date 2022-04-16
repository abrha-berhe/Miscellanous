package com.abrha.friehu.PartialMessageResponse.Service;

import com.abrha.friehu.PartialMessageResponse.DTO.*;
 import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MyService {
    private Map<String, String> idPair;

    public ResponceTypes getResponse(String[] ids) {
        idPair = new HashMap<String, String>();
        idPair.put("1234", "43221");
        idPair.put("5678", "8765");
        idPair.put("1111", "2222");

        List<IdPairs> body = new ArrayList<>();
        boolean oneIdNotFound = false;
        boolean allNotPresent = false;
        String message = "Data not found for Ids=";

        for (String id : ids) {
            if (idPair.containsKey(id)) {
                allNotPresent = true;
                body.add(new IdPairs(id, idPair.get(id)));
            } else {
                oneIdNotFound = true;
                message += id + ", ";
            }
        }

        if (!allNotPresent) {
            return new AllNotFound("207", "All Ids Not found");
            //return new  CustomResponse.Builder().withMessage("207",message,body).build();
        } else if (oneIdNotFound)
            return new PartialFound("207", message, body);
        // return new  CustomResponse.Builder().withNoMessage("200",body).build();
        return new AllFound("200", body);
    }
}
