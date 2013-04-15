package sandpit



class MyLayoutController {

	UserService userService
	
    def index() {
//		User user = new User();
//		user.name = "Nitin"
//		user.save()
		["friends": userService.freinds]
	}
}
