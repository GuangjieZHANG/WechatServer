package fr.toulouse.dao;

import fr.toulouse.entity.Restaurant;

import java.util.List;

public interface RestaurantDao {

    /**
     * 查询所有餐馆
     * @return
     */
    List<Restaurant> queryRestaurants();

    /**
     * 查询具有某id的餐馆
     * @return
     */
    Restaurant queryRestaurantById(Integer id);

    /**
     * 增加一个餐馆
     * @param restaurant
     * @return
     */
    int insertRestaurant(Restaurant restaurant);

    /**
     * 删除一个餐馆
     * @param id
     * @return
     */
    int deleteRestaurant(Integer id);

    /**
     * 更新一个餐馆
     * @param restaurant
     * @return
     */
    int updateRestaurant(Restaurant restaurant);
}
