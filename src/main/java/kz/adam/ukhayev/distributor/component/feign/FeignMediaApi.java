package kz.adam.ukhayev.distributor.component.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        value = "users-api",
        url = "${feign.url.media-api}"
)
public interface FeignMediaApi {

}
