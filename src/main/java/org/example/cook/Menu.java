package org.example.cook;

import javax.xml.namespace.QName;
import java.util.List;

public class Menu { // 메뉴판안의 음식들 정보
    private final List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) { // 여러개의 메뉴들을 가짐
        this.menuItems = menuItems;
    }

    public MenuItem choose(String name) {
        return  this.menuItems.stream()
                .filter(menuItem -> menuItem.matches(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 메뉴 이름입니다."));
    }
}
