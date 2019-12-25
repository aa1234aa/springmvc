package cn.itcast.controller;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("执行力");
        System.out.println("姓名"+username);
        System.out.println("密码"+password);
        return "success";
    }
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行L");
        System.out.println(account);
        return "success";
    }

}
