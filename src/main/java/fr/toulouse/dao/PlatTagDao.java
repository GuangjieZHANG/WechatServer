package fr.toulouse.dao;

import fr.toulouse.entity.PlatTag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlatTagDao {

    /**
     *
     * @param platId
     * @return
     */
    List<PlatTag> queryTagById(Integer platId);

    /**
     *
     * @param platId
     * @param tag
     * @return
     */
    int insertTag(@Param("platId") Integer platId,@Param("tag") String tag);

    /**
     *
     * @param platId
     * @param tag
     * @return
     */
    int deleteTag(@Param("platId") Integer platId,@Param("tag") String tag);

    /**
     *
     * @param platId
     * @return
     */
    int deleteAllTags(Integer platId);

    /**
     *
     * @param platId
     * @param tag
     * @return
     */
    int updateTag(@Param("platId") Integer platId,@Param("tag") String tag);

}
