package fr.toulouse.web;

import fr.toulouse.entity.User;
import fr.toulouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getuserbyid", method = RequestMethod.GET)
    private Map<String, User> getUserById(Integer id){
        Map<String,User> modelMap = new HashMap<String, User>();
        User user = userService.getUserById(id);
        modelMap.put("UserById", user);
        return modelMap;
    }

    @RequestMapping(value = "/getuserbyopenid", method = RequestMethod.GET)
    private Map<String, User> getUserByOpenId(String openid){
        Map<String,User> modelMap = new HashMap<String, User>();
        User user = userService.getUserByOpenId(openid);
        modelMap.put("UserByOpenId", user);
        return modelMap;
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    private Map<String,Object> addUser(@RequestBody User userToAdd){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",userService.addUser(userToAdd));
        return modelMap;
    }

    @RequestMapping(value = "/modifyuser", method = RequestMethod.POST)
    private Map<String,Object> modifyUser(@RequestBody User userToAdd){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",userService.updateUser(userToAdd));
        return modelMap;
    }

    @RequestMapping(value = "/deleteuser", method = RequestMethod.GET)
    private Map<String,Object> deleteUser(Integer userId){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",userService.deleteUser(userId));
        return modelMap;
    }


}
