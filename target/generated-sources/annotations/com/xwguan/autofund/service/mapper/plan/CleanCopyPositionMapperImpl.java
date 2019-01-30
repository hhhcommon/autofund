package com.xwguan.autofund.service.mapper.plan;

import com.xwguan.autofund.entity.plan.portfolio.Position;
import com.xwguan.autofund.service.mapper.account.CleanCopyAccountMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:10+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class CleanCopyPositionMapperImpl implements CleanCopyPositionMapper {

    @Autowired
    private CleanCopyAccountMapper cleanCopyAccountMapper;

    @Override
    public Position cleanCopy(Position source) {
        if ( source == null ) {
            return null;
        }

        Position position = new Position();

        position.setAccount( cleanCopyAccountMapper.cleanCopy( source.getAccount() ) );
        position.setFundId( source.getFundId() );
        position.setRefIndexId( source.getRefIndexId() );

        position.setPlanId( Long.parseLong( "-1" ) );
        position.setId( Long.parseLong( "-1" ) );

        return position;
    }

    @Override
    public List<Position> cleanCopyList(List<Position> source) {
        if ( source == null ) {
            return null;
        }

        List<Position> list = new ArrayList<Position>( source.size() );
        for ( Position position : source ) {
            list.add( cleanCopy( position ) );
        }

        return list;
    }
}
