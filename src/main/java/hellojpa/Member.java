package hellojpa;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {

    @Id
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    private Integer age;

    //enum 타입에 ordinal 쓰면 안된다. (순서때문)
    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;



    @Lob   //String CLOB 나머지는 BLOB으로 매핑된다.
    private String description;

    
    @Transient
    private int temp;

    public Member() {
    }
}
