public class Java_20260820_composite_MenuTestDrive {

    public static void main(String[] args) {

        Java_20260820_composite_MenuComponent pancakeHouseMenu =
                new Java_20260820_composite_Menu(
                        "PANCAKE HOUSE MENU",
                        "Breakfast"
                );

        Java_20260820_composite_MenuComponent dinerMenu =
                new Java_20260820_composite_Menu(
                        "DINER MENU",
                        "Lunch"
                );

        Java_20260820_composite_MenuComponent cafeMenu =
                new Java_20260820_composite_Menu(
                        "CAFE MENU",
                        "Dinner"
                );

        Java_20260820_composite_MenuComponent dessertMenu =
                new Java_20260820_composite_Menu(
                        "DESSERT MENU",
                        "Dessert of course!"
                );

        Java_20260820_composite_MenuComponent allMenus =
                new Java_20260820_composite_Menu(
                        "ALL MENUS",
                        "All menus combined"
                );

        //---------------------------------------------------

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //---------------------------------------------------

        pancakeHouseMenu.add(
                new Java_20260820_composite_MenuItem(
                        "K&B's Pancake Breakfast",
                        "Pancakes with scrambled eggs",
                        true,
                        2.99
                )
        );

        pancakeHouseMenu.add(
                new Java_20260820_composite_MenuItem(
                        "Regular Pancake Breakfast",
                        "Pancakes with fried eggs",
                        false,
                        2.99
                )
        );

        //---------------------------------------------------

        dinerMenu.add(
                new Java_20260820_composite_MenuItem(
                        "Vegetarian BLT",
                        "(Fakin') Bacon with lettuce & tomato",
                        true,
                        2.99
                )
        );

        dinerMenu.add(
                new Java_20260820_composite_MenuItem(
                        "BLT",
                        "Bacon with lettuce & tomato",
                        false,
                        2.99
                )
        );

        //---------------------------------------------------

        cafeMenu.add(
                new Java_20260820_composite_MenuItem(
                        "Veggie Burger and Air Fries",
                        "Veggie burger on a wheat bun",
                        true,
                        3.99
                )
        );

        cafeMenu.add(
                new Java_20260820_composite_MenuItem(
                        "Soup of the day",
                        "Soup of the day, with a side salad",
                        false,
                        3.69
                )
        );

        //---------------------------------------------------

        cafeMenu.add(dessertMenu);

        dessertMenu.add(
                new Java_20260820_composite_MenuItem(
                        "Apple Pie",
                        "Apple pie with a flaky crust",
                        true,
                        1.59
                )
        );

        //---------------------------------------------------

        Java_20260820_composite_Waitress waitress =
                new Java_20260820_composite_Waitress(allMenus);

        waitress.printMenu();
    }
}

