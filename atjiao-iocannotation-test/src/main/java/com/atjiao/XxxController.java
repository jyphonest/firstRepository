package com.atjiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class XxxController {

    @Autowired
    XxxService xxxService;

    public void testshow(){
        xxxService.show();
    }

}