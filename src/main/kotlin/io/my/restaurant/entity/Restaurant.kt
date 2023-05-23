package io.my.restaurant.entity

import io.my.base.entity.BaseStatus
import org.springframework.data.annotation.Id

data class Restaurant(
    @Id val id: Long,
    val name: String,
    val englishName: String,
    val status: BaseStatus,
)
