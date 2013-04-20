package sandpit

import org.apache.log4j.chainsaw.LoggingReceiver.Slurper;

import groovy.json.JsonSlurper;

class UserService {

    List<User> getFreinds() {
		
		JsonSlurper slurper = new JsonSlurper()
		String jsonText;
		new File("").eachLine{ line ->
			println line
			jsonText = line
		}
		def result = slurper.parseText(line)
		println result
		return User.list()

    }
	
	User findOrCreate(params){
		return User.findOrCreateWhere(params)
	}
}
