package com.aya.recyclerview.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ActivityUtil {

    /**
     * 画面に表示するアイテムを30個作成して、Listで返します。
     * @return アイテム30個
     */
    public static List<String> getItemList() {
        List<String> data = new ArrayList<>();
        IntStream.rangeClosed(0, 30).forEach(i -> data.add("Item: " + i));
        return data;
    }

}
