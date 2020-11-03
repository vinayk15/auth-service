package com.sapient.bootcamp.authservice.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Data
public class Product {

	@Id
    String id;
    String prodName;
    String prodDesc;
    Double prodPrice;
    String prodImage;
    
}
