public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        StringBuilder s = new StringBuilder();

        serialize(s,root);

        System.out.print(s);

        return s.toString();
    }

    public void serialize(StringBuilder sb,TreeNode node){
        if(node==null){
            sb.append("null").append(",");
            return;
        }

        sb.append(node.val+"").append(",");

        serialize(sb,node.left);

        serialize(sb,node.right);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] array = data.split(",");

        return deserialize(array,new int[]{0});

    }
    public TreeNode deserialize(String[] arr,int[] i){
        if(i[0]>=arr.length-1)
        {
            return null;
        }
        if(arr[i[0]].equals("null")){
            i[0]++;
            return null;
        }
        int val = Integer.parseInt(arr[i[0]++]);

        TreeNode curr = new TreeNode(val);
        curr.left = deserialize(arr,i);
        curr.right = deserialize(arr,i);
        return curr;
    }
    
}
