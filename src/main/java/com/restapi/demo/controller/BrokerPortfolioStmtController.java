package com.restapi.demo.controller;

import com.restapi.demo.dto.BrokerPortfolioStmtDto;
import com.restapi.demo.service.BrokerPortfolioStmtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class BrokerPortfolioStmtController {

    @Autowired
    private BrokerPortfolioStmtService brokerPortfolioStmtService;

    @GetMapping(value = "/allBrokers",produces = "application/json")
    public List<BrokerPortfolioStmtDto> getAllBrokers(){
        return brokerPortfolioStmtService.allBrokerPortfolioStmt();
    }

    @GetMapping(path = "/broker/{prodaccNor}",produces = "application/json")
    public ResponseEntity<BrokerPortfolioStmtDto> getBrokerByProdaccNor(@PathVariable(value="prodaccNor") String prodaccNor){
        BrokerPortfolioStmtDto brokerPortfolioStmtDto = brokerPortfolioStmtService.getBrokerPortfolioStmtsByprodaccNor(prodaccNor);
        return ResponseEntity.ok().body(brokerPortfolioStmtDto);
    }

    @GetMapping(path = "/broker/{aReferenceNbr}",produces = "application/json")
    public ResponseEntity<BrokerPortfolioStmtDto> getBrokerByaReferenceNbr(@PathVariable(value="aReferenceNbr") String aReferenceNbr){
        BrokerPortfolioStmtDto brokerPortfolioStmtDto = brokerPortfolioStmtService.getBrokerPortfolioStmtsByaReferenceNbr(aReferenceNbr);
        return ResponseEntity.ok().body(brokerPortfolioStmtDto);
    }
}
