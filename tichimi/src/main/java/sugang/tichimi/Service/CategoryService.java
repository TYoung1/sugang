package sugang.tichimi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sugang.tichimi.Entity.Category;
import sugang.tichimi.Repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public List<Category> Allcategory(){
        List<Category> list = categoryRepository.findAll();
        return list;
    }
}
