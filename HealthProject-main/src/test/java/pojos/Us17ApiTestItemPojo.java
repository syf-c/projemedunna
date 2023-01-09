package pojos;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Us17ApiTestItemPojo {

    private String createdBy;
    private String createdDate;
    private String defaultValMin;
    private String defaultValMax;
    private String description;
    private String name;
    private Integer id;
    private Double price;




    public Us17ApiTestItemPojo() {
    }

    public Us17ApiTestItemPojo(String createdBy, String createdDate,String defaultValMax ,String defaultValMin, String description, Integer id,String name,Double price) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.defaultValMax = defaultValMax;
        this.defaultValMin = defaultValMin;
        this.description = description;
        this.name = name;
        this.id = id;
        this.price = price;

    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }


    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Us17ApiTestItemPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
