package sandpit

class UserService {

    List<User> getFreinds() {
		
		return User.list()

    }
	
	User findOrCreate(params){
		return User.findOrCreateWhere(params)
	}
}
