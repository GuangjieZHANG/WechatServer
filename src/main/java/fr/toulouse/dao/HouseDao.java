package fr.toulouse.dao;

import fr.toulouse.entity.House;

import java.util.List;

public interface HouseDao {

    /**
     *
     * @return
     */
    List<House> queryHouses();

    /**
     *
     * @param houseId
     * @return
     */
    List<House> queryHouseById(Integer houseId);

    /**
     *
     * @param ownerId
     * @return
     */
    List<House> queryHouseByOwner(Integer ownerId);

    //List<House> queryHouseByTag(String tag);

    /**
     *
     * @param house
     * @return
     */
    int insertHouse(House house);

    /**
     *
     * @param house
     * @return
     */
    int updateHouse(House house);

    /**
     *
     * @param houseId
     * @return
     */
    int deleteHouse(Integer houseId);
}
