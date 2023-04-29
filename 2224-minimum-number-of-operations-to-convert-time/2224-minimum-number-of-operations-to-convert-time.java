class Solution {
    public int convertTime(String current, String correct) {
        int currentHour = Integer.parseInt(current.substring(0, 2));
        int currentMinute = Integer.parseInt(current.substring(3));
        int correctHour = Integer.parseInt(correct.substring(0, 2));
        int correctMinute = Integer.parseInt(correct.substring(3));
        
        int diff = (correctHour * 60 + correctMinute) - (currentHour * 60 + currentMinute);
        int operations =0, reminder =0;
            
        operations = diff / 60;
        reminder = diff % 60;
        operations += reminder / 15;
        reminder = reminder % 15;
        operations += reminder / 5;
        reminder = reminder % 5;
        
        return (operations + reminder);
    }
}