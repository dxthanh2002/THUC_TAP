import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}



class ArrayListdemo {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        // ArrayList add set remove
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
        groceryList.set(0,
                new GroceryItem("apples", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
        ////
        System.out.println("=====================================================");
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese","mustard"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        ///array.contains ( searching)
        if(groceries.contains("mustard")) {
            System.out.println("List is contain mustard");
        }
        // indexOf tìm phần tử và trả về vị trí đầu tiên
        // lastIndexOf tìm phần tử và trả về ví trí cuối
        System.out.println("first = " + groceries.indexOf("mustard"));
        System.out.println("last = " + groceries.lastIndexOf("mustard"));

        System.out.println( groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("mustard");
        System.out.println(groceries);
        //.removeAll
        System.out.println("Remove all");
        groceries.removeAll(List.of("apples", "milk", "eggs", "yogurt", "pickles", "cheese", "mustard"));
        System.out.println(groceries);

        //.retainAll
        System.out.println("retainAll");
        groceries.retainAll(List.of("pickles", "mustard", "cheese","mustard"));
        System.out.println(groceries);
        //.clear() xóa hết
        //.isEmpty() trả về true nếu RỖNG
        groceries.addAll(List.of("apples", "milk", "eggs", "yogurt", "pickles", "cheese", "mustard"));
        //.sort() sắp xếp
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);
        System.out.println("==========================");
        //Copy
        var groceryArray2 = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray2));
    }
}
