package com.api.FlowOrder.models;


import com.api.FlowOrder.enums.OrderEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

//Model é a classe que representa a entidade na coluna, usa-se a notação @Entity para mapear isso com o JPA
//@Column e @Id são para identificar o item na tabela e as outras notações são as padroes do loombok
//ManyToOne e OneToMany são bem autoexplicativos, é interessante deixar claro chamando o model que ele faz ref
//@JoinColumn é pra fazer a junção das colunas na tabela do banco

@Entity
@Data
@Table(name = "Orders")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private UserModel user;

    @OneToMany
    private List<OrderItemModel> listOrders;

    @Column
    private float totalPrice;

    //@Column
    //private List<ItemModel> itemList;

    @Column
    private String shippingAdress;

    @Column
    private LocalDateTime orderTime;

    @Enumerated
    private OrderEnum orderStatus;


}
