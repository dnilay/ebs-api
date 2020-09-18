package com.example.demo.web.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "beer_table")
public class BeerDto {
    @Id
    @Column(name = "beer_id")
    private UUID id;
    @Column(name = "beer_name")
    private String beerName;
    @Column(name = "beer_style")
    private String beerStyle;
    private Long upc;

}
