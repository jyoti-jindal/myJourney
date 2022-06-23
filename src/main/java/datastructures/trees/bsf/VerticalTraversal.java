package datastructures.trees.bsf;

import datastructures.trees.Pair;
import datastructures.trees.TreeNode;

import java.util.*;

public class VerticalTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(5);
        VerticalTraversal verticalTraversal = new VerticalTraversal();
        ArrayList<ArrayList<Integer>> res = verticalTraversal.verticalOrderTraversal(root);
        for (int i = 0; i < res.size(); i++) {
            ArrayList<Integer> list = res.get(i);
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        if (A == null) {
            return null;
        }

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        Queue<Pair> que = new LinkedList<Pair>();
        que.add(new Pair(A, 0));
        int min = Integer.MAX_VALUE;
        while (!que.isEmpty()) {
            int size = que.size();

            for (int i = 0; i < size; i++) {
                Pair p = que.poll();
                TreeNode node = p.treeNode;
                int dist = p.dist;
                ArrayList<Integer> list = new ArrayList<Integer>();
                if (map.containsKey(dist)) {
                    list = map.get(dist);
                }
                list.add(node.val);
                map.put(dist, list);
                min = Math.min(min, dist);
                if (node.left != null) {
                    que.add(new Pair(node.left, dist - 1));
                }

                if (node.right != null) {
                    que.add(new Pair(node.right, dist + 1));
                }
            }

        }

        int mSize = map.size();

        while (mSize > 0) {
            res.add(map.get(min));
            min++;
            mSize--;
        }
//        Iterator itr = map.keySet().iterator();
//        while(itr.hasNext()) {
//            Integer key = (Integer) itr.next();
//            res.add(map.get(key));
//        }
        return res;
    }

    // public  void verticalOrderTraversal(TreeNode A, int level,
    //                                    HashMap<Integer, ArrayList<Integer>> map) {
    //     if(A==null) {
    //         return;
    //     }

    //     ArrayList<Integer> list = new ArrayList<Integer>();
    //     if(map.containsKey(level)) {
    //         list = map.get(level);

    //     }
    //     list.add(A.val);
    //     map.put(level, list);
    //     verticalOrderTraversal(A.left, level-1, map);
    //     verticalOrderTraversal(A.right, level+1, map);
    // }
}