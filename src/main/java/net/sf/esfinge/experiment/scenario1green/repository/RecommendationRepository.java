package net.sf.esfinge.experiment.scenario1green.repository;


import net.sf.esfinge.experiment.scenario1green.entity.Recommendation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecommendationRepository {

    private static final String FILE_PATH = "src/main/resources/fileRepository.txt";

    public void findProduct(StringBuilder sb) {
        System.out.println("Method findProduct executed");
        try {
            List<Recommendation> recommendations = readLinesFile();
            sb.append(recommendations.get(0).getProduct());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void findVisits(StringBuilder sb) {
        System.out.println("Method findVisits executed");
        try {
            List<Recommendation> recommendations = readLinesFile();
            sb.append(recommendations.get(0).getViews());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void findOtherProduct(StringBuilder sb) {
        System.out.println("Method findOtherProduct executed");
        try {
            List<Recommendation> recommendations = readLinesFile();
            sb.append(recommendations.get(0).getOtherProduct());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Recommendation> readLinesFile() throws IOException {
        List<Recommendation> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] campos = line.split(";");
                if (campos.length == 3) {
                    list.add(new Recommendation(campos[0], campos[1], campos[2]));
                }
            }
        }
        return list;
    }

}
