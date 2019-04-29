package com.juext.artisan.ubs.entity

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "t_ubs_user")
data class User(@Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long? = 0,
                @Column(nullable = false) var name: String? = null,
                @Column(nullable = false) var email: String? = null) : Serializable {

    protected constructor() : this(id = null, name = null, email = null) {
    }
}