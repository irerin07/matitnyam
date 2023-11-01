package com.wandted.matitnyam.domain.entity;


import java.io.Serial;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author 민경수
 * @description region
 * @since 2023.11.01
 **********************************************************************************************************************/
@Getter
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "tb_region")
public class Region extends AbstractEntity{

    @Serial
    private static final long serialVersionUID = -8342810579653347986L;


    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "district", nullable = false)
    private String district;
    @Column(name = "longitude", nullable = false)
    private Float longitude;
    @Column(name = "latitude", nullable = false)
    private Float latitude;

    @Builder
    public Region(String city, String district, Float longitude, Float latitude) {
        this.city = city;
        this.district = district;
        this.longitude = longitude;
        this.latitude = latitude;
    }

}