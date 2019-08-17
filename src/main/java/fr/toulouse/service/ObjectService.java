package fr.toulouse.service;

import fr.toulouse.entity.SHobject;

import java.util.List;

public interface ObjectService {
    /***
     * 获取所有的二手物品信息
     * @return
     */
    List<SHobject> getAllObjects(Integer userId);

    /***
     * 通过ID获取物品详情
     * @param id
     * @return
     */
    SHobject getObjectById(Integer id, Integer userId);

    /***
     * 通过发布者ID获得本人发布的所有物品
     * @param ownerId
     * @return
     */
    List<SHobject> getObjectsByOwner(Integer ownerId);

    /***
     * 通过TAG筛选要看的二手物品
     * @param tag
     * @return
     */
    List<SHobject> getObjectsByTag(String tag,Integer userId);

    /***
     * 发布一件二手物品
     * @param SHobject
     * @return
     */
    boolean addObject(SHobject SHobject);

    /***
     * 删除一件二手物品
     * @param id
     * @return
     */
    boolean deleteObject(Integer id);

    /***
     * 修改一件二手物品
     * @param SHobject
     * @return
     */
    boolean modifyObject(SHobject SHobject);

    /***
     * 为一件二手物品点赞
     * @param userId
     * @param objectId
     * @return
     */
    boolean likeObject(Integer userId, Integer objectId);

    /***
     * 取消对某物品的点赞
     * @param userId
     * @param objectId
     * @return
     */
    boolean dislikeObject(Integer userId, Integer objectId);
}
