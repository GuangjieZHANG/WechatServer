package fr.toulouse.service;

import fr.toulouse.entity.Restaurant;

import java.util.List;

public interface RestaurantService {

    /**
     *
     * @return
     */
    List<Restaurant> getAllRestaurants();

    /**
     *
     * @param restaurantId
     * @return
     */
    Restaurant getRestaurantById(Integer restaurantId);

    /**
     *
     * @param restaurant
     * @return
     */
    boolean addRestaurant(Restaurant restaurant);

    /**
     *
     * @param restaurangId
     * @return
     */
    boolean deleteRestaurant(Integer restaurangId);

    /**
     *
     * @param restaurant
     * @return
     */
    boolean modifyRestaurant(Restaurant restaurant);
}
