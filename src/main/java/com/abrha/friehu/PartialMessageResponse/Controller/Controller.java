package com.abrha.friehu.PartialMessageResponse.Controller;

import com.abrha.friehu.PartialMessageResponse.DTO.ResponceTypes;
import com.abrha.friehu.PartialMessageResponse.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {
    @Autowired
    private MyService service;

    @PostMapping
    public ResponseEntity<ResponceTypes> getResponse(@RequestBody String[] ids){
        ResponceTypes responceTypes = service.getResponse(ids);
        HttpStatus httpStatus = responceTypes.getStatus().equals("200")?HttpStatus.OK:HttpStatus.PARTIAL_CONTENT;
         return new ResponseEntity<ResponceTypes>(responceTypes, httpStatus);
    }
}
