package kz.adam.ukhayev.distributor.component.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        value = "media-api",
        url = "${feign.url.media-api}"
)
public interface FeignMediaApi {

}
