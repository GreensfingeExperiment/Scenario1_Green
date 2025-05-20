package net.sf.esfinge.experiment.scenario1green;

import net.sf.esfinge.experiment.scenario1green.service.RecommendationService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecommendationServiceTest {

    private static final String RECOMMENDATION = "Tenis Casual received 106 visits this month.\n Also check out Mochila Executiva!";
    private static final String SAVE_ENERGY_RECOMMENDATION = "Tenis Casual received 106 visits this month.";

    @Test
    void testFindRecommendation() {
        RecommendationService recommendationService = new RecommendationService();

        String recommendation = recommendationService.findRecommendation();

        assertEquals(RECOMMENDATION, recommendation);
    }

    @Test
    void testFindRecommendationUsingGreenFramework() {
        RecommendationService recommendationService = new RecommendationService();

        recommendationService.saveConsumptionEnergy(true);
        String recommendation = recommendationService.findRecommendation();

        assertEquals(SAVE_ENERGY_RECOMMENDATION, recommendation);
    }

}
