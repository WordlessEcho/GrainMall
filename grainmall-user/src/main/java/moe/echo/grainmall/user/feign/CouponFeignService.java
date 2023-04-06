package moe.echo.grainmall.user.feign;

import moe.echo.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("grainmall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/user/list")
    public R userCoupons();
}
