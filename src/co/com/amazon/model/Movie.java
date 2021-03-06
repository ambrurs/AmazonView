/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.amazon.model;

/**
 *
 * @author marulandaaf
 */
public class Movie {
    
    private int id;
    private String title;
    private String genere;
    private String creator;
    private int duration;
    private short year;
    private boolean viwed;
    private int timeViewed;

    public Movie(String title, String genere, short year) {
        this.title = title;
        this.genere = genere;
        this.year = year;
    }

    public Movie(String title, String genere, String creator, int duration, short year) {
        this.title = title;
        this.genere = genere;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
    }
    
    public void showData(){
        System.out.println("Title:"+title);
        System.out.println("Genere:"+genere);
        System.out.println("Year:"+year);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public boolean isViwed() {
        return viwed;
    }

    public void setViwed(boolean viwed) {
        this.viwed = viwed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }
    
    
    
    
}
