package sandpit

class EmoteService {

    def save() {

    }
	
	
	def searchByTopic(String topic){
		def query = Emote.where{
			topics == topic 
		}
		return query.find()

	}
}
