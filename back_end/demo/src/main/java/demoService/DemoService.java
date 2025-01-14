package demoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import demoModel.DemoModel;
import demoRepository.DemoRepository;


@Service
public class DemoService {
	
	@Autowired
	private DemoRepository demoRepository;

	public List<DemoModel> findAll() {
		return demoRepository.findAll();
	}

	public DemoModel addDemoDeta(DemoModel demoModel) {
		return demoRepository.save(demoModel);
	}

}
