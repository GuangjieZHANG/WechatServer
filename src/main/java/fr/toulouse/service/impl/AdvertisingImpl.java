package fr.toulouse.service.impl;

import fr.toulouse.dao.AdvertisingDao;
import fr.toulouse.entity.Advertising;
import fr.toulouse.service.AdvertisingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdvertisingImpl implements AdvertisingService{

    @Autowired
    private AdvertisingDao advertisingDao;

    @Override
    public List<Advertising> getAllAdvertising() {
        return advertisingDao.queryAdvertising();
    }

    @Override
    public List<Advertising> getAdvertisingByTag(String tag) {
        return advertisingDao.queryAdvertisingByTag(tag);
    }

    @Transactional
    @Override
    public boolean addAdvertising(Advertising advertising) {
        try{
            int effectedNum = advertisingDao.insertAdvertising(advertising);
            if(effectedNum > 0){
                return true;
            }else{
                throw new RuntimeException("发帖失败！");
            }
        }catch (Exception e){
            throw new RuntimeException("发帖失败！"+e.getMessage());
        }
    }

    @Transactional
    @Override
    public boolean modifyAdvertising(Advertising advertising) {
        if(advertising.getId() > 0){
            try{
                int effectedNum = advertisingDao.updateAdvertising(advertising);
                if(effectedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("修改时图片出错！");
                }
            }catch (Exception e){
                throw new RuntimeException("修改时图片出错！"+e.getMessage());
            }
        }else {
            throw new RuntimeException("修改时图片id不能为空！");
        }
    }

    @Transactional
    @Override
    public boolean deleteAdvertising(Integer adId) {
        if(adId > 0){
            try{
                int effectedNum = advertisingDao.deleteAdvertising(adId);
                if(effectedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("删除图片时出错！");
                }
            }catch (Exception e){
                throw new RuntimeException("删除图片时出错！"+e.getMessage());
            }
        }else {
            throw new RuntimeException("删除时图片id不能为空！");
        }
    }
}
