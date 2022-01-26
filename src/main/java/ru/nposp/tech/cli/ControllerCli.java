package ru.nposp.tech.cli;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.nposp.tech.cli.entity.Equipment;
import ru.nposp.tech.cli.service.ManageEquipment;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Controller
public class ControllerCli {
    @RequestMapping("/")
    public String showView() {
               return "main-page";
    }
    @RequestMapping("/eqs")
    public String showAllEquipments(Model model) {

        ManageEquipment m = new ManageEquipment();
//        System.out.println(m.manGetEquip());
        List<Equipment> allequip = m.manGetEquip();
        model.addAttribute("allequip", allequip);
        return "get-all-equipment";
    }
}
