package net.sf.esfinge.experiment.scenario1green.service;

import net.sf.esfinge.experiment.scenario1green.repository.RecommendationRepository;

public class RecommendationService {

    private final RecommendationRepository repository = new RecommendationRepository();

    public String findRecommendation() {
        String product = repository.findProduct();
        Integer views = repository.findVisits();
        String otherProduct = repository.findOtherProduct();

        return String.format("%s received %d visits this month.\n Also check out %s!", product, views, otherProduct);
    }
}
