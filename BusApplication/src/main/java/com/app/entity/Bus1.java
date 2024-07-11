package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Bus1 {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long Id;
    
  @Enumerated(EnumType.STRING)
  private Bname bname;
 // @Column(name="starttime")
  private String starttime;
  //@Column(name="endtime")
  private String endtime;
 // @Column(name="distance")
  private Double distance;
  //@Column(name="pickup")
  private String pickup;
 // @Column(name="d")
  private String d;
  
  
}
