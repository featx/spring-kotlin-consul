package com.juext.artisan.ubs.service

import com.juext.artisan.ubs.entity.User
import com.juext.artisan.ubs.repository.UserRepo
import org.springframework.stereotype.Service
import javax.annotation.Resource

@Service
class UserServiceImpl: UserService {

    private val DEFAULT_ID: Long = 0L

    @Resource
    private var userRepo: UserRepo? = null

    override fun save(user: User) {
        if (user.id == null || DEFAULT_ID.equals(user.id)) {
            userRepo?.create(user)
        } else {
            userRepo?.update(user)
        }
    }

    override fun findOne(id: Long): User {
        return userRepo?.retrieveOne(id)!!
    }

    override fun remove(id: Long) {
        userRepo?.delete(id)
    }
}