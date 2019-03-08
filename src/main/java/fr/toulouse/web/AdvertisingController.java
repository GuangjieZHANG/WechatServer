package fr.toulouse.web;

import fr.toulouse.entity.Advertising;
import fr.toulouse.service.AdvertisingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/advertising")
public class AdvertisingController {

    @Autowired
    private AdvertisingService advertisingService;

    @RequestMapping(value = "/getallads", method = RequestMethod.GET)
    private Map<String,List<Advertising>> getAllAds(){
        Map<String,List<Advertising>> modelMap = new HashMap<String, List<Advertising>>();
        List<Advertising> advertisings = advertisingService.getAllAdvertising();
        modelMap.put("allAds", advertisings);
        return modelMap;
    }

    @RequestMapping(value = "/getadbytag", method = RequestMethod.GET)
    private Map<String,List<Advertising>> getAdByTag(String tag){
        Map<String,List<Advertising>> modelMap = new HashMap<String, List<Advertising>>();
        List<Advertising> advertisings = advertisingService.getAdvertisingByTag(tag);
        modelMap.put("adByTag", advertisings);
        return modelMap;
    }

    @RequestMapping(value = "/addad", method = RequestMethod.POST)
    private Map<String,Object> addAd(@RequestBody Advertising advertising){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",advertisingService.addAdvertising(advertising));
        return modelMap;
    }

    @RequestMapping(value = "/modifyad", method = RequestMethod.POST)
    private Map<String,Object> modifyAd(@RequestBody Advertising advertising){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",advertisingService.modifyAdvertising(advertising));
        return modelMap;
    }

    @RequestMapping(value = "/deletead", method = RequestMethod.POST)
    private Map<String,Object> deleteAd(Integer adId){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",advertisingService.deleteAdvertising(adId));
        return modelMap;
    }

}
