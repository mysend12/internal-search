package io.my.menu

import io.my.base.BaseResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api")
class MenuController {
    @GetMapping("/menus")
    fun findMenus(
        @RequestParam("restaurant_id") restaurantId: Long
    ): Mono<BaseResponse> {
        return Mono.just(
            BaseResponse(
                code = 0
            )
        )
    }

}