package app.afg.movies;


public class MovieModelClass {
    private String id;
    private String name;
    private String image;

    public MovieModelClass(String id , String name , String image){
        this.id=id;
        this.name=name;
        this.image=image;
    }
    public MovieModelClass(){}



    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
