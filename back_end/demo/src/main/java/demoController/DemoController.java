package demoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demoModel.DemoModel;
import demoService.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@GetMapping("/AlldemoDeta")
	public List<DemoModel> getAllDemoData(){
		return demoService.findAll();
	}
	
	@PostMapping("/addDemoDeta")
	public DemoModel addDemoData(@RequestBody DemoModel demoModel) {
		return demoService.addDemoDeta(demoModel);
		
	}

}
