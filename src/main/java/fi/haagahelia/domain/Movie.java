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
	
	private String imdbRating;
	private String runtime;
	private String year;
	

	public Movie() {
	}
	
	public Movie(String title, int rating, String comments, String imdbRating, String runtime, String year) {
		this.title = title;
		this.rating = rating;
		this.comments = comments;
		this.imdbRating = imdbRating;
		this.runtime = runtime;
		this.year = year;
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
	
	public String getimdbRating() {
		return imdbRating;
	}
	
	public String getRuntime() {
		return runtime;
	}
	
	public String getYear() {
		return year;
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
	
	public void setimdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	
	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [Title=" + title + ", Rating=" + rating + ", Comments=" + comments + ", imdbRating=" + imdbRating + ", Runtime=" + runtime + ", Year=" + year + "]";
	}
	
	
}
