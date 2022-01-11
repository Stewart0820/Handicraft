package com.hand.web.controller;

import com.hand.web.entity.User;
import com.hand.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author Stewart
 * @since 2022-01-10 14:46:16
 */
@Controller
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    @RequestMapping("/")
    public ModelAndView demo() {
        ModelAndView m = new ModelAndView();
        m.setViewName("/index.html");
        return m;
    }

    @RequestMapping("/userSearch")
    public ModelAndView search() {
        ModelAndView m = new ModelAndView();
        List<User> user = userService.queryAllByLimit(0, 5);
        System.out.println(user);
        m.addObject("userInfoList", user);
        //集合放到模型中
        m.setViewName("/userinfo.html");
        return m;
    }

    @RequestMapping("/userOne")
    public ModelAndView searchOne(@RequestParam Integer id) {
        ModelAndView m = new ModelAndView();
        User user = userService.queryById(id);

        //一个用户对象，放到模型中   对象
        m.addObject("userinfo", user);
        System.out.println(user);
        //添加视图信息 要到哪里解析
        m.setViewName("userinfoone.html");
        return m;
    }

}