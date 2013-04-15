package sandpit

class LoginController {

	UserService userService
	
	public static int counter = 0
	
    def index() { }
	
	def friends(){
		
		User user = User.findByEmailId(params.emailId)
		if(user == null){
			user = new User(params)
			user.fbId = counter++;
			user.save()
		}
		session.user = user
		["user":user]
		
	}
}
