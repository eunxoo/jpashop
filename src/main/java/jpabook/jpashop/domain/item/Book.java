package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B") // single table이므로 저장할 때 db 입장에서 구분을 위해 적어둠
@Getter @Setter
public class Book extends Item {

    private String author;
    private String isbn;
}
