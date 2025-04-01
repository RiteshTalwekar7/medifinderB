package com.medifinder.SuperAdmin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/superAdmin")
public class SuperAdminController {
  @Autowired
	private SuperAdminService superAdminService;
	
	@GetMapping(value = "/ViewAdmin")
	public List<SuperAdmin>	getAllAdmins()
	{
		return superAdminService.getAllAdmins();
	}
  
	 @PostMapping(value = "/AddNewAdmin")
	 public void addStudent(@RequestBody SuperAdmin admin) {
		 superAdminService.addAdmin(admin);
	 }
}
