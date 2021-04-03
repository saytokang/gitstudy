package x.y.z;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HooController {

	@RequestMapping(value="/hoo/1")
	@ResponseBody
	public String hoo(){
		
		return "my hoo";
	}
}
