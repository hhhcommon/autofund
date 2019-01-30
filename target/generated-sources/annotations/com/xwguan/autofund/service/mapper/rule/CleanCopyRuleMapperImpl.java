package com.xwguan.autofund.service.mapper.rule;

import com.xwguan.autofund.entity.plan.rule.Rule;
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
public class CleanCopyRuleMapperImpl implements CleanCopyRuleMapper {

    @Autowired
    private CleanCopyRangeConditionMapper cleanCopyRangeConditionMapper;
    @Autowired
    private CleanCopyOperationMapper cleanCopyOperationMapper;
    @Autowired
    private CleanCopySuppressConditionMapper cleanCopySuppressConditionMapper;

    @Override
    public Rule cleanCopy(Rule source) {
        if ( source == null ) {
            return null;
        }

        Rule rule = new Rule();

        rule.setOperation( cleanCopyOperationMapper.cleanCopy( source.getOperation() ) );
        rule.setRangeCondition( cleanCopyRangeConditionMapper.cleanCopy( source.getRangeCondition() ) );
        rule.setSuppressCondition( cleanCopySuppressConditionMapper.cleanCopy( source.getSuppressCondition() ) );
        rule.setTacticType( source.getTacticType() );

        rule.setId( Long.parseLong( "-1" ) );
        rule.setTacticId( Long.parseLong( "-1" ) );

        return rule;
    }

    @Override
    public List<Rule> cleanCopyList(List<Rule> source) {
        if ( source == null ) {
            return null;
        }

        List<Rule> list = new ArrayList<Rule>( source.size() );
        for ( Rule rule : source ) {
            list.add( cleanCopy( rule ) );
        }

        return list;
    }
}
