package sandpit



import grails.test.mixin.*
import groovy.json.JsonSlurper
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(UserService)
class UserServiceTests {

	
	void testJsonParsing(){
		JsonSlurper slurper = new JsonSlurper()
		String jsonText;
		new File("D:\\Users\\Nitin\\development\\workspace-ggts-3.2.0.RELEASE\\sandpit\\test\\unit\\sandpit\\fb_friends.json").eachLine{ line ->
			println line
			jsonText = line
		}
		def result = slurper.parseText(jsonText)
		println result.data.size()
		
		
		result.data.each{ friend ->
			print "${friend.id} \t"
			println friend.name
		}
		

	}
}
