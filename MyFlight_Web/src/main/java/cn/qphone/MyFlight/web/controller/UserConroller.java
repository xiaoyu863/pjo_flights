package cn.qphone.MyFlight.web.controller;


import cn.qphone.MyFlight.pojo.User;
import cn.qphone.MyFlight.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class UserConroller {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public List<User> login(String bt, String bt2, String bt1) throws UnsupportedEncodingException {
        //User u = userService.login(user);
        //if (u == null) {
       //     return "error.jsp";
       // }
        //model.addAttribute("user", u);
        System.out.println(userService.findList("2019-10-11","",""));
        String s1 = new String(bt.getBytes("ISO-8859-1"), "UTF-8");
        String s2 = new String(bt1.getBytes("ISO-8859-1"), "UTF-8");
        String s3 = new String(bt2.getBytes("ISO-8859-1"), "UTF-8");

        System.out.println(s3+"--"+s1+"--"+s2);
//        System.out.println(list);
//        String s="北京航空   dsndjsdj   dwskldkws   wdawdawdawd";
//        return list.toString();

        System.out.println(s1);

        List<User> list = userService.findList(s2, s1, s3);
        System.out.println(list);
        if("[]" .equals( list.toString())){
            System.out.println("-dashjdjkas");
            list=null;
        }

        return list;
        //return null;
    }

}
