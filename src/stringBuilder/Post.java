package stringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comments = new ArrayList<Comment>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Post() {
		
	}
	
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comment> getComments() {
		return this.comments;
	}
	
	public void addComments(Comment comment) {
		this.comments.add(comment);
	}
	
	public void removeComments(Comment comment) {
		this.comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + "\n");
		sb.append(this.likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(this.moment) + "\n");
		sb.append(this.content + "\n");
		sb.append("Comments:\n");
		
		for (Comment comment : this.comments) {
			sb.append(comment.getText() + "\n");
		}
		
		return sb.toString();
	}
}
