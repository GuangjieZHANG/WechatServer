package fr.toulouse.dao;

import fr.toulouse.entity.User;

public interface UserDao {

    /**
     *
     * @param userId
     * @return
     */
    User queryUserById(Integer userId);

    /**
     *
     * @param openId
     * @return
     */
    User queryUserByOpenId(String openId);

    /**
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     *
     * @param userId
     * @return
     */
    int deleteUser(Integer userId);
}
