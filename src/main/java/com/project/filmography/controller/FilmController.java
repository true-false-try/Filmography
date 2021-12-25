package com.project.filmography.controller;

import com.project.filmography.model.Film;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// Class which processes requests
@Controller
public class FilmController {

    Film film = new Film("Inception", 2010, "dramma", true);

    /**
     * Address in the client browser "/" and type request "GET"
     * @return  modelAndView it's the films.jsp
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allFilms() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("films");
        modelAndView.addObject("film", film.toString());
        return modelAndView;
    }

    /**
     * Address in the client browser "/edit" and type request "GET"
     * @return  modelAndView it's the editPage.jsp
     */
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }


}
