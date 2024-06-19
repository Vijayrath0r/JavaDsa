import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int value;
    List<TreeNode> children;

    TreeNode(int value) {
        this.value = value;
        children = new ArrayList<>();
    }

    void addChild(TreeNode child) {
        children.add(child);
    }
}