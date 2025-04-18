package net.sf.esfinge.experiment.scenario1green.service;

public class RecommendationService {

    public void findRecommendation(StringBuilder sb) {
        sb.append(findProduct())
                .append(" received ")
                .append(findVisits())
                .append(" visits this month.\n Also check out ")
                .append(findOtherProduct())
                .append("!");
    }

    private String findProduct() {
        return "JBL 510BT Bluetooth Headphones";
    }

    public Integer findVisits() {
        return 1231;
    }

    public String findOtherProduct() {
        return "HyperX Cloud Stinger Headphones";
    }
}
