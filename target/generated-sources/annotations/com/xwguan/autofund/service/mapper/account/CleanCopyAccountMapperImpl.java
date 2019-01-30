package com.xwguan.autofund.service.mapper.account;

import com.xwguan.autofund.entity.account.Account;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:10+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class CleanCopyAccountMapperImpl implements CleanCopyAccountMapper {

    @Override
    public Account cleanCopy(Account source) {
        if ( source == null ) {
            return null;
        }

        Account account = new Account();

        account.setAssetHistoryList( emptyAssetHistoryList( source.getAssetHistoryList() ) );
        account.setOwnerType( source.getOwnerType() );
        account.setTradeDetailList( emptyTradeDetailList( source.getTradeDetailList() ) );

        account.setOwnerId( Long.parseLong( "-1" ) );
        account.setId( Long.parseLong( "-1" ) );

        return account;
    }
}
