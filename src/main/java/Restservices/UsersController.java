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

@RestController
@RequestMapping ("/api/users")
public class UsersController {

	@Autowired
	private ListCrudRepository usersRepository;
	
	@PostMapping("/")
	public ResponseEntity<Users> addUser (@RequestBody Users u) {
		Users user  = service.addUser (u);
				if(user!=null)
					return new ResponseEntity<Users>(user,HttpStatus.CREATED);
				else 
					return new ResponseEntity<Users>(user,HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			
				@GetMapping("/{id}")
				public ResponseEntity<Users> getUserById(@PathVariable int id){
					  Users user= service.getUserById(id);
					  
					  if(user!=null)
						  return new ResponseEntity<Users>(user,HttpStatus.FOUND);
					  else
						  return new  ResponseEntity<Users>(user,HttpStatus.NOT_FOUND);
				}
				
				
				@PutMapping("/{id}")
				public ResponseEntity<Object> updateUser(@RequestBody Users user,@PathVariable int id){
					Users data= service.updateUser(user, id);
					
					if(data!=null)
						return new ResponseEntity<Object>(data,HttpStatus.OK);
					else
						return new ResponseEntity<Object>("User is Not Available",HttpStatus.NOT_FOUND);
				}
				
				
		
	}
	
	

