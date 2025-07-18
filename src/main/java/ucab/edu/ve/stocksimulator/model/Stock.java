package ucab.edu.ve.stocksimulator.model;


import jakarta.persistence.*;

@Entity

public class Stock{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, updatable = false)
    private Long id;
    @Column(unique=true)
    private String ticker;
    private String name;
    private String description;
    public Stock() {
    }

    public Stock(Long id, String ticker, String name, String description) {
        this.id = id;
        this.ticker = ticker;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
