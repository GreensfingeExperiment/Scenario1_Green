package net.sf.esfinge.experiment.scenario1green.entity;

public class Recommendation {

    private String product;
    private Integer views;
    private String otherProduct;

    public Recommendation(String product, String view, String otherProduct) {
        this.product = product;
        this.views = Integer.valueOf(view);
        this.otherProduct = otherProduct;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getOtherProduct() {
        return otherProduct;
    }

    public void setOtherProduct(String otherProduct) {
        this.otherProduct = otherProduct;
    }
}
