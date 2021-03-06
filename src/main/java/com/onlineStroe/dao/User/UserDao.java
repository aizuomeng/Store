package com.onlineStroe.dao.User;

import com.onlineStroe.enty.UserCustom;
import com.onlineStroe.enty.UserQueryVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@Repository
public interface UserDao {

    public UserCustom findUserById(UserQueryVo userQueryVo)throws Exception;

    public List<UserCustom> findAll()throws Exception;
}
