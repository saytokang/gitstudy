package x.y.z;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyCoinController {

	@RequestMapping(value="/my/sample")
	public String mySample() {
		// 긴급 패치
		/**
		 * 패치 사항을 꼭 테스트 해 주세요.
		 * 
		 * 
		 */
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
