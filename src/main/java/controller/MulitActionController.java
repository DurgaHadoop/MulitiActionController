package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MulitActionController 
{
	  @RequestMapping("/goodmorning")
      public ModelAndView sayGoodMorning()
      {
    	  ModelAndView m=new ModelAndView("hello");
    	  m.addObject("greeting", "Hello Good Morning!");
    	  return m;
      }
	  @RequestMapping("/goodafternoon")
	  public ModelAndView sayGoodAfterNoon()
	  {
		  ModelAndView m=new ModelAndView("hello");
    	  m.addObject("greeting", "Hello Good AfterNoon!");
    	  return m;
	  }
	  @RequestMapping("/goodevening")
	  public ModelAndView sayGoodEvening() 
	  {
		  ModelAndView m=new ModelAndView("hello");
    	  m.addObject("greeting", "Hello Good Evening!");
    	  return m;
	}
	  @RequestMapping("/goodnight")
	  public ModelAndView sayGoodNight() 
	  {
		  ModelAndView m=new ModelAndView("hello");
    	  m.addObject("greeting", "Hello Good Night!");
    	  return m;
	}
}
