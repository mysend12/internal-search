package io.my.menu.entity

import io.my.base.entity.BaseStatus
import org.springframework.data.annotation.Id

data class Menu(
    @Id val id: Long,
    val name: String,
    val englishName: String,
    val status: BaseStatus,
)
