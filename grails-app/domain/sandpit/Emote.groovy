package sandpit

import java.util.Set;

class Emote {

    static constraints = {
    }
	
	static mapping = {
		topics index:true
	}
	
	String id
	String userId
	Set<String> topics
	Set<String> expressions;
	String title
	public Emote(String userId, String [] topics, String [] expressions,
			String title) {
		super();
		this.userId = userId;
		this.topics = topics;
		this.expressions = expressions;
		this.title = title;
	}
	

	

}
