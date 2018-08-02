package ro.alex.jokeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ro.alex.jokeapp.services.JokeService;

@Controller
public class JokeController
{
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJokes(Model model)
    {
        model.addAttribute("joke", jokeService.getQuote());

        return "jokes";
    }
}
