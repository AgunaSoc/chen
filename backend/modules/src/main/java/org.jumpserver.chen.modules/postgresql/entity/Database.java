package org.atherlock.chen.modules.postgresql.entity;

import lombok.Data;
import org.atherlock.chen.framework.datasource.entity.resource.ResourceNode;
import org.atherlock.chen.framework.datasource.entity.resource.TreeNode;
import org.atherlock.chen.framework.utils.TreeUtils;

@Data
public class Database implements ResourceNode {
    private String name;
    @Override
    public TreeNode toResourceNode(TreeNode parent) {
        TreeNode treeNode = new TreeNode();
        treeNode.setType("database");
        treeNode.setLabel(this.name);
        treeNode.setKey(TreeUtils.generateNodeKey(parent, treeNode.getType(), name));
        return treeNode;
    }
}
