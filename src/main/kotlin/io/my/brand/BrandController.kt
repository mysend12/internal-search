package io.my.brand

import io.my.base.BaseResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api")
class BrandController {

    @GetMapping("/brands")
    fun findAllBrands(): Mono<BaseResponse> {
        return Mono.just(
            BaseResponse(
                code = 0,
            )
        )
    }

}