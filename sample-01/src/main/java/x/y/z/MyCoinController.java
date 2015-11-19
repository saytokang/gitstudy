package x.y.z;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import x.y.z.service.MyCoinService;

@Controller
public class MyCoinController {

	@Autowired
	MyCoinService myCoinService;
	
	
	@RequestMapping(value="/my/sample")
	public String mySample(ModelMap model) {
		// 긴급 패치
		/**
		 * 패치 사항을 꼭 테스트 해 주세요.
		 * 
		 * 
		 */
		
		List<Map<String, Object>> list = myCoinService.getSampleList();
		model.addAttribute("list", list);
		return "page1";
	}
	
	@RequestMapping(value="/my/profile")
	@ResponseBody
	public String getProfile() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "kang");
		map.put("phone", "000-9999-2123");
		return map.toString();
	}
}
