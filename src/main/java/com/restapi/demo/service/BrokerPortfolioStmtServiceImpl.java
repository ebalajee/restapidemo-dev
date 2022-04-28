package com.restapi.demo.service;

import com.restapi.demo.dto.BrokerPortfolioStmtDto;
import com.restapi.demo.model.BrokerPortfolioStmt;
import com.restapi.demo.repository.BrokerPortfolioStmtRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class BrokerPortfolioStmtServiceImpl implements BrokerPortfolioStmtService{

    @Autowired
    private BrokerPortfolioStmtRepository brokerPortfolioStmtRepository;

    @Override
    public List<BrokerPortfolioStmtDto> allBrokerPortfolioStmt() {
        ModelMapper modelMapper = new ModelMapper();
        List<BrokerPortfolioStmt> brokerPortfolioStmtList = brokerPortfolioStmtRepository.findAllBrokers();
        Type brokerPortfolioStmtDtoType = new TypeToken<List<BrokerPortfolioStmtDto>>(){}.getType();
        return modelMapper.map(brokerPortfolioStmtList,brokerPortfolioStmtDtoType);
    }

    @Override
    public BrokerPortfolioStmtDto getBrokerPortfolioStmtsByprodaccNor(String prodaccNor) {
        ModelMapper modelMapper = new ModelMapper();
        BrokerPortfolioStmt brokerPortfolioStmt = brokerPortfolioStmtRepository.findBrokerByprodaccNor(prodaccNor);
        return modelMapper.map(brokerPortfolioStmt, BrokerPortfolioStmtDto.class);
    }

    @Override
    public BrokerPortfolioStmtDto getBrokerPortfolioStmtsByaReferenceNbr(String aReferenceNbr) {
        ModelMapper modelMapper = new ModelMapper();
        BrokerPortfolioStmt brokerPortfolioStmt = brokerPortfolioStmtRepository.findBrokerByaReferenceNbr(aReferenceNbr);
        return modelMapper.map(brokerPortfolioStmt, BrokerPortfolioStmtDto.class);
    }

}
