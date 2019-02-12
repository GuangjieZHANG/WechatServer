package fr.toulouse.dao;

import fr.toulouse.entity.Object;

import java.util.List;

public interface ObjectDao {

    /***
     * 获取所有的二手物品信息
     * @return
     */
    List<Object> queryObjects();

    /***
     * 通过ID获取物品详情
     * @param id
     * @return
     */
    Object queryObjectById(String id);

    /***
     * 通过发布者ID获得本人发布的所有物品
     * @param ownerId
     * @return
     */
    List<Object> queryObjectsByOwner(Integer ownerId);

    /***
     * 通过TAG筛选要看的二手物品
     * @param tag
     * @return
     */
    List<Object> queryObjectsByTag(String tag);

    /***
     * 发布一件二手物品
     * @param object
     * @return
     */
    boolean insertObject(Object object);

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
    boolean updateObject(Object object);

}
