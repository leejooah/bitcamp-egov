package com.leejua.web.proxies;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RequestMapping("/proxy")
@RestController
public class ProxyController {

    @PostMapping("/crawling")
    public  HashMap<String, Object> list(@RequestBody String searchWord){
        System.out.println("넘어온 키워드 = " + searchWord);
        return null;
    }

    @GetMapping("/soccer/{searchWord}")
    public HashMap<String,String> soccer(@PathVariable String searchWord){
        return null;
    }

    @GetMapping("/crawling/{searchWord}")
    public HashMap<String,Object> search(@PathVariable String searchWord){
        System.out.println("넘어온 키워드 ="  +searchWord);

        return null;
    }



}
