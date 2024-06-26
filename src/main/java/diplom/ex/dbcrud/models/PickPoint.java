package diplom.ex.dbcrud.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@Table(name="pick_point")
public class PickPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "pickPoint")
    private List<Order> order=new ArrayList<>();
    public PickPoint(){}
    public PickPoint(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String toString(){
        return String.format(
                "PickPoint[id="+id+", name="+name+", address="+address+"]"
        );
    }
}
