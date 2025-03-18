package coding47;

public class SearchTree implements NodeList{
    // write code here
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {
            root = newItem;
            return true;
        }
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (root == null || item == null) {
            return false;
        }

        ListItem current = root;
        ListItem parent = null;

        // Kiểm tra xem phần tử có tồn tại không
        while (current != null) {
            int comparison = item.compareTo(current);
            if (comparison < 0) {
                parent = current;
                current = current.previous();
            } else if (comparison > 0) {
                parent = current;
                current = current.next();
            } else {
                // Nếu tìm thấy phần tử, gọi `performRemoval()` và trả về `true`
                performRemoval(current, parent);
                return true;
            }
        }

        // Nếu không tìm thấy phần tử cần xóa, trả về `false`
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        ListItem current = item;

        if (current.next() == null && current.previous() == null) { // Case 1: No children
            if (parent == null) {
                root = null;
            } else if (parent.next() == current) {
                parent.setNext(null);
            } else {
                parent.setPrevious(null);
            }
        } else if (current.next() == null) { // Case 2: Only left child
            if (parent == null) {
                root = current.previous();
            } else if (parent.next() == current) {
                parent.setNext(current.previous());
            } else {
                parent.setPrevious(current.previous());
            }
        } else if (current.previous() == null) { // Case 3: Only right child
            if (parent == null) {
                root = current.next();
            } else if (parent.next() == current) {
                parent.setNext(current.next());
            } else {
                parent.setPrevious(current.next());
            }
        } else { // Case 4: Two children
            ListItem smallest = current.next();
            ListItem smallestParent = current;
            while (smallest.previous() != null) {
                smallestParent = smallest;
                smallest = smallest.previous();
            }
            current.setValue(smallest.getValue());
            performRemoval(smallest, smallestParent);
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
