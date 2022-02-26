package model;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class AlienModel {
    @Id
    private int id ;
    private String aname ;

    @Override
    public String toString() {
        return "AlienModel{" +
                "id=" + id +
                ", aname='" + aname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
}
