
package de.s3xy.popularmovies.api.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "adult",
        "backdrop_path",
        "genre_ids",
        "id",
        "original_language",
        "original_title",
        "overview",
        "release_date",
        "poster_path",
        "popularity",
        "title",
        "video",
        "vote_average",
        "vote_count"
})
public class Movie {

    @JsonProperty("adult")
    private Boolean adult;
    @JsonProperty("backdrop_path")
    private String backdropPath;
    @JsonProperty("genre_ids")
    private List<Integer> genreIds = new ArrayList<Integer>();
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("popularity")
    private Double popularity;
    @JsonProperty("title")
    private String title;
    @JsonProperty("video")
    private Boolean video;
    @JsonProperty("vote_average")
    private Double voteAverage;
    @JsonProperty("vote_count")
    private Integer voteCount;


    private String fullPosterPath;

    /**
     * @return The adult
     */
    @JsonProperty("adult")
    public Boolean getAdult() {
        return adult;
    }

    /**
     * @param adult The adult
     */
    @JsonProperty("adult")
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    /**
     * @return The backdropPath
     */
    @JsonProperty("backdrop_path")
    public String getBackdropPath() {
        return "https://image.tmdb.org/t/p/original" + backdropPath;
    }

    /**
     * @param backdropPath The backdrop_path
     */
    @JsonProperty("backdrop_path")
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    /**
     * @return The genreIds
     */
    @JsonProperty("genre_ids")
    public List<Integer> getGenreIds() {
        return genreIds;
    }

    /**
     * @param genreIds The genre_ids
     */
    @JsonProperty("genre_ids")
    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    /**
     * @return The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The originalLanguage
     */
    @JsonProperty("original_language")
    public String getOriginalLanguage() {
        return originalLanguage;
    }

    /**
     * @param originalLanguage The original_language
     */
    @JsonProperty("original_language")
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    /**
     * @return The originalTitle
     */
    @JsonProperty("original_title")
    public String getOriginalTitle() {
        return originalTitle;
    }

    /**
     * @param originalTitle The original_title
     */
    @JsonProperty("original_title")
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    /**
     * @return The overview
     */
    @JsonProperty("overview")
    public String getOverview() {
        return overview;
    }

    /**
     * @param overview The overview
     */
    @JsonProperty("overview")
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     * @return The releaseDate
     */
    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate The release_date
     */
    @JsonProperty("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return The posterPath
     */
    @JsonProperty("poster_path")
    public String getPosterPath() {
        return posterPath;
    }

    public String getHTTPPosterPath() {
        if (fullPosterPath == null) {
            return "https://image.tmdb.org/t/p/original" + posterPath;
        } else {
            return fullPosterPath;
        }
    }
    public void setFullPosterPath(String fullPosterPath) {
        this.fullPosterPath = fullPosterPath;
    }


    /**
     * @param posterPath The poster_path
     */
    @JsonProperty("poster_path")
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    /**
     * @return The popularity
     */
    @JsonProperty("popularity")
    public Double getPopularity() {
        return popularity;
    }

    /**
     * @param popularity The popularity
     */
    @JsonProperty("popularity")
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    /**
     * @return The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The video
     */
    @JsonProperty("video")
    public Boolean getVideo() {
        return video;
    }

    /**
     * @param video The video
     */
    @JsonProperty("video")
    public void setVideo(Boolean video) {
        this.video = video;
    }

    /**
     * @return The voteAverage
     */
    @JsonProperty("vote_average")
    public Double getVoteAverage() {
        return voteAverage;
    }

    /**
     * @param voteAverage The vote_average
     */
    @JsonProperty("vote_average")
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    /**
     * @return The voteCount
     */
    @JsonProperty("vote_count")
    public Integer getVoteCount() {
        return voteCount;
    }

    /**
     * @param voteCount The vote_count
     */
    @JsonProperty("vote_count")
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }


}