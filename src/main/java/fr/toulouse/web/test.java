package fr.toulouse.web;

import java.io.IOException;

import fr.toulouse.tool.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getid")
public class test {
	// get test
	@RequestMapping(value = "/getallids", method = RequestMethod.GET)
		public String getTest() throws IOException{
			return "test ok";
		}

	// get data 
	@RequestMapping(value = "/getopenid", method = RequestMethod.GET)
	public String getOpenId(String code) throws IOException{
		// send request
		HttpRequest req = new HttpRequest();
		String id = req.getidReq(code);
		return id;
	}
	
}
