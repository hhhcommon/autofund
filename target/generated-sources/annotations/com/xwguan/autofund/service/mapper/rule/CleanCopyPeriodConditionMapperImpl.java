package com.xwguan.autofund.service.mapper.rule;

import com.xwguan.autofund.entity.plan.rule.PeriodCondition;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:10+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class CleanCopyPeriodConditionMapperImpl implements CleanCopyPeriodConditionMapper {

    @Override
    public PeriodCondition cleanCopy(PeriodCondition source) {
        if ( source == null ) {
            return null;
        }

        PeriodCondition periodCondition = new PeriodCondition();

        periodCondition.setDayOfPeriod( source.getDayOfPeriod() );
        periodCondition.setPeriod( source.getPeriod() );
        periodCondition.setTacticType( source.getTacticType() );

        periodCondition.setId( Long.parseLong( "-1" ) );
        periodCondition.setTacticId( Long.parseLong( "-1" ) );

        return periodCondition;
    }
}
