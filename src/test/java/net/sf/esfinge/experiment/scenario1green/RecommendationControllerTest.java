package net.sf.esfinge.experiment.scenario1green;

import net.sf.esfinge.experiment.scenario1green.controller.RecommendationController;
import net.sf.esfinge.greenframework.configuration.GreenFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecommendationControllerTest {


    private static final String RECOMMENDATION = "JBL 510BT Bluetooth Headphones received 1231 visits this month.\n Also check out HyperX Cloud Stinger Headphones!";

    @Test
    void testFindRecommendation() {
        RecommendationController recommendationController = GreenFactory.greenify(RecommendationController.class);
        String recommendation = recommendationController.findRecommendation();

        assertEquals(RECOMMENDATION, recommendation);
    }

    @Test
    void testFindRecommendationWithDifferentValue() {
        RecommendationController recommendationController = GreenFactory.greenify(RecommendationController.class);
        //Create the green configuration
        String recommendation = recommendationController.findRecommendation();

        assertEquals("", recommendation);
    }

}
