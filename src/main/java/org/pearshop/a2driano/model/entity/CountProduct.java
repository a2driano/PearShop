package org.pearshop.a2driano.model.entity;

import javax.persistence.*;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 06.05.2016
 */
@Entity
@Table(name = "countproduct")
@NamedQueries({
        @NamedQuery(name = "GetAllCountProduct", query = "SELECT a FROM CountProduct a"),
        @NamedQuery(name = "GetCountProductById", query = "SELECT a FROM CountProduct a WHERE a.id=:id")
})
public class CountProduct {
    @Id
    @Column(name = "count_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "count", nullable = false)
    private Integer count;

    @Column(name = "sumcount", nullable = false)
    private Double sumCount;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private UserOrder userOrder;

    public Double getSumCount() {
        return sumCount;
    }

    public void setSumCount(Double sumCount) {
        this.sumCount = sumCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public UserOrder getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(UserOrder userOrder) {
        this.userOrder = userOrder;

    }


}
