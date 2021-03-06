package dafe.springframework.beerservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    @Id
    @GeneratedValue(generator="UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, columnDefinition = "varchar", nullable = false, updatable = false)
    private UUID id;
    private Long version;
    private String beerName;
    private String beerStyle;

    @Column(unique = true)
    private Long upc;
    private BigDecimal price;
    private Integer minOnHand;
    private Integer quantityToBrew;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    @UpdateTimestamp
    private  Timestamp lastModifiedDate;
}
