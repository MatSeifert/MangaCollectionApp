package matthiasseifert.de.sakuranimangacollection.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "SERIES".
 */
public class Series {

    private Long id;
    private String Name;

    public Series() {
    }

    public Series(Long id) {
        this.id = id;
    }

    public Series(Long id, String Name) {
        this.id = id;
        this.Name = Name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

}