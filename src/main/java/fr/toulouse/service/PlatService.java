package fr.toulouse.service;

import fr.toulouse.entity.Plat;

import java.util.List;

public interface PlatService {

    /**
     *
     * @return
     */
    List<Plat> getAllPlats();

    /**
     *
     * @return
     */
    List<Plat> getSpecialPlats();

    /**
     *
     * @param tag
     * @return
     */
    List<Plat> getPlatByTag(String tag);

    /**
     *
     * @param restaurantId
     * @return
     */
    List<Plat> getPlatByRestaurant(Integer restaurantId);

    /**
     *
     * @param plat
     * @return
     */
    boolean addPlat(Plat plat);

    /**
     *
     * @param platId
     * @return
     */
    boolean deletePlat(Integer platId);

    /**
     *
     * @param plat
     * @return
     */
    boolean modifyPlat(Plat plat);

    /**
     *
     * @param userId
     * @param platId
     * @return
     */
    boolean likePlat(Integer userId, Integer platId);

    /**
     *
     * @param userId
     * @param platId
     * @return
     */
    boolean dislikePlat(Integer userId, Integer platId);

}
