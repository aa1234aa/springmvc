package cn.itcast.controller;

import cn.itcast.domain.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
    @RequestMapping("/fileupload")
    public String fileupload(HttpServletRequest request)throws Exception{
        System.out.println("fileupload的方法执行了");
        //上传的位置
        String path=request.getSession().getServletContext().getRealPath("/upload/");
        //判断路径是否存在
        File file=new File(path);
        if (!file.exists()){
            file.mkdir();
        }
        //解析request对象，获取文件上传项
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
        //解析request
        List<FileItem> items=upload.parseRequest(request);
        //遍历
        for (FileItem item:items){
            if (item.isFormField()){
                //说明普通表单向
            }else {
                //获取上传文件
                String filename=item.getName();
                String uuid=UUID.randomUUID().toString().replace("","");
                filename=uuid+"_"+filename;
                //完成上传
                item.write(new File(path,filename));
                //删除文件
                item.delete();
            }
        }
        return "success";
    }
    @RequestMapping("/fileupload1")
    public String fileupload1(HttpServletRequest request, MultipartFile upload) throws IOException {
        //upload是表单中文件name属性值,必须保持一致
        System.out.println("testFileUpload...");
        String realPath = request.getSession().getServletContext().getRealPath("/uploads");
        File file = new File(realPath);
        if(!file.exists()){
            file.mkdirs();//创建文件夹
        }
        String filename = upload.getOriginalFilename(); //获取文件名
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");//生成uuid避免文件名重复导致冲突覆盖
        filename=uuid+"_"+filename;
        upload.transferTo(new File(file,filename));
        return "success";
    }
    @RequestMapping("/upLoad")
    @ResponseBody
    public String upLoad(MultipartFile file) throws IllegalStateException, IOException {
        // TODO Auto-generated method stub
        // getOriginalFilename()获取原始文件名(在客户端时的文件名)
        //getFileName() 在服务器上的文件名.
        String filename = file.getOriginalFilename();
        File file2 = new File("D:/imgs/"+filename);
        //这里你可以进行重命名也可以把路径入库
        //这里我就不做其他业务操作了

        //MultipartFile中的transferTo不能使用两次
        //因为http post文件流只可以接收读取一次，传输完毕则关闭流。
        //可以把流保存为文件1，然后对文件1进行复制，移动等操作
        //transferTo转存文件到指定路径
        file.transferTo(file2);
        return "success";
    }
}
