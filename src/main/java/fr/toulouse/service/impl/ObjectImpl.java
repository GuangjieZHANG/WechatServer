package fr.toulouse.service.impl;

import fr.toulouse.entity.SHobject;
import fr.toulouse.service.ObjectService;
import fr.toulouse.dao.SHobjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ObjectImpl implements ObjectService {

    @Autowired
    private SHobjectDao sHobjectDao;

    @Override
    public List<SHobject> getAllObjects() {
        return sHobjectDao.queryObjects();
    }

    @Override
    public SHobject getObjectById(Integer id) {
        return sHobjectDao.queryObjectById(id);
    }

    @Override
    public List<SHobject> getObjectsByOwner(Integer ownerId) {
        return sHobjectDao.queryObjectsByOwner(ownerId);
    }

    @Override
    public List<SHobject> getObjectsByTag(String tag) {
        return sHobjectDao.queryObjectsByTag(tag);
    }

    @Transactional
    @Override
    public boolean addObject(SHobject sHobject) {
        try{
            int effectedNum = sHobjectDao.insertObject(sHobject);
            if(effectedNum > 0){
                return true;
            }else{
                throw new RuntimeException("新建二手物品失败！");
            }
        }catch (Exception e){
            throw new RuntimeException("新建二手物品失败！"+e.getMessage());
        }
    }

    @Transactional
    @Override
    public boolean deleteObject(Integer id) {
       if(id > 0){
           try{
               int effectedNum = sHobjectDao.deleteObject(id);
               if(effectedNum > 0){
                   return true;
               }else {
                   throw new RuntimeException("删除时物品id不能为空！");
               }
           }catch (Exception e){
               throw new RuntimeException("删除时物品id不能为空！"+e.getMessage());
           }
       }else {
           throw new RuntimeException("删除时物品id不能为空！");
       }
    }

    @Transactional
    @Override
    public boolean modifyObject(SHobject sHobject) {
        if(sHobject.getId() > 0){
            try{
                int effectedNum = sHobjectDao.updateObject(sHobject);
                if(effectedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("修改时物品id不能为空！");
                }
            }catch (Exception e){
                throw new RuntimeException("修改时物品id不能为空！"+e.getMessage());
            }
        }else {
            throw new RuntimeException("修改时物品id不能为空！");
        }
    }

    @Transactional
    @Override
    public boolean likeObject(Integer userId, Integer objectId) {
        try{
            int effectedNum = sHobjectDao.likeObject(userId,objectId);
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
    public boolean dislikeObject(Integer userId, Integer objectId) {
        if( userId > 0 && objectId > 0 ){
            try{
                int effectedNum = sHobjectDao.dislikeObject(userId,objectId);
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
