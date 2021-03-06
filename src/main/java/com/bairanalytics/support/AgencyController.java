package com.bairanalytics.support;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.ModelMap;

/**
 * Created by Sean on 4/3/2015.
 */


@Controller
@RequestMapping("/")
public class AgencyController {

    public AgencyController(){
        System.out.println("******* From the constructor ***** " );
    }

    @RequestMapping(method= RequestMethod.GET)
    public String getAgency(ModelMap model){
        try{
            model.addAttribute("message", "Spring 3 MVC Hello World");
            System.out.println("******* Test message " );
        }catch(Exception ex){
            System.out.println("******* Exception thrown ... " + ex.getMessage());
        }
        return "index";
    }

    @RequestMapping(method= RequestMethod.HEAD)
    public String getAgency2(ModelMap model){
        try{
            model.addAttribute("message", "Spring 3 MVC Hello World");
            System.out.println("******* Test message " );
        }catch(Exception ex){
            System.out.println("******* Exception thrown ... " + ex.getMessage());
        }
        return "view";
    }
}

