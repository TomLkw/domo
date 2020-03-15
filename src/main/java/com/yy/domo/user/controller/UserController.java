package com.yy.domo.user.controller;

import com.yy.domo.user.entity.User;
import com.yy.domo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("/test")
    public String test(){
        return  "success";
    }
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/getAll")
    public List<User> getAll(Map map){
        List<User> userList = userService.getAll(map);
        System.out.println("======"+userList);
        return userList;
    }

    @RequestMapping("/delById")
    public String delById(Integer id){
        userService.delById(id);
        return "redirect:/index.html";
    }
    @ResponseBody
    @RequestMapping("/save")
    public String save(@RequestBody User user){
        userService.save(user);
        return "success";
    }


}
