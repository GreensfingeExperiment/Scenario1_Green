package net.sf.esfinge.experiment.scenario1green.repository;


import net.sf.esfinge.experiment.scenario1green.entity.Recommendation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecommendationRepository {

    private static final String FILE_PATH = "src/main/resources/fileRepository.txt";

    public void findProduct(StringBuilder sb) throws IOException {
        List<Recommendation> recommendations = readLinesFile();
        sb.append(recommendations.get(0).getProduct());
    }

    public void findVisits(StringBuilder sb) throws IOException {
        List<Recommendation> recommendations = readLinesFile();
        sb.append(recommendations.get(0).getViews());
    }

    public void findOtherProduct(StringBuilder sb) throws IOException {
        List<Recommendation> recommendations = readLinesFile();
        sb.append("\n Also check out ")
            .append(recommendations.get(0).getOtherProduct())
            .append("!");
    }

    private List<Recommendation> readLinesFile() throws IOException {
        List<Recommendation> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");
                if (fields.length == 3) {
                    list.add(new Recommendation(fields[0], fields[1], fields[2]));
                }
            }
        }
        return list;
    }

}
