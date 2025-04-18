package net.sf.esfinge.experiment.scenario1green;

import net.sf.esfinge.experiment.scenario1green.service.RecommendationService;
import net.sf.esfinge.greenframework.configuration.GreenFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecommendationServiceTest {

    private static final String RECOMMENDATION = "JBL 510BT Bluetooth Headphones received 1231 visits this month.\n Also check out HyperX Cloud Stinger Headphones!";

    @Test
    void testFindRecommendation() {
        RecommendationService recommendationController = new RecommendationService();

        StringBuilder sb = new StringBuilder();
        recommendationController.findRecommendation(sb);

        assertEquals(RECOMMENDATION, sb.toString());
    }

    @Test
    void testFindRecommendationUsingGreenFramework() {
        RecommendationService recommendationController = GreenFactory.greenify(RecommendationService.class);
        //Create the green configuration
        StringBuilder sb = new StringBuilder();
        recommendationController.findRecommendation(sb);

        assertEquals("", sb.toString());
    }

}
