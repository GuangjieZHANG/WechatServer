package fr.toulouse.web;

import fr.toulouse.entity.Plat;
import fr.toulouse.service.PlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/plat")
public class PlatController {

    @Autowired
    private PlatService platService;

    @RequestMapping(value = "/getallplats", method = RequestMethod.GET)
    private Map<String,List<Plat>> getAllPlats(){
        Map<String,List<Plat>> modelMap = new HashMap<String, List<Plat>>();
        List<Plat> plats = platService.getAllPlats();
        modelMap.put("allPlats", plats);
        return modelMap;
    }

    @RequestMapping(value = "/getspecialplats", method = RequestMethod.GET)
    private Map<String,List<Plat>> getSpecialPlats(){
        Map<String,List<Plat>> modelMap = new HashMap<String, List<Plat>>();
        List<Plat> plats = platService.getSpecialPlats();
        modelMap.put("specialPlats", plats);
        return modelMap;
    }

    @RequestMapping(value = "/getplatsbyrestaurant", method = RequestMethod.GET)
    private Map<String,List<Plat>> getPlatsByRestaurant(Integer restaurantId){
        Map<String,List<Plat>> modelMap = new HashMap<String, List<Plat>>();
        List<Plat> plats = platService.getPlatByRestaurant(restaurantId);
        modelMap.put("platsByRestaurant", plats);
        return modelMap;
    }

    @RequestMapping(value = "/addplat", method = RequestMethod.POST)
    private Map<String,Object> addPlat(@RequestBody Plat plat){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", platService.addPlat(plat));
        return modelMap;
    }

    @RequestMapping(value = "/modifyplat", method = RequestMethod.POST)
    private Map<String,Object> modifyPlat(@RequestBody Plat plat){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", platService.modifyPlat(plat));
        return modelMap;
    }

    @RequestMapping(value = "/deleteplat", method = RequestMethod.GET)
    private Map<String,Object> deletePlat(Integer platId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", platService.deletePlat(platId));
        return modelMap;
    }

    @RequestMapping(value = "/likeplat", method = RequestMethod.GET)
    private Map<String,Object> likePlat(Integer userId, Integer platId){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",platService.likePlat(userId, platId));
        return modelMap;
    }

    @RequestMapping(value = "/dislikeplat", method = RequestMethod.GET)
    private Map<String,Object> dislikePlat(Integer userId,Integer platId){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",platService.dislikePlat(userId,platId));
        return modelMap;
    }

}
