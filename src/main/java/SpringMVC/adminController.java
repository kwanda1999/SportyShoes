package SpringMVC;

import javax.print.PrintService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PurchaseReportService;

@RestController
@RequestMapping ("/admin")
public class adminController {
	
	
	@Autowired
	UserDetailsService userServices;
	
	@Autowired
	PrintService proService;
	


}
