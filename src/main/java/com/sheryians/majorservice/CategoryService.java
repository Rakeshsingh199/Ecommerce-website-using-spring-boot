package com.sheryians.majorservice;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.sheryians.majormodel.Category;
import com.sheryians.majorrepository.CategoryRepository;
import java.util.List;
@Service
public class CategoryService {
@Autowired
CategoryRepository categoryRepository;
public List<Category> getAllCategory(){
	return categoryRepository.findAll();
}
public void addCategory(Category category) {
	categoryRepository.save(category);
}
}
