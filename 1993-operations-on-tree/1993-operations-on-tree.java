class LockingTree {
    class Node {
        int num;
        List<Integer> children;
        int lockedBy;
        Node (int num) {
            this.num = num;
            children = new ArrayList<>();
            lockedBy = 0;
        }
    }
    private Node[] nodes;
    private int[] parent;

    public LockingTree(int[] parent) {
        int n = parent.length;
        nodes = new Node[n];
        this.parent = parent;
        for(int i=0; i<n; i++){
            if(nodes[i] == null) nodes[i] = new Node(i);
            if(i != 0 && nodes[parent[i]] == null) nodes[parent[i]] = new Node(parent[i]);
            if(i != 0) nodes[parent[i]].children.add(i);
        }
    }

    public boolean lock(int num, int user) {
        if(nodes[num].lockedBy != 0) return false;
        nodes[num].lockedBy = user;
        return true;
    }

    public boolean unlock(int num, int user) {
        if (nodes[num].lockedBy == 0 || nodes[num].lockedBy != user) return false;
        nodes[num].lockedBy = 0;
        return true;
    }

    public boolean upgrade(int num, int user) {
        boolean unlocked = nodes[num].lockedBy == 0;
        if(!unlocked) return false;

        boolean ancestorsUnlocked = traverseAncestors(num);
        if(!ancestorsUnlocked) return false;

        boolean childrenLocked = dfsChildren(nodes[num]);
        if(!childrenLocked) return false;

        lock(num, user);
        return true;
    }
    
    private boolean traverseAncestors(int num) {
        while (num != -1) {
            num = parent[num];
            if (num != -1 && nodes[num].lockedBy != 0) return false;
        }
        
        return true;
    }

    private boolean dfsChildren(Node root) {
        boolean locked = root.lockedBy != 0;
        if(locked) root.lockedBy = 0;

        for(int child: root.children){
            boolean tmp = dfsChildren(nodes[child]);
            locked = locked || tmp;
        }

        return locked;
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */