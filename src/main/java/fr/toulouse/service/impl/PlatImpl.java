package fr.toulouse.service.impl;

import fr.toulouse.dao.PlatDao;
import fr.toulouse.dao.PlatTagDao;
import fr.toulouse.entity.Plat;
import fr.toulouse.entity.PlatTag;
import fr.toulouse.service.PlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlatImpl implements PlatService{

    @Autowired
    private PlatDao platDao;

    @Autowired
    private PlatTagDao platTagDao;

    @Override
    public List<Plat> getAllPlats(Integer userId) {

        List<Plat> plats = platDao.queryPlats();
        for(int i=0; i< plats.size(); i++){
            List<PlatTag> tags = platTagDao.queryTagById(plats.get(i).getId());
            if(platDao.ifLikePlat(userId,plats.get(i).getId())==0){
                plats.get(i).setIlike(false);
            }else{
                plats.get(i).setIlike(true);
            }
            plats.get(i).setTags(tags);
        }
        return plats;
    }

    @Override
    public List<Plat> getSpecialPlats(Integer userId) {
        List<Plat> plats = platDao.querySpecialPlat();
        for(int i=0; i< plats.size(); i++){
            if(platDao.ifLikePlat(userId,plats.get(i).getId())==0){
                plats.get(i).setIlike(false);
            }else{
                plats.get(i).setIlike(true);
            }
            List<PlatTag> tags = platTagDao.queryTagById(plats.get(i).getId());
            plats.get(i).setTags(tags);
        }
        return plats;
    }

    @Override
    public List<Plat> getPlatByName(String name, Integer userId) {
        List<Plat> plats = platDao.queryPlatByName(name);
        for(int i=0; i< plats.size(); i++){
            if(platDao.ifLikePlat(userId,plats.get(i).getId())==0){
                plats.get(i).setIlike(false);
            }else{
                plats.get(i).setIlike(true);
            }
            List<PlatTag> tags = platTagDao.queryTagById(plats.get(i).getId());
            plats.get(i).setTags(tags);
        }
        return plats;
    }

    @Override
    public List<Plat> getPlatByTag(String tag) {
        return null;
    }

    @Override
    public List<Plat> getPlatByRestaurant(Integer restaurantId,Integer userId) {

        List<Plat> plats = platDao.queryPlatByRestaurant(restaurantId);
        for(int i=0; i< plats.size(); i++){

            if(platDao.ifLikePlat(userId,plats.get(i).getId())==0){
                plats.get(i).setIlike(false);
            }else{
                plats.get(i).setIlike(true);
            }
            List<PlatTag> tags = platTagDao.queryTagById(plats.get(i).getId());
            plats.get(i).setTags(tags);
        }
        return plats;
    }

    @Transactional
    @Override
    public boolean addPlat(Plat plat) {
        try{
            // 插入菜的时候也要加入标签
            int effectedNum = platDao.insertPlat(plat);
            int effectedNumP = 0;
            for(int i=0; i< plat.getTags().size();i++){
               effectedNumP += platTagDao.insertTag(plat.getId(),plat.getTags().get(i).getPlatTag());
            }
            if(effectedNum > 0 && effectedNumP>0 ){
                return true;
            }else{
                throw new RuntimeException("新建菜品失败！");
            }
        }catch (Exception e){
            throw new RuntimeException("新建菜品失败！"+e.getMessage());
        }
    }

    @Transactional
    @Override
    public boolean deletePlat(Integer platId) {
        if(platId > 0){
            try{
                int effectedNumP = platTagDao.deleteAllTags(platId);
                int effectedNum = platDao.deletePlat(platId);
                if(effectedNum > 0 && effectedNumP > 0){
                    return true;
                }else {
                    throw new RuntimeException("删除时餐馆id不能为空！");
                }
            }catch (Exception e){
                throw new RuntimeException("删除时餐馆id不能为空！"+e.getMessage());
            }
        }else {
            throw new RuntimeException("删除时餐馆id不能为空！");
        }
    }

    @Transactional
    @Override
    public boolean modifyPlat(Plat plat) {
        return false;
    }

    @Transactional
    @Override
    public boolean likePlat(Integer userId, Integer platId) {
        try{
            int effectedNum = platDao.likePlat(userId,platId);
            if(effectedNum > 0){
                return true;
            }else{
                throw new RuntimeException("点赞失败！~~ <=0 ");
            }
        }catch (Exception e){
            throw new RuntimeException("点赞失败！~~ execption "+e.getMessage());
        }
    }

    @Transactional
    @Override
    public boolean dislikePlat(Integer userId, Integer platId) {
        if( userId > 0 && platId > 0 ){
            try{
                int effectedNum = platDao.dislikePlat(userId,platId);
                if(effectedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("取消点赞时id不能为空！");
                }
            }catch (Exception e){
                throw new RuntimeException("取消点赞时id不能为空！"+e.getMessage());
            }
        }else{
            throw new RuntimeException("取消点赞时id不能为空！");
        }
    }
}
