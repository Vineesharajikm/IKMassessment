package com.ikm.assessment.contract;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyTaxDTo {
    

   private String fullname ;
   private String propertyAddress;
   private String mobile;
   private Date dateOfBirth;
    
}
