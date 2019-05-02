package fr.toulouse.web;

import fr.toulouse.entity.House;
import fr.toulouse.entity.SHobject;
import fr.toulouse.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @RequestMapping(value = "/getallhouses", method = RequestMethod.GET)
    private Map<String,List<House>> getAllHouses(){
        Map<String,List<House>> modelMap = new HashMap<String, List<House>>();
        List<House> houses = houseService.getAllHouses();
        modelMap.put("allHouses", houses);
        return modelMap;
    }

    @RequestMapping(value = "/gethousebyid", method = RequestMethod.GET)
    private Map<String,House> getHouseById(Integer houseId){
        Map<String,House> modelMap = new HashMap<String, House>();
        House houses = houseService.getHouseById(houseId);
        modelMap.put("houseById", houses);
        return modelMap;
    }

    @RequestMapping(value = "/gethousebyowner", method = RequestMethod.GET)
    private Map<String,List<House>> getHouseByOwner(Integer houseId){
        Map<String,List<House>> modelMap = new HashMap<String, List<House>>();
        List<House> houses = houseService.getHouseByOwner(houseId);
        modelMap.put("houseByOwner", houses);
        return modelMap;
    }

    @RequestMapping(value = "/addhouse", method = RequestMethod.POST)
    private Map<String,Object> addHouse(@RequestBody House house){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",houseService.addHouse(house));
        return modelMap;
    }

    @RequestMapping(value = "/modifyhouse", method = RequestMethod.POST)
    private Map<String,Object> modifyHouse(@RequestBody House house){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",houseService.modifyHouse(house));
        return modelMap;
    }

    @RequestMapping(value = "/deletehouse", method = RequestMethod.GET)
    private Map<String,Object> deleteHouse(Integer houseId){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",houseService.deleteHouse(houseId));
        return modelMap;
    }

}
