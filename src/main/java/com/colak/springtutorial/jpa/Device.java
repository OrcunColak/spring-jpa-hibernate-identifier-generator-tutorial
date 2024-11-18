package com.colak.springtutorial.jpa;

import com.colak.springtutorial.customidgenerator.UsrId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "devices")

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Device {

    @Id
    @UsrId
    private String id;

    @Column(name = "name")
    private String name;


}
