package com.xwguan.autofund.service.mapper.account;

import com.xwguan.autofund.dto.account.LatestAccountDto;
import com.xwguan.autofund.entity.account.Account;
import com.xwguan.autofund.entity.account.AssetHistory;
import com.xwguan.autofund.entity.account.TradeDetail;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:10+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
@Qualifier("delegate")
public class AccountMapperImpl_ implements AccountMapper {

    @Override
    public LatestAccountDto toLatestAccountDto(Account account) {
        if ( account == null ) {
            return null;
        }

        LatestAccountDto latestAccountDto = new LatestAccountDto();

        latestAccountDto.setId( account.getId() );
        latestAccountDto.setOwnerId( account.getOwnerId() );
        latestAccountDto.setOwnerType( account.getOwnerType() );

        return latestAccountDto;
    }

    @Override
    public AssetHistory updateAssetHistory(AssetHistory source, AssetHistory target) {
        if ( source == null ) {
            return null;
        }

        target.setAccountId( source.getAccountId() );
        target.setDate( source.getDate() );
        target.setId( source.getId() );
        target.setPosAsset( source.getPosAsset() );
        target.setPosCost( source.getPosCost() );
        target.setPosIncome( source.getPosIncome() );
        target.setPosIncomeRatePct( source.getPosIncomeRatePct() );
        target.setPosPrice( source.getPosPrice() );
        target.setPosShare( source.getPosShare() );
        target.setTotalCost( source.getTotalCost() );
        target.setTotalHistoryIncome( source.getTotalHistoryIncome() );
        target.setTotalIncome( source.getTotalIncome() );
        target.setTotalIncomeRatePct( source.getTotalIncomeRatePct() );

        return target;
    }

    @Override
    public AssetHistory updateAssetHistoryIgnoreId(AssetHistory source, AssetHistory target) {
        if ( source == null ) {
            return null;
        }

        target.setAccountId( source.getAccountId() );
        target.setDate( source.getDate() );
        target.setPosAsset( source.getPosAsset() );
        target.setPosCost( source.getPosCost() );
        target.setPosIncome( source.getPosIncome() );
        target.setPosIncomeRatePct( source.getPosIncomeRatePct() );
        target.setPosPrice( source.getPosPrice() );
        target.setPosShare( source.getPosShare() );
        target.setTotalCost( source.getTotalCost() );
        target.setTotalHistoryIncome( source.getTotalHistoryIncome() );
        target.setTotalIncome( source.getTotalIncome() );
        target.setTotalIncomeRatePct( source.getTotalIncomeRatePct() );

        return target;
    }

    @Override
    public TradeDetail updateTradeDetail(TradeDetail source, TradeDetail target) {
        if ( source == null ) {
            return null;
        }

        target.setAccountId( source.getAccountId() );
        target.setBuySum( source.getBuySum() );
        target.setDate( source.getDate() );
        target.setId( source.getId() );
        target.setSellSum( source.getSellSum() );
        target.setTradeShare( source.getTradeShare() );
        target.setTradeState( source.getTradeState() );
        target.setTradeYuan( source.getTradeYuan() );

        return target;
    }

    @Override
    public TradeDetail updateTradeDetailIgnoreId(TradeDetail source, TradeDetail target) {
        if ( source == null ) {
            return null;
        }

        target.setAccountId( source.getAccountId() );
        target.setBuySum( source.getBuySum() );
        target.setDate( source.getDate() );
        target.setSellSum( source.getSellSum() );
        target.setTradeShare( source.getTradeShare() );
        target.setTradeState( source.getTradeState() );
        target.setTradeYuan( source.getTradeYuan() );

        return target;
    }
}
