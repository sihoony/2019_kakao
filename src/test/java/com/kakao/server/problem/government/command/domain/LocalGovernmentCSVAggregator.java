package com.kakao.server.problem.government.command.domain;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

public class LocalGovernmentCSVAggregator implements ArgumentsAggregator {

    @Override
    public Object aggregateArguments(ArgumentsAccessor accessor, ParameterContext context) throws ArgumentsAggregationException {
        return new LocalGovernmentCSV(accessor.getString(0), accessor.getString(1),accessor.getString(2), accessor.getString(3), accessor.getString(4), accessor.getString(5), accessor.getString(6), accessor.getString(7), accessor.getString(8));
    }
}