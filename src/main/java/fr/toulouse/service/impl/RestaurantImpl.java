package fr.toulouse.service.impl;

import fr.toulouse.dao.PlatDao;
import fr.toulouse.dao.RestaurantDao;
import fr.toulouse.entity.Plat;
import fr.toulouse.entity.Restaurant;
import fr.toulouse.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RestaurantImpl implements RestaurantService {

    @Autowired
    private RestaurantDao restaurantDao;

    @Autowired
    private PlatDao platDao;

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantDao.queryRestaurants();
    }

    @Override
    public Restaurant getRestaurantById(Integer restaurantId) {
        // add plats for restaurant here
        Restaurant restaurant = restaurantDao.queryRestaurantById(restaurantId);
        List<Plat> plats = platDao.queryPlatByRestaurant(restaurantId);
        restaurant.setPlats(plats);
        return restaurant;
    }

    @Transactional
    @Override
    public boolean addRestaurant(Restaurant restaurant) {
        try{
            int effectedNum = restaurantDao.insertRestaurant(restaurant);
            if(effectedNum > 0){
                return true;
            }else{
                throw new RuntimeException("新建餐馆失败！");
            }
        }catch (Exception e){
            throw new RuntimeException("新建餐馆失败！"+e.getMessage());
        }
    }

    @Transactional
    @Override
    public boolean deleteRestaurant(Integer restaurantId) {
        if(restaurantId > 0){
            try{
                int effectedNum = restaurantDao.deleteRestaurant(restaurantId);
                if(effectedNum > 0){
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
    public boolean modifyRestaurant(Restaurant restaurant) {
        if(restaurant.getId() > 0){
            try{
                int effectedNum = restaurantDao.updateRestaurant(restaurant);
                if(effectedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("修改时餐馆id不能为空！");
                }
            }catch (Exception e){
                throw new RuntimeException("修改时餐馆id不能为空！"+e.getMessage());
            }
        }else {
            throw new RuntimeException("修改时餐馆id不能为空！");
        }
    }
}
