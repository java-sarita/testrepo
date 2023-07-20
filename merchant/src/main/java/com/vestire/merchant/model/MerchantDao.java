package com.vestire.merchant.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MerchantDao {
    @Id
    private int id;
    private String name;
    private String mobileNo;
    private String address;

}
