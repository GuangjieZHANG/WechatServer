package fr.toulouse.service;

import fr.toulouse.entity.Advertising;

import java.util.List;

public interface AdvertisingService {

    /**
     *
     * @return
     */
    List<Advertising> getAllAdvertising();

    /**
     *
     * @param tag
     * @return
     */
    List<Advertising> getAdvertisingByTag(String tag);

    /**
     *
     * @param advertising
     * @return
     */
    boolean addAdvertising(Advertising advertising);

    /**
     *
     * @param advertising
     * @return
     */
    boolean modifyAdvertising(Advertising advertising);

    /**
     *
     * @param adId
     * @return
     */
    boolean deleteAdvertising(Integer adId);

}
