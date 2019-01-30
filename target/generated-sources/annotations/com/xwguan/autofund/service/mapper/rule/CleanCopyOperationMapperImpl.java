package com.xwguan.autofund.service.mapper.rule;

import com.xwguan.autofund.entity.plan.rule.Operation;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:11+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class CleanCopyOperationMapperImpl implements CleanCopyOperationMapper {

    @Override
    public Operation cleanCopy(Operation source) {
        if ( source == null ) {
            return null;
        }

        Operation operation = new Operation();

        operation.setTradeValue( source.getTradeValue() );
        operation.setUnit( source.getUnit() );

        operation.setRuleId( Long.parseLong( "-1" ) );
        operation.setId( Long.parseLong( "-1" ) );

        return operation;
    }
}
