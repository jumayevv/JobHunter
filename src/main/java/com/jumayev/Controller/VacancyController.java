package com.jumayev.Controller;

import com.jumayev.Service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VacancyController {

    @Autowired
    private VacancyService vacancyService;

    @RequestMapping("/showvacancy")
    public ModelAndView VacancyList(){
        ModelAndView mv = new ModelAndView();
        return mv;
    }

    @RequestMapping("/addvacancy")
    public ModelAndView AddVacancy(@PathVariable("id") Integer id){
        ModelAndView mv = new ModelAndView();
        return mv;
    }
}
