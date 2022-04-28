package com.restapi.demo.service;

import com.restapi.demo.dto.BrokerPortfolioStmtDto;
import com.restapi.demo.model.BrokerPortfolioStmt;

import java.util.List;

public interface BrokerPortfolioStmtService {

   public List<BrokerPortfolioStmtDto> allBrokerPortfolioStmt();
   public BrokerPortfolioStmtDto getBrokerPortfolioStmtsByprodaccNor(String prodaccNor);
   public BrokerPortfolioStmtDto getBrokerPortfolioStmtsByaReferenceNbr(String aReferenceNbr);
}
