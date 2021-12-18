import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Movie {
    private String movieTitle;
    private double rating;
    private Date movieDate;
    private double runtime;

    public Movie(String title, Date movieDate, double rating, double runtime) {
        this.movieTitle = title;
        this.movieDate = movieDate;
        this.rating = rating;
        this.runtime = runtime;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }
   
    @Override
    public String toString() {
        return  movieTitle + '\'' +
                ", Rating=" + rating +
                ", Movie Date= " + movieDate +
                ", Runtime: " + runtime +" hours";
    }

}
