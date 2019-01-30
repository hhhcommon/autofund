package com.xwguan.autofund.service.mapper.stock;

import com.xwguan.autofund.entity.stock.RealTimeMA;
import com.xwguan.autofund.entity.stock.RealTimeStockData;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-30T10:49:10+0800",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.1.0.v20150122-0735, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class RealTimeMAMapperImpl implements RealTimeMAMapper {

    @Override
    public RealTimeMA toRealTimeMA(RealTimeStockData realTimeStockData) {
        if ( realTimeStockData == null ) {
            return null;
        }

        RealTimeMA realTimeMA = new RealTimeMA();

        realTimeMA.setDate( realTimeStockData.getDate() );
        realTimeMA.setStockId( realTimeStockData.getStockId() );
        realTimeMA.setSymbol( realTimeStockData.getSymbol() );
        realTimeMA.setTime( realTimeStockData.getTime() );

        return realTimeMA;
    }
}
