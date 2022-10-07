class MyCalendarThree {
public:
    MyCalendarThree() { }

    int book(int start, int end){
        lines[start]++;
        lines[end]--;
        int mx = 0, cnt = 0;
        for(auto x: lines){
            cnt += x.second;
            mx = max(mx, cnt);
        }
        return mx;
    }
    
private:
    map<int, int> lines;
};

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree* obj = new MyCalendarThree();
 * int param_1 = obj->book(start,end);
 */