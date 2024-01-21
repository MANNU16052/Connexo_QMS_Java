package com.QMS.Java.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="REC_TABLE")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "your_entity_seq")
    @SequenceGenerator(name = "your_entity_seq", sequenceName = "your_entity_sequence", allocationSize = 1, initialValue = 1000)
    private Long id;
    private String Name;
    @OneToMany(targetEntity = Project.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Rec_id",referencedColumnName = "id")
    private List<Project> project;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Date_Opened")
    private Date Date_Opened;
    @PrePersist
    private void Opened(){
        Date_Opened = new Date();
    }

}
