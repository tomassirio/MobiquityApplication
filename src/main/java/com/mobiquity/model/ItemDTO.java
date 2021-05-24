package com.mobiquity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
public class ItemDTO {
    private Integer id;
    private Double weight;
    private Integer value;

//    //static comparator object
//    public static Comparator<ItemDTO> valueComparator = new Comparator<>(){
//        public int compare(ItemDTO item1, ItemDTO item2){
//            return item2.value - item1.value;
//        }
//    };
}
