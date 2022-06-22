package kz.adam.ukhayev.distributor.component.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        value = "messenger-api",
        url = "${feign.url.messenger-api}"
)
public interface FeignMessengerApi {

}
