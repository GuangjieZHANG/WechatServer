package fr.toulouse.web;

import fr.toulouse.entity.Restaurant;
import fr.toulouse.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @RequestMapping(value = "/getallrestaurants", method = RequestMethod.GET)
    private Map<String,List<Restaurant>> getAllRestaurant(){
        Map<String,List<Restaurant>> modelMap = new HashMap<String, List<Restaurant>>();
        List<Restaurant> restaurants = restaurantService.getAllRestaurants();
        modelMap.put("allRestaurants", restaurants);
        return modelMap;
    }

    @RequestMapping(value = "/getrestaurantbyid", method = RequestMethod.GET)
    private Map<String,Restaurant> getRestaurantById(Integer restaurantId){
        Map<String,Restaurant> modelMap = new HashMap<String, Restaurant>();
        Restaurant restaurant = restaurantService.getRestaurantById(restaurantId);
        modelMap.put("restaurant", restaurant);
        return modelMap;
    }

    @RequestMapping(value = "/addrestaurant", method = RequestMethod.POST)
    private Map<String,Object> addRestaurant(@RequestBody Restaurant restaurant){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", restaurantService.addRestaurant(restaurant));
        return modelMap;
    }

    @RequestMapping(value = "/modifyrestaurant", method = RequestMethod.POST)
    private Map<String,Object> modifyRestaurant(@RequestBody Restaurant restaurant){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", restaurantService.modifyRestaurant(restaurant));
        return modelMap;
    }

    @RequestMapping(value = "/deleterestaurant", method = RequestMethod.GET)
    private Map<String,Object> deleteRestaurant(Integer restaurantId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", restaurantService.deleteRestaurant(restaurantId));
        return modelMap;
    }


}
