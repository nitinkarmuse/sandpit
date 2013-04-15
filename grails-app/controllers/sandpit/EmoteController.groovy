package sandpit

class EmoteController {

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
		render ("your savaed emote  as "+ emote.id)
	}
	
	def search(){
		
		def c = Emote.createCriteria()
		
//		println "criterai created"
//		def results = c.list{
//			sqlRestriction "find{ topics:\""+params.topic+"\"}"
//			
//		}
//		println "got results ${results}"
		
		def results = Emote.findWhere("{topics : 'topic1'}")
		println "got results ${results}"

		[emotes:results]
	}
}