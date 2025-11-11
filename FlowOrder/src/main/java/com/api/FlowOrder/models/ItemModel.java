package com.api.FlowOrder.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//Model é a classe que representa a entidade na coluna, usa-se a notação @Entity para mapear isso com o JPA
//@Column e @Id são para identificar o item na tabela e as outras notações são as padroes do loombok

@Table(name = "Itens")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column
    private String itemName;

    @Column
    private String itemType;

    @Column
    private Double price;

    @Column
    private int stockQuant;

}