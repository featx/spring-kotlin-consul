package com.juext.artisan.ubs.service

import com.juext.artisan.ubs.entity.User

interface UserService {

    fun save(user: User)

    fun findOne(id: Long): User

    fun remove(id: Long)

}