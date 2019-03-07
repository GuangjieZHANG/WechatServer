package fr.toulouse.dao;

import fr.toulouse.entity.Plat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlatDao {

    /**
     * 查询所有的菜
     * @return
     */
    List<Plat> queryPlats();

    /**
     * 查询所有的特价菜
     * @return
     */
    List<Plat> querySpecialPlat();

    /**
     * 按标签查找菜
     * @param tag
     * @return
     */
    List<Plat> queryPlatByTag(String tag);

    /**
     * 按饭店查找菜
     * @param restaurantId
     * @return
     */
    List<Plat> queryPlatByRestaurant(Integer restaurantId);

    /**
     * 插入一道菜
     * @param plat
     * @return
     */
    int insertPlat(Plat plat);

    /**
     * 删除一道菜
     * @param id
     * @return
     */
    int deletePlat(Integer id);

    /**
     * 更新一道菜
     * @param plat
     * @return
     */
    int updatePlat(Plat plat);

    /**
     * 为某菜点赞
     * @param userId
     * @param platId
     * @return
     */
    int likePlat(@Param("userId") Integer userId, @Param("platId") Integer platId);

    /**
     * 取消对某菜的赞
     * @param userId
     * @param platId
     * @return
     */
    int dislikePlat(@Param("userId") Integer userId, @Param("platId") Integer platId);
}
