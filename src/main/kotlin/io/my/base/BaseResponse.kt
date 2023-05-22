package io.my.base

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class BaseResponse(
    val code: Int,
    val infos: Any? = null,
)
