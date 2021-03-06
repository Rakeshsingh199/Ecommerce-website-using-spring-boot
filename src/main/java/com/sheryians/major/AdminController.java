package com.sheryians.major;
import com.sheryians.majormodel.Category;
import com.sheryians.majorservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AdminController {
	@Autowired
	CategoryService categoryService;
    @GetMapping("/admin")
    public String adminHome() {
	return "adminHome";
}
    @GetMapping("/admin/categories")
    public String getCat() {
	//model.addAttribute("categories",categoryService.getAllCategory());
	return "categories";
	}
    @GetMapping("/admin/categories/categoriesAdd")
    public String getCatAdd(Model model) {
	model.addAttribute("category",new Category());
	return "categoriesAdd";
}

    @PostMapping("/admin/categories/categoriesAdd")
    public String postCatAdd(@ModelAttribute("category") Category category) {
	categoryService.addCategory(category);
	return "redirect:/admin/categories";
}
}
