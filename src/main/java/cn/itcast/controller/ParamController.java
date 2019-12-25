package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("执行L");
        System.out.println(user);
        return "success";
    }
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request);
        HttpSession session=request.getSession();
        System.out.println(session);
        ServletContext servletContext=session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);

        return "success";
    }

}
