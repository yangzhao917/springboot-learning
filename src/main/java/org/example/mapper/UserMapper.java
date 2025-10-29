package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户Mapper
 * @author yangzhao
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 根据id获取用户信息
     * @param id 用户id
     * @return 用户信息
     */
    // @Select("select * from t_user where id = #{id}")
    User getUserById(Long id);

    /**
     * 获取所有用户信息
     * @return 所有用户信息
     */
//    @Select("select * from t_user")
    List<User> getAllUsers();


    /**
     * 添加用户
     *
     * @param user 用户信息
     */
//    @Insert("insert into t_user(username, password) values(#{username}, #{password})")
    int addUser(User user);

    /**
     * 删除用户
     * @param id 用户id
     */
//    @Delete("delete from t_user where id = #{id}")
    int deleteUserById(Long id);
}
