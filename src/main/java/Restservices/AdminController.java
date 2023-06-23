package Restservices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.serviceloader.*;
import org.springframework.boot.autoconfigure.webservices.*;

@RestController
@RequestMapping ("/api/admin")

public class AdminController {
	

	@Autowired
	private ListCrudRepository usersRepository;
	
	@GetMapping("/admin")
	public  List<Users> getAllUsernames (){
		return getAllUsernames();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable  int id ){
		
			//public service.deleteUsername(admin)
			return new ResponseEntity<Object>("User Deleted", HttpStatus.OK);
	}

	
	
	
	
	
			

}
