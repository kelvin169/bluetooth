public static List<List<Integer>> traverse(TreeNode root) {
	List<List<Integer>> result = new LinkedList<>();
	Queue<TreeNode> queue = new LinkedList<>();
	queue.add(root);
	while (!queue.isEmpty()) {
		List<Integer> level = new ArrayList<>();
		
		int levelSize = queue.size();
		// Pop only levelSize elements
		for (int i = 0; i < levelSize; i++) {
			TreeNode current = queue.poll();
			level.add(current.val);
			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}
		result.add(level);
	}
	return result;
}