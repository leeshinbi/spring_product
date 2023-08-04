package com.springboot.jpa.data.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "name")
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number; //상품 번호

    @Column(nullable = false)
    private String name; // 상품 이름

    @Column(nullable = false)
    private Integer price; // 상품 가격

    @Column(nullable = false)
    private Integer stock; // 상품 재고

    private LocalDateTime createdAt; //상품 생성 일자

    private LocalDateTime updatedAt; // 상품 정보 변경 일자




}
