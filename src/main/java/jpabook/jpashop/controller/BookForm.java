package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class BookForm {

    private Long id; // 상품 수정 위해

    @NotEmpty(message = "상품명은 필수입니다.")
    private String name;

    private int price;
    private int stockQuantity;

    private String author;
    private String isbn;
}
