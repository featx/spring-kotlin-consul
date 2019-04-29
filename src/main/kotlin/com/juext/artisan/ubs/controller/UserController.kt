package com.juext.artisan.ubs.controller

import com.juext.artisan.ubs.domain.UserInfo
import com.juext.artisan.ubs.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import javax.annotation.Resource

@RestController("/user")
class UserController {

    @Resource
    private var userService: UserService? = null

    @GetMapping("/get")
    fun getById(id: Long): Mono<UserInfo> {
        return Mono.fromCallable {
            userService?.findOne(id)?.let { UserInfo(it) }
        }
    }
}