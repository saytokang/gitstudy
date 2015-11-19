package x.y.z;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCoinController {

	@RequestMapping(value="/my/sample")
	public String mySample() {
		
		return "page1";
	}
}
