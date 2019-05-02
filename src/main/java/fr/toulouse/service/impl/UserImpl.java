package fr.toulouse.service.impl;

import fr.toulouse.dao.UserDao;
import fr.toulouse.entity.User;
import fr.toulouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.queryUserById(userId);
    }

    @Override
    public User getUserByOpenId(String openId) {
        return userDao.queryUserByOpenId(openId);
    }

    @Transactional
    @Override
    public boolean addUser(User user) {
        try{
            int effectedNum = userDao.insertUser(user);
            if(effectedNum > 0){
                return true;
            }else{
                throw new RuntimeException("新建user失败！");
            }
        }catch (Exception e){
            throw new RuntimeException("新建user失败！"+e.getMessage());
        }
    }

    @Override
    public boolean deleteUser(Integer id) {
        if(id > 0){
            try{
                int effectedNum = userDao.deleteUser(id);
                if(effectedNum > 0 ){
                    return true;
                }else {
                    throw new RuntimeException("删除时userid不能为空！");
                }
            }catch (Exception e){
                throw new RuntimeException("删除时userid不能为空！"+e.getMessage());
            }
        }else {
            throw new RuntimeException("删除时userid不能为空！");
        }
    }

    @Override
    public boolean updateUser(User user) {
        try{
            int effectedNum = userDao.updateUser(user);
            if(effectedNum > 0){
                return true;
            }else{
                throw new RuntimeException("新建user失败！");
            }
        }catch (Exception e){
            throw new RuntimeException("新建user失败！"+e.getMessage());
        }
    }
}
