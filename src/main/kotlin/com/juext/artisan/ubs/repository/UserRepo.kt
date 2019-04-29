package com.juext.artisan.ubs.repository

import com.juext.artisan.ubs.entity.User
import org.apache.ibatis.annotations.*

@Mapper
interface UserRepo {

    @Select("select id, name, email from t_ubs_user where id = #{id}")
    fun retrieveOne(id: Long): User

    @Insert("insert into t_ubs_user(name, email) values(#{name}, #{email})")
    @SelectKey(before = false, keyColumn = "id", keyProperty = "id", resultType = Long::class,
            statement = ["SELECT LAST_INSERT_ID() AS ID"])
    fun create(user: User)

    @Update("update")
    fun update(user: User)

    @Update("update t_ubs_user set is_deleted = 0 where id = #{id}")
    fun delete(id: Long)

}
