package ru.nposp.tech.cli.service;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.nposp.tech.cli.cominication.Communication;
import ru.nposp.tech.cli.conf.ConfigJson;
import ru.nposp.tech.cli.entity.Equipment;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
public class ManageEquipment {
   private final AnnotationConfigApplicationContext annotationConfigApplicationContext =
        new AnnotationConfigApplicationContext(ConfigJson.class);
   private final Communication communication =
        annotationConfigApplicationContext.getBean("communication", Communication.class);
    public  List<Equipment> manGetEquip() {
        List<Equipment> allEquip = communication.getAllEquipment();
        return allEquip;
    }
}
