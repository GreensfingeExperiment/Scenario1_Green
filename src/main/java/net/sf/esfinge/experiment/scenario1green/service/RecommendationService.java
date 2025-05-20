package net.sf.esfinge.experiment.scenario1green.service;

import net.sf.esfinge.experiment.scenario1green.repository.RecommendationRepository;

import java.io.IOException;

public class RecommendationService {

    private final RecommendationRepository repository = new RecommendationRepository();

    public String findRecommendation() {
        StringBuilder sb = new StringBuilder();

        try {
            repository.findProduct(sb);
            sb.append(" received ");
            repository.findVisits(sb);
            sb.append(" visits this month.");
            repository.findOtherProduct(sb);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

    public void saveConsumptionEnergy(boolean saveEnergy) {
        //Implement your logic
    }

}
