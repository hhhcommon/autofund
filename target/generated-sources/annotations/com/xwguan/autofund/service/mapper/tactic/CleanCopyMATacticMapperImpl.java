package com.xwguan.autofund.service.mapper.tactic;

import com.xwguan.autofund.entity.plan.tactic.MATactic;
import com.xwguan.autofund.service.mapper.rule.CleanCopyPeriodConditionMapper;
import com.xwguan.autofund.service.mapper.rule.CleanCopyRuleMapper;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:11+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class CleanCopyMATacticMapperImpl implements CleanCopyMATacticMapper {

    @Autowired
    private CleanCopyRuleMapper cleanCopyRuleMapper;
    @Autowired
    private CleanCopyPeriodConditionMapper cleanCopyPeriodConditionMapper;

    @Override
    public MATactic cleanCopy(MATactic source) {
        if ( source == null ) {
            return null;
        }

        MATactic mATactic = new MATactic();

        mATactic.setPeriodCondition( cleanCopyPeriodConditionMapper.cleanCopy( source.getPeriodCondition() ) );
        mATactic.setRuleList( cleanCopyRuleMapper.cleanCopyList( source.getRuleList() ) );
        mATactic.setMa( source.getMa() );

        mATactic.setPlanId( Long.parseLong( "-1" ) );
        mATactic.setId( Long.parseLong( "-1" ) );
        mATactic.setActivated( Boolean.parseBoolean( "true" ) );

        return mATactic;
    }
}
