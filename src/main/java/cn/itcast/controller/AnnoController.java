package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * xx模块
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = "msg")
public class AnnoController {
  @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
      System.out.println(username);
      return "success";
  }
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println(id);
        return "success";
    }
    @RequestMapping("/testReauestHeader")
    public String testReauestHeader(@RequestHeader(value = "Accept") String header){
        System.out.println(header);
        return "success";
    }
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String CookieValue){
        System.out.println(CookieValue);
        return "success";
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("ddddd");
        System.out.println(user);
        return "success";
    }
    @ModelAttribute
    public void showUser(Map<String,User> map){
        System.out.println("cccc");
        User user=new User();
        user.setAge(20);
        user.setDate(new Date());
        user.setUsername("anan");
        map.put("abc",user);
    }
    @RequestMapping(value = "/testSessionAttributes")
    public String testSessionAttributes(Model model){
      //底层会存储到request域对象
        model.addAttribute("msg","你好");
        return "success";
    }
    @RequestMapping(value ="getSessionAttributes")
    public String testSessionAttributes(ModelMap modelMap){
        System.out.println("testSessionAttributes");
        String msg= (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }
    @RequestMapping(value ="delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        System.out.println("delSessionAttributes");
        status.setComplete();
        return "success";
    }
}
