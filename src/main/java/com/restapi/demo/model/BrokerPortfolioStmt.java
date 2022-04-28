package com.restapi.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "broker_portfolio_stmt")
public class BrokerPortfolioStmt {
    @Id
    @Column(name = "Prodacc_Nor", nullable = false, length = 8)
    private String prodaccNor;

    @Column(name = "A_Reference_Nbr", nullable = false, length = 70)
    private String aReferenceNbr;

    @Column(name = "Portfolio_Broker_Start_date", nullable = false)
    private LocalDate portfolioBrokerStartDate;

    @Column(name = "Portfolio_Broker_End_Date")
    private LocalDate portfolioBrokerEndDate;

    @Column(name = "Maturity_date")
    private LocalDate maturityDate;

    @Column(name = "Fraction_Code")
    private Long fractionCode;

    @Column(name = "Total_Annual_Premium", precision = 15, scale = 2)
    private BigDecimal totalAnnualPremium;

    @Column(name = "Annual_Commision", precision = 15, scale = 2)
    private BigDecimal annualCommision;

    @Column(name = "Net_Premium", precision = 15, scale = 2)
    private BigDecimal netPremium;

    @Column(name = "Expenses", precision = 15, scale = 2)
    private BigDecimal expenses;

    @Column(name = "Costs", precision = 15, scale = 2)
    private BigDecimal costs;

    @Column(name = "Agreement_Status")
    private Long agreementStatus;

    @Column(name = "Product_Name_Level_1", length = 20)
    private String productNameLevel1;

    @Column(name = "Product_Name_Level_2", length = 20)
    private String productNameLevel2;

    @Column(name = "Product_name_Level_3", length = 20)
    private String productNameLevel3;

    @Column(name = "TB2_Branch")
    private Long tb2Branch;

    @Column(name = "First_Name", length = 151)
    private String firstName;

    @Column(name = "Last_Name", length = 151)
    private String lastName;

    @Column(name = "Name_Prefix_Txt", length = 151)
    private String namePrefixTxt;

    @Column(name = "Org_Name", length = 151)
    private String orgName;

    @Column(name = "Street_Name", length = 110)
    private String streetName;

    @Column(name = "Street_House_Nbr", length = 31)
    private String streetHouseNbr;

    @Column(name = "Street_House_Box_Nbr", length = 10)
    private String streetHouseBoxNbr;

    @Column(name = "Postal_Code", length = 10)
    private String postalCode;

    @Column(name = "City_Name", length = 50)
    private String cityName;

    @Column(name = "Policy_Holder_Language")
    private Long policyHolderLanguage;

    @Column(name = "collection_Code")
    private Character collectionCode;

    @Column(name = "Ligitation_Code")
    private Character ligitationCode;

    @Column(name = "Private_Corporate_Code")
    private Character privateCorporateCode;

    @Column(name = "Account_Close_Date")
    private LocalDate accountCloseDate;

    @Column(name = "Account_Open_Date")
    private LocalDate accountOpenDate;

    @Column(name = "Amendment_date")
    private LocalDate amendmentDate;

    @Column(name = "Amendment_nor")
    private Integer amendmentNor;

    @Column(name = "Fleet_Nor", precision = 12)
    private BigDecimal fleetNor;

    @Column(name = "Account_Nor", nullable = false, precision = 12)
    private BigDecimal accountNor;

    @Column(name = "Account_Nor_Modifier", nullable = false)
    private Long accountNorModifier;

    @Column(name = "RllBck_Flg", nullable = false)
    private Character rllbckFlg;

    @Column(name = "RllBck_RunId", nullable = false)
    private Integer rllbckRunid;

}