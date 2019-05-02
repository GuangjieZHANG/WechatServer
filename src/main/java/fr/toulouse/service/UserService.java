package fr.toulouse.service;

import fr.toulouse.entity.User;

public interface UserService {

    /**
     *
     * @param userId
     * @return
     */
    User getUserById(Integer userId);

    /**
     *
     * @param openId
     * @return
     */
    User getUserByOpenId(String openId);

    /**
     *
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     *
     * @param id
     * @return
     */
    boolean deleteUser(Integer id);

    /**
     *
     * @param user
     * @return
     */
    boolean updateUser(User user);

}
