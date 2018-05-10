package com.austinegwa.Controllers;

import com.austinegwa.Services.Insert;
import com.austinegwa.Test.DbTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by gwaza on 4/15/2018.
 */

@Controller
public class MainController {

    DbTest dbTest ;

    @Autowired
    Insert insert;

    @RequestMapping("/index")
    public ModelAndView doHome(){

        ModelAndView mv = new ModelAndView("index");
        dbTest=new DbTest();
        dbTest.setName("kkk");
        dbTest.setAge("24");

        insert.insertData(dbTest);

        return mv;
    }

    @RequestMapping("/secure")
    public ModelAndView doSecure(){

        ModelAndView mv = new ModelAndView("secure");
        return mv;
    }

}
