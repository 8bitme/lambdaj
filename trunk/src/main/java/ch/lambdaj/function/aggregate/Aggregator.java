// Modified or written by Ex Machina SAGL for inclusion with lambdaj.
// Copyright (c) 2009 Mario Fusco, Luca Marrocco.
// Licensed under the Apache License, Version 2.0 (the "License")

package ch.lambdaj.function.aggregate;

/**
 * Defines an aggregation operation, i.e. how to aggregate the items of a collection.
 * @author Mario Fusco
 */
public interface Aggregator<T> {

    /**
     * Defines how this operation aggregates a list of objects
     * @param iterable The objects to be aggregated
     * @return The aggregation of the objects
     */
    T aggregate(Iterable<? extends T> iterable);
}
