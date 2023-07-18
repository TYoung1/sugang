package sugang.tichimi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sugang.tichimi.Entity.Coupon;
import sugang.tichimi.Repository.CouponRepository;

import java.util.List;

@Service
public class CouponService {
    @Autowired
    CouponRepository couponRepository;
    public List<Coupon> allCoupon(){
        List<Coupon> coupon = couponRepository.findAll();
        return coupon;
    }
}
