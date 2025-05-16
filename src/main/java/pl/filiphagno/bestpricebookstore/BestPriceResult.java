package com.mudra.bestpricebookstore;

import pl.filiphagno.bestpricebookstore.RestCallStatistics;

import java.util.List;

public record BestPriceResult(RestCallStatistics callStatistics, Book bestPriceDeal, List<Book> allDeals) {

}
