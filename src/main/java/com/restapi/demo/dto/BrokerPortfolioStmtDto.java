package com.restapi.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class BrokerPortfolioStmtDto implements Serializable {
    private String prodaccNor;
    private String aReferenceNbr;
    private LocalDate portfolioBrokerStartDate;
    private LocalDate portfolioBrokerEndDate;
    private LocalDate maturityDate;
    private Long fractionCode;
    private BigDecimal totalAnnualPremium;
    private BigDecimal annualCommision;
    private BigDecimal netPremium;
    private BigDecimal expenses;
    private BigDecimal costs;
    private Long agreementStatus;
    private String productNameLevel1;
    private String productNameLevel2;
    private String productNameLevel3;
    private Long tb2Branch;
    private String firstName;
    private String lastName;
    private String namePrefixTxt;
    private String orgName;
    private String streetName;
    private String streetHouseNbr;
    private String streetHouseBoxNbr;
    private String postalCode;
    private String cityName;
    private Long policyHolderLanguage;
    private Character collectionCode;
    private Character ligitationCode;
    private Character privateCorporateCode;
    private LocalDate accountCloseDate;
    private LocalDate accountOpenDate;
    private LocalDate amendmentDate;
    private Integer amendmentNor;
    private BigDecimal fleetNor;
    private BigDecimal accountNor;
    private Long accountNorModifier;
    private Character rllbckFlg;
    private Integer rllbckRunid;
}
