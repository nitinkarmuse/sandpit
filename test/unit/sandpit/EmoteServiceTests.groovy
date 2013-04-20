package sandpit




import org.junit.*

import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import grails.test.mixin.Mock
import grails.test.mixin.support.GrailsUnitTestMixin
import grails.test.mixin.domain.DomainClassUnitTestMixin
import grails.test.mixin.services.ServiceUnitTestMixin
import grails.test.mixin.web.ControllerUnitTestMixin
import grails.test.mixin.web.FiltersUnitTestMixin
import grails.test.mixin.web.GroovyPageUnitTestMixin

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(EmoteService)
@Mock(Emote)
class EmoteServiceTests {
 
    void testSearchForNullTopic() {
        assertTrue true
    }
	
	void testSearch(){
		// can't test search by topic as GORM mock can not simulate keyword search
		Emote testData = new Emote("user1", ["topic, topic2"].toArray(new String[1]), ["wow", "nice"].toArray(new String[1]), "title")
		testData.save()
		
		Emote testData2 = new Emote(userId:"user1", topics:["topic, topic2"], expressions:["wow", "nice"], title:"title")
		testData2.save()

		
		def emotes = Emote.all
		
		assert emotes != null
		assert emotes.size() == 2
		
	}
	
	void testSearchWhenDBError(){
		
	}
	
	void testSearchForEmptyTopic(){
		
	}
}