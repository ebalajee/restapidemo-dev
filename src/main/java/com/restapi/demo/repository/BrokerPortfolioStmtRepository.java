package com.restapi.demo.repository;

import com.restapi.demo.model.BrokerPortfolioStmt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrokerPortfolioStmtRepository extends JpaRepository<BrokerPortfolioStmt, String> {

    @Query(value = "SELECT * FROM broker_portfolio_stmt",nativeQuery = true)
    List<BrokerPortfolioStmt>  findAllBrokers();

    @Query(value = "SELECT * FROM broker_portfolio_stmt WHERE Prodacc_Nor=:prodaccNor",nativeQuery = true)
    BrokerPortfolioStmt findBrokerByprodaccNor(@Param("prodaccNor") String prodaccNor);

    @Query(value = "SELECT * FROM broker_portfolio_stmt WHERE A_Reference_Nbr=:aReferenceNbr",nativeQuery = true)
    BrokerPortfolioStmt findBrokerByaReferenceNbr(@Param("aReferenceNbr") String aReferenceNbr);
}