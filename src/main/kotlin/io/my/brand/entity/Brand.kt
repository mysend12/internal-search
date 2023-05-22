package io.my.brand.entity

import io.my.base.entity.BaseStatus
import org.springframework.data.annotation.Id

data class Brand(
    @Id val id: Long,
    val name: String,
    val englishName: String,
    val status: BaseStatus,
) {
}