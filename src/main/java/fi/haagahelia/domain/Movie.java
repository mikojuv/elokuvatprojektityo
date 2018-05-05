package fi.haagahelia.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title;
	private int rating;
	private String comments;

	public Movie() {
	}
	
	public Movie(String title, int rating, String comments) {
		this.title = title;
		this.rating = rating;
		this.comments = comments;
	}

	public Long getId() {
		return id;
	}

	
	public String getTitle() {
		return title;
	}

	public int getRating() {
		return rating;
	}

	public String getComments() {
		return comments;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Movie [Title=" + title + ", Rating=" + rating + ", Comments=" + comments + "]";
	}
	
	
}
