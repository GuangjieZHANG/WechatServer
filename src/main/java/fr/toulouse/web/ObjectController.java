package fr.toulouse.web;

import fr.toulouse.entity.SHobject;
import fr.toulouse.service.ObjectService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/object")
public class ObjectController {

    @Autowired
    private ObjectService objectService;

    @RequestMapping(value = "/getallobjects", method = RequestMethod.GET)
    private Map<String,List<SHobject>> getAllObject( Integer userId){
        Map<String,List<SHobject>> modelMap = new HashMap<String, List<SHobject>>();
        List<SHobject> sHobjects = objectService.getAllObjects(userId);
        modelMap.put("allObjects", sHobjects);
        return modelMap;
    }

    @RequestMapping(value = "/getobjectbyid", method = RequestMethod.GET)
    private Map<String,SHobject> getObjectById(Integer id, Integer userId){
        Map<String,SHobject> modelMap = new HashMap<String, SHobject>();
        SHobject sHobject = objectService.getObjectById(id,userId);
        modelMap.put("SHobject", sHobject);
        return modelMap;
    }

    @RequestMapping(value = "/getobjectsbyowner", method = RequestMethod.GET)
    private Map<String,List<SHobject>> getObjectsByOwner(Integer ownerId){
        Map<String,List<SHobject>> modelMap = new HashMap<String, List<SHobject>>();
        List<SHobject> sHobjects = objectService.getObjectsByOwner(ownerId);
        modelMap.put("objectsByOwner", sHobjects);
        return modelMap;
    }

    @RequestMapping(value = "/getobjectbytag", method = RequestMethod.GET)
    private Map<String,List<SHobject>> getObjectsByTag(String tag, Integer userId){
        Map<String,List<SHobject>> modelMap = new HashMap<String, List<SHobject>>();
        List<SHobject> sHobjects = objectService.getObjectsByTag(tag,userId);
        modelMap.put("objectsByTag", sHobjects);
        return modelMap;
    }

    @RequestMapping(value = "/addobject", method = RequestMethod.POST)
    private Map<String,Object> addObject(@RequestBody SHobject objectToAdd){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",objectService.addObject(objectToAdd));
        return modelMap;
    }

    @RequestMapping(value = "/modifyobject", method = RequestMethod.POST)
    private Map<String,Object> modifyObject(@RequestBody SHobject objectToAdd){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",objectService.modifyObject(objectToAdd));
        return modelMap;
    }

    @RequestMapping(value = "/deleteobject", method = RequestMethod.GET)
    private Map<String,Object> deleteObject(Integer objectId){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",objectService.deleteObject(objectId));
        return modelMap;
    }

    @RequestMapping(value = "/likeobject", method = RequestMethod.GET)
    private Map<String,Object> likeObject(@Param("userId") Integer userId, @Param("objectId") Integer objectId){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",objectService.likeObject(userId, objectId));
        return modelMap;
    }

    @RequestMapping(value = "/dislikeobject", method = RequestMethod.GET)
    private Map<String,Object> dislikeObject(@Param("userId") Integer userId,@Param("objectId") Integer objectId){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",objectService.dislikeObject(userId,objectId));
        return modelMap;
    }

}
