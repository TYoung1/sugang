package sugang.tichimi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sugang.tichimi.Entity.Coupon;
@Repository
public interface CouponRepository extends JpaRepository<Coupon,Integer> {

}
