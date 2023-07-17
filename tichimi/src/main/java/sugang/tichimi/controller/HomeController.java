package sugang.tichimi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sugang.tichimi.Entity.Category;
import sugang.tichimi.Entity.Lecture;
import sugang.tichimi.Service.CategoryService;
import sugang.tichimi.Service.LectureService;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    LectureService lectureService;
    @Autowired
    CategoryService categoryService;
    @GetMapping("/home")
    public String home(Model model){
        List<Lecture> lecture = lectureService.lectureList();
        List<Category> categories = categoryService.Allcategory();
        model.addAttribute("lecture",lecture);
        return "content/home";
    }

}
