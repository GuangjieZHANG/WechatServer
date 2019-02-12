package fr.toulouse.service;

import fr.toulouse.entity.Object;

import java.util.List;

public interface ObjectService {
    /***
     * 获取所有的二手物品信息
     * @return
     */
    List<Object> getAllObjects();

    /***
     * 通过ID获取物品详情
     * @param id
     * @return
     */
    Object getObjectById(String id);

    /***
     * 通过发布者ID获得本人发布的所有物品
     * @param ownerId
     * @return
     */
    List<Object> getObjectsByOwner(Integer ownerId);

    /***
     * 通过TAG筛选要看的二手物品
     * @param tag
     * @return
     */
    List<Object> getObjectsByTag(String tag);

    /***
     * 发布一件二手物品
     * @param object
     * @return
     */
    boolean addObject(Object object);

    /***
     * 删除一件二手物品
     * @param id
     * @return
     */
    boolean deleteObject(Integer id);

    /***
     * 修改一件二手物品
     * @param object
     * @return
     */
    boolean modifyObject(Object object);
}
