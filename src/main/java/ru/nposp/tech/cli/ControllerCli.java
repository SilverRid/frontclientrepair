package ru.nposp.tech.cli;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Controller
public class ControllerCli {
    @RequestMapping("/")
    public String showView() {
        return "head-first";
    }
}
