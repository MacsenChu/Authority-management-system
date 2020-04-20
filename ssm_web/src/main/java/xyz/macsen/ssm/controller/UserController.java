package xyz.macsen.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import xyz.macsen.ssm.domain.UserInfo;
import xyz.macsen.ssm.service.UserService;


import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {

        ModelAndView mv = new ModelAndView();
        List<UserInfo> userList = userService.findAll();

        mv.addObject("userList", userList);
        mv.setViewName("user-list");

        return mv;
    }

    // 用户添加
    @RequestMapping("/save.do")
    public String save(UserInfo userInfo) throws Exception {

        userService.save(userInfo);
        return "redirect:findAll.do";
    }

    // 查询指定id的用户
    @RequestMapping("/findById.do")
    public ModelAndView findById(String id) throws Exception {

        ModelAndView mv = new ModelAndView();
        UserInfo userInfo = userService.findById(id);
        mv.addObject("user", userInfo);
        mv.setViewName("user-show");

        return mv;
    }

}
