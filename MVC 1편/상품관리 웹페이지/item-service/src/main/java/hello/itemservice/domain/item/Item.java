package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data는 위험함
//@Getter @Setter를 추천 예제니까 @Data 사용
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;      //int가 아닌 Integer인 이유는 NULL 값이 들어갈수도 있어서
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
