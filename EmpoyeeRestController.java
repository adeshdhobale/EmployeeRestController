@RestController(value="/empoyee"
public class EmployeeRestController 
{

	@Autowired
	priavate EmppoyeeService service;
	@GetMapping(value="/{empNo}"
	pubclic ResponseEntity<Empoloyee> getEmployee(@PathVariable("empno") int empNo)
	{
		Employee emp=service.getEmpoyee(empNo);
		return ResponseEntity.Ok().body(emp);
	}
}