package fr.toulouse.service.impl;

import fr.toulouse.dao.DiscussionDao;
import fr.toulouse.entity.Discussion;
import fr.toulouse.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiscussionImpl implements DiscussionService{

    @Autowired
    private DiscussionDao discussionDao;

    @Override
    public List<Discussion> getDiscussion() {
        return discussionDao.queryDiscussion();
    }

    @Override
    public List<Discussion> getDiscussionById(Integer discussionId) {
        return discussionDao.queryDiscussionById(discussionId);
    }

    @Override
    public List<Discussion> getDiscussionByTag(String tag) {
        return discussionDao.queryDiscussionByTag(tag);
    }

    @Override
    public List<Discussion> getDiscussionByOwner(Integer owner) {
        return discussionDao.queryDiscussionByOwner(owner);
    }

    @Transactional
    @Override
    public boolean addDiscussion(Discussion discussion) {
        try{
            int effectedNum = discussionDao.insertDiscussion(discussion);
            if(effectedNum > 0){
                return true;
            }else{
                throw new RuntimeException("发帖失败！");
            }
        }catch (Exception e){
            throw new RuntimeException("发帖失败！"+e.getMessage());
        }
    }

    @Transactional
    @Override
    public boolean modifyDiscussion(Discussion discussion) {
        if(discussion.getId() > 0){
            try{
                int effectedNum = discussionDao.updateDiscussion(discussion);
                if(effectedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("修改时帖子出错！");
                }
            }catch (Exception e){
                throw new RuntimeException("修改时帖子出错！"+e.getMessage());
            }
        }else {
            throw new RuntimeException("修改时帖子id不能为空！");
        }
    }

    @Transactional
    @Override
    public boolean deleteDiscussion(Integer discussionId) {
        if(discussionId > 0){
            try{
                int effectedNum = discussionDao.deleteDiscussion(discussionId);
                if(effectedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("删除帖子时出错！");
                }
            }catch (Exception e){
                throw new RuntimeException("删除帖子时出错！"+e.getMessage());
            }
        }else {
            throw new RuntimeException("删除时帖子id不能为空！");
        }
    }
}
