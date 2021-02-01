package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form>
    // ajax 검색 -- 검색 파라미터가 많다
    // http post body -> data
    // json, xml, multipart-form / text-plain

    //@RequestMapping(method = RequestMethod.POST, path = "/postMethod")
    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

}
