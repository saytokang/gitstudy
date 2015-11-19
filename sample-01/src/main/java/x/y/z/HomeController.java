package x.y.z;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/hello.html")
    public String hello() throws IOException {
         
        // 뷰이름 이름, render hello.jsp page
        return "home";
    }
 
	/**
	 * working branch 작업...
	 * @return
	 * @throws IOException
	 */
    @RequestMapping(value = "/test.html")
    public String test() throws IOException {
    	// 여기에 적당한 작업을 해 주세요. 
    	
    	if (true) {
    		throw new IOException("occured IOException...");
    	}
    	
        
        // 뷰이름 이름, render hello.jsp page
        return "home";
    }
	
}
