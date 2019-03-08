package fr.toulouse.dao;

import fr.toulouse.entity.Advertising;

import java.util.List;

public interface AdvertisingDao {

    /**
     *
     * @return
     */
    List<Advertising> queryAdvertising();

    /**
     *
     * @param tag
     * @return
     */
    List<Advertising> queryAdvertisingByTag(String tag);

    /**
     *
     * @param advertising
     * @return
     */
    int insertAdvertising(Advertising advertising);

    /**
     *
     * @param advertising
     * @return
     */
    int updateAdvertising(Advertising advertising);

    /**
     *
     * @param adId
     * @return
     */
    int deleteAdvertising(Integer adId);

}
