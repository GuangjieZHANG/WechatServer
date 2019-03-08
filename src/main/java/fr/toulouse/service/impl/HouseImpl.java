package fr.toulouse.service.impl;

import fr.toulouse.dao.HouseDao;
import fr.toulouse.entity.House;
import fr.toulouse.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HouseImpl implements HouseService {

    @Autowired
    private HouseDao houseDao;

    @Override
    public List<House> getAllHouses() {
        return houseDao.queryHouses();
    }

    @Override
    public List<House> getHouseById(Integer houseId) {
        return houseDao.queryHouseById(houseId);
    }

    @Override
    public List<House> getHouseByOwner(Integer ownerId) {
        return houseDao.queryHouseByOwner(ownerId);
    }

    @Transactional
    @Override
    public boolean addHouse(House house) {
        try{
            int effectedNum = houseDao.insertHouse(house);
            if(effectedNum > 0){
                return true;
            }else{
                throw new RuntimeException("新建租房失败！");
            }
        }catch (Exception e){
            throw new RuntimeException("新建租房失败！"+e.getMessage());
        }
    }

    @Transactional
    @Override
    public boolean modifyHouse(House house) {
        if(house.getId() > 0){
            try{
                int effectedNum = houseDao.updateHouse(house);
                if(effectedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("修改时租房出错！");
                }
            }catch (Exception e){
                throw new RuntimeException("修改时租房出错！"+e.getMessage());
            }
        }else {
            throw new RuntimeException("修改时租房id不能为空！");
        }
    }

    @Transactional
    @Override
    public boolean deleteHouse(Integer houseId) {
        if(houseId > 0){
            try{
                int effectedNum = houseDao.deleteHouse(houseId);
                if(effectedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("删除时租房出错！");
                }
            }catch (Exception e){
                throw new RuntimeException("删除时租房出错！"+e.getMessage());
            }
        }else {
            throw new RuntimeException("删除时租房id不能为空！");
        }
    }
}
