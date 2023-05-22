package io.my.base.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "jjwt")
data class JwtProperties(
    val accessToken: JwtTokenProperties,
    val refreshToken: JwtTokenProperties,
)

data class JwtTokenProperties(
    val expiredTime: Int,
    val secretKey: String,
)
