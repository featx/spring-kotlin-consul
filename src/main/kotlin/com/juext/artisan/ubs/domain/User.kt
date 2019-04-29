package com.juext.artisan.ubs.domain

import com.juext.artisan.ubs.entity.User
import java.io.Serializable

data class UserInfo(var id: Long? = 0,
                    var name: String? = null,
                    var email: String? = null) : Serializable {
    constructor(user: User) : this(user.id, user.name, user.email) {
    }
}