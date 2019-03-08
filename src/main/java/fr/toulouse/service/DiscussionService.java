package fr.toulouse.service;

import fr.toulouse.entity.Discussion;

import java.util.List;

public interface DiscussionService {

    /**
     *
     * @return
     */
    List<Discussion> getDiscussion();

    /**
     *
     * @param discussionId
     * @return
     */
    List<Discussion> getDiscussionById(Integer discussionId);

    /**
     *
     * @param tag
     * @return
     */
    List<Discussion> getDiscussionByTag(String tag);

    /**
     *
     * @param owner
     * @return
     */
    List<Discussion> getDiscussionByOwner(Integer owner);

    /**
     *
     * @param discussion
     * @return
     */
    boolean addDiscussion(Discussion discussion);

    /**
     *
     * @param discussion
     * @return
     */
    boolean modifyDiscussion(Discussion discussion);

    /**
     *
     * @param discussionId
     * @return
     */
    boolean deleteDiscussion(Integer discussionId);


}
