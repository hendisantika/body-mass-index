package com.hendisantika.bodymassindex.controller;

import com.hendisantika.bodymassindex.dto.UserInfoDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : body-mass-index
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/8/24
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping
public class IndexController {
    @GetMapping("/")
    public String indexPage(Model model) {
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setHeight(40d).setWeight(2d);
        model.addAttribute("userInfo", userInfoDto);

        return "index";
    }
}
