package fr.toulouse.dao;

import fr.toulouse.entity.SHobject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SHobjectDao {

    /***
     * 获取所有的二手物品信息
     * @return
     */
    List<SHobject> queryObjects();

    /***
     * 通过ID获取物品详情
     * @param id
     * @return
     */
    SHobject queryObjectById(Integer id);

    /***
     * 通过发布者ID获得本人发布的所有物品
     * @param ownerId
     * @return
     */
    List<SHobject> queryObjectsByOwner(Integer ownerId);

    /***
     * 通过TAG筛选要看的二手物品
     * @param tag
     * @return
     */
    List<SHobject> queryObjectsByTag(String tag);

    /***
     * 发布一件二手物品
     * @param sHobject
     * @return
     */
    int insertObject(SHobject sHobject);

    /***
     * 删除一件二手物品
     * @param id
     * @return
     */
    int deleteObject(Integer id);

    /***
     * 修改一件二手物品
     * @param sHobject
     * @return
     */
    int updateObject(SHobject sHobject);

    /***
     * 为一件二手物品点赞
     * @param userId
     * @param objectId
     * @return
     */
    int likeObject(@Param("userId") Integer userId, @Param("objectId") Integer objectId);

    /***
     * 取消对某物品的点赞
     * @param userId
     * @param objectId
     * @return
     */
    int dislikeObject(@Param("userId") Integer userId,@Param("objectId") Integer objectId);
}
