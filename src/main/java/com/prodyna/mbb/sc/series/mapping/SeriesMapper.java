package com.prodyna.mbb.sc.series.mapping;

import com.prodyna.mbb.sc.contribution.SeriesType;
import com.prodyna.mbb.sc.series.service.SeriesDomainObject;

public interface SeriesMapper {

    SeriesDomainObject getSeries(SeriesType seriesType);
}
