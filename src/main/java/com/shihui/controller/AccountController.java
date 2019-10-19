package com.shihui.controller;

import com.shihui.domain.Account;
import com.shihui.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/save")
//    @ResponseBody
    public String save(String name){
        HashMap<String,String>hm=new HashMap<>();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb3=new StringBuilder();
        if(name!=null&&name.length()>0){
            for(int i=0;i<name.length();i++){
                char c = name.charAt(i);
                if(c>='A'&&c<='Z'){
                    sb1.append(c);
                }else if(c>='a'&&c<='z'){
                    sb2.append(c);
                }else{
                    sb3.append(c);
                }
            }
        }
        String daxie = sb1.toString();
        String xiaoxie = sb2.toString();
        String qita = sb3.toString();


        hm.put("self",name);
        hm.put("daxie",daxie);
        hm.put("xiaoxie",xiaoxie);
        hm.put("qita",qita);


        accountService.save(hm);
        return "forward:/account/findAll";
    }
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,String>map = accountService.findAll();
        modelAndView.addObject("map",map);
        modelAndView.setViewName("list");
        return modelAndView;
    }
}
