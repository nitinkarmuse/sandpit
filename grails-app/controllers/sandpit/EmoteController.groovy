package sandpit

class EmoteController {
	EmoteService emoteService

    def create() {
		
	}
	
	def save(){
		String emoteText = params.emote_text
		String title = emoteText.substring(0, emoteText.indexOf("/"))
		String []expressions = emoteText.substring(emoteText.indexOf("/")+1
			,emoteText.indexOf("\\")).split("/")
		String [] topics = 	emoteText.substring(emoteText.indexOf("\\")).split("\\\\")
		Emote emote = new Emote(session.user.id, topics, expressions, title)
		
		emote.save()
		render ("your saved emote  as "+ emote.id)
	}
	
	def search(){
		
//		def query = Emote.where{
//			topics == params.topic
//		}
//		def results = query.find()
		def results = emoteService.searchByTopic(params.topic)
		println "got results ${results}"

		[emotes:results]
	}
}