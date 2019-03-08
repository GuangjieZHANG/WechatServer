package fr.toulouse.web;

import fr.toulouse.entity.Advertising;
import fr.toulouse.entity.Discussion;
import fr.toulouse.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/discussion")
public class DiscussionController {

    @Autowired
    private DiscussionService discussionService;

    @RequestMapping(value = "/getalldiscussions", method = RequestMethod.GET)
    private Map<String,List<Discussion>> getAllDiscussions(){
        Map<String,List<Discussion>> modelMap = new HashMap<String, List<Discussion>>();
        List<Discussion> discussions = discussionService.getDiscussion();
        modelMap.put("allDiscussions", discussions);
        return modelMap;
    }

    @RequestMapping(value = "/getdiscussionbyid", method = RequestMethod.GET)
    private Map<String,List<Discussion>> getDiscussionById(Integer discussionId){
        Map<String,List<Discussion>> modelMap = new HashMap<String, List<Discussion>>();
        List<Discussion> discussions = discussionService.getDiscussionById(discussionId);
        modelMap.put("discussionById", discussions);
        return modelMap;
    }

    @RequestMapping(value = "/getdiscussionbytag", method = RequestMethod.GET)
    private Map<String,List<Discussion>> getDiscussionByTag(String tag){
        Map<String,List<Discussion>> modelMap = new HashMap<String, List<Discussion>>();
        List<Discussion> discussions = discussionService.getDiscussionByTag(tag);
        modelMap.put("discussionByTag", discussions);
        return modelMap;
    }

    @RequestMapping(value = "/getdiscussionbyowner", method = RequestMethod.GET)
    private Map<String,List<Discussion>> getDiscussionByOwner(Integer owner){
        Map<String,List<Discussion>> modelMap = new HashMap<String, List<Discussion>>();
        List<Discussion> discussions = discussionService.getDiscussionByOwner(owner);
        modelMap.put("discussionByOwner", discussions);
        return modelMap;
    }

    @RequestMapping(value = "/adddiscussion", method = RequestMethod.POST)
    private Map<String,Object> addDiscussion(@RequestBody Discussion discussion){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",discussionService.addDiscussion(discussion));
        return modelMap;
    }

    @RequestMapping(value = "/modifydiscussion", method = RequestMethod.POST)
    private Map<String,Object> modifyDiscussion(@RequestBody Discussion discussion){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",discussionService.modifyDiscussion(discussion));
        return modelMap;
    }

    @RequestMapping(value = "/deletediscussion", method = RequestMethod.GET)
    private Map<String,Object> deleteDiscussion(Integer discussionId){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",discussionService.deleteDiscussion(discussionId));
        return modelMap;
    }

}
