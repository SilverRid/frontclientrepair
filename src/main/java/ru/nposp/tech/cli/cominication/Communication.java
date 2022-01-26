package ru.nposp.tech.cli.cominication;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.nposp.tech.cli.entity.Equipment;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Component
public class Communication {
    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://127.0.0.1:8888/eqs";
    public List<Equipment> getAllEquipment() {
        ResponseEntity<List<Equipment>> responseEntity =
            restTemplate.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Equipment>>() {
            });
        List<Equipment> equipmentList = responseEntity.getBody();
        return equipmentList;
    }

    public Equipment getEquipment(int id) {
        return null;
    }

    public void saveEquipment(Equipment equipment) {

    }

    public void deleteEquipment(int id) {

    }
}

