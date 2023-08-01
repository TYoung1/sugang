package sugang.tichimi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sugang.tichimi.Entity.Lecture;
import sugang.tichimi.Entity.User;
import sugang.tichimi.Repository.CouponRepository;
import sugang.tichimi.Repository.LectureRepository;
import sugang.tichimi.Repository.UserRepository;

import javax.transaction.Transactional;

@Service
public class EnrollService {
    @Autowired
    LectureRepository lectureRepository;
    @Autowired
    CouponRepository couponRepository;
    @Autowired
    UserRepository userRepository;
    @Transactional
    public void enroll(int lectureId,String userId,int couponId){
       Lecture lecture =  lectureRepository.findById(lectureId).orElseThrow(()->new RuntimeException("없는강의"));
        User user = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("없는유저"));
    }
}
