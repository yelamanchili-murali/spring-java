package tbs.demos.spring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Tanzu Build Service!";
	}

	@RequestMapping("/v2")
	public String indexV2() {
		return "Greetings from Tanzu Build Service v2!";
	}

}