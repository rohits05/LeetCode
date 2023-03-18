class BrowserHistory {
    List<String> list;
    int curIndex, total;

    public BrowserHistory(String homepage) {
        list = new ArrayList<>();
        list.add(homepage);
        total++;
        curIndex = 0;
    }
    
    public void visit(String url) {
        if(curIndex < list.size() - 1) list.set(curIndex + 1, url);
        else list.add(url);
        curIndex++;
        total = curIndex + 1;
    }
    
    public String back(int steps) {
        curIndex = Math.max(0, curIndex - steps);
        return list.get(curIndex);
    }
    
    public String forward(int steps) {
        curIndex = Math.min(total-1, curIndex + steps);
        return list.get(curIndex);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */