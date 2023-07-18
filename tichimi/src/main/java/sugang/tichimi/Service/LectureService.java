package sugang.tichimi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sugang.tichimi.Entity.Lecture;
import sugang.tichimi.Repository.LectureRepository;

import java.util.List;

@Service
public class LectureService {
    @Autowired
    LectureRepository lectureRepository;

    public List<Lecture> lectureList() {
        List<Lecture> lecture = lectureRepository.findAll();
        return lecture;
    }

    public List<Lecture> lectureByCategory(List<Integer> category){
        List<Lecture> lecture = lectureRepository.findLecturesByCategoryId(category);
        return lecture;
    }

}
