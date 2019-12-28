package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * xx模块
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("tesng的方法执行了");
        User user=new User();
        user.setUsername("aa");
        user.setAge(22);
        user.setDate(new Date());
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response)throws Exception{
        System.out.println("testVoid执行了");
        //编写请求转发的程序
        /*request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);*/
        //重定向
        /*response.sendRedirect(request.getContextPath()+"/anno.jsp");
       */
        //设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
       //直接响应
        response.getWriter().print("你好");
        return;
    }
        @RequestMapping("/testModelAndView")
        public ModelAndView testModelAndView(){
            System.out.println("tesng的方法执行了");
            User user=new User();
            user.setUsername("aa");
            user.setAge(22);
            user.setDate(new Date());
           ModelAndView modelAndView=new ModelAndView();
           modelAndView.addObject("user",user);
           modelAndView.setViewName("success");
           return modelAndView;
        }
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax的方法执行了");
        user.setUsername("daan");
        user.setDate(new Date());
        return user;
    }
}
