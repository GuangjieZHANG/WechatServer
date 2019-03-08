package fr.toulouse.dao;

import fr.toulouse.entity.Discussion;

import java.util.List;

public interface DiscussionDao {

    /**
     *
     * @return
     */
    List<Discussion> queryDiscussion();

    /**
     *
     * @param discussionId
     * @return
     */
    List<Discussion> queryDiscussionById(Integer discussionId);

    /**
     *
     * @param tag
     * @return
     */
    List<Discussion> queryDiscussionByTag(String tag);

    /**
     *
     * @param owner
     * @return
     */
    List<Discussion> queryDiscussionByOwner(Integer owner);

    /**
     *
     * @param discussion
     * @return
     */
    int insertDiscussion(Discussion discussion);

    /**
     *
     * @param discussion
     * @return
     */
    int updateDiscussion(Discussion discussion);

    /**
     *
     * @param discussionId
     * @return
     */
    int deleteDiscussion(Integer discussionId);

}
