package net.sf.esfinge.experiment.scenario1green.controller;

import net.sf.esfinge.experiment.scenario1green.service.RecommendationService;

public class RecommendationController {

    //Add the green annotation configuration
    private final RecommendationService service = new RecommendationService();

    public String findRecommendation() {
        return service.findRecommendation();
    }

}
