class Solution {
    public String predictPartyVictory(String senate) {
        char[] carr = senate.toCharArray();
        Queue<Integer> rqu = new LinkedList<>();
        Queue<Integer> dqu = new LinkedList<>();


        for(int i=0; i<carr.length; i++){
            if(carr[i] == 'R') rqu.offer(i);
            else dqu.offer(i);
        }

        int offSet = carr.length;
        while(!rqu.isEmpty() && !dqu.isEmpty()){
            int r = rqu.poll(), d = dqu.poll();

            if(r < d) rqu.offer(r+offSet);
            else dqu.offer(d+offSet);
        }

        if(!rqu.isEmpty()) return "Radiant";
        else return "Dire";
    }
}