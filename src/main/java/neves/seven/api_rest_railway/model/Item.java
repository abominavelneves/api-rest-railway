package neves.seven.api_rest_railway.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Item {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String icon;
    private String description;
    
    public long getId(){
        return id;
    }
    public String getIcon(){
        return icon;
    }
    public String getDescription(){
        return description;
    }
}
