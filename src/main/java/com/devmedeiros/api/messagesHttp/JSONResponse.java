package com.devmedeiros.api.messagesHttp;

import com.devmedeiros.api.Enums.Status;

import java.util.HashMap;
import java.util.Map;

import static com.devmedeiros.api.Enums.Status.FAIL;
import static com.devmedeiros.api.Enums.Status.SUCCESS;

public class JSONResponse {



    public Map<String, Object> createSimple(String Message, Enum<Status> Status){
        Map<String, Object> response = new HashMap<>();

        response.put("Mensagem : " , Message);

        if(Status.equals(SUCCESS) ){
            response.put("Status :" , SUCCESS );
        }else if(Status.equals(FAIL)) {
            response.put("Status :", FAIL);
        }
        return response;
    }

}
