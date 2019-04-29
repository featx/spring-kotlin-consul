package com.juext.artisan.ubs

import org.springframework.boot.runApplication
import org.springframework.cloud.client.SpringCloudApplication

@SpringCloudApplication
class UbsApplication

fun main(args: Array<String>) {
	runApplication<UbsApplication>(*args)
}
