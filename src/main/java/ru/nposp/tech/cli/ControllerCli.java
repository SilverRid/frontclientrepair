package ru.nposp.tech.cli;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.nposp.tech.cli.service.ManageEquipment;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Controller
public class ControllerCli {
    @RequestMapping("/")
    public String showView() {

        ManageEquipment m = new ManageEquipment();
        System.out.println(m.manGetEquip());
        return "head-first";
    }
}
