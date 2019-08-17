package fr.toulouse.service;

import fr.toulouse.entity.Plat;

import java.util.List;

public interface PlatService {

    /**
     *
     * @return
     */
    List<Plat> getAllPlats(Integer userId);

    /**
     *
     * @return
     */
    List<Plat> getSpecialPlats(Integer userId);

    /**
     *
     * @param tag
     * @return
     */
    List<Plat> getPlatByTag(String tag);

    /**
     *
     * @param name
     * @return
     */
    List<Plat> getPlatByName(String name, Integer userId);

    /**
     *
     * @param restaurantId
     * @return
     */
    List<Plat> getPlatByRestaurant(Integer restaurantId, Integer userId);

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
