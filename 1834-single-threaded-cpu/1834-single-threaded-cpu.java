class Task {
    int index, enqueueTime, processingTime;
    Task(int index, int enqueueTime, int processingTime) {
        this.index = index;
        this.enqueueTime = enqueueTime;
        this.processingTime = processingTime;
    }
}

class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        if(task1.processingTime == task2.processingTime) {
            return Integer.compare(task1.index, task2.index);
        }else{
            return Integer.compare(task1.processingTime, task2.processingTime);
        }
    }
}

class Solution {
    public int[] getOrder(int[][] tasks) {
        int time = 0;
        LinkedList<Task> taskList = new LinkedList<>();
        for(int i=0; i<tasks.length; i++)
            taskList.add(new Task(i, tasks[i][0], tasks[i][1]));
            
        Collections.sort(taskList, new Comparator<>() {
            @Override
            public int compare(Task task1, Task task2) {
                return Integer.compare(task1.enqueueTime, task2.enqueueTime);
            }
        });
        
        int[] answer = new int[tasks.length];
        PriorityQueue<Task> minHeap = new PriorityQueue<>(new TaskComparator());
        int count = 0;
        while(count != tasks.length) {
            while(!taskList.isEmpty() && time >= taskList.getFirst().enqueueTime)
                minHeap.add(taskList.pollFirst());

            if(!minHeap.isEmpty()) {
                Task currentTask = minHeap.poll();
                time += currentTask.processingTime;
                answer[count++] = currentTask.index;
            }else{
                time = taskList.getFirst().enqueueTime;
                while(!taskList.isEmpty() && time >= taskList.getFirst().enqueueTime)
                    minHeap.add(taskList.pollFirst());
                continue;
            }
        }
        return answer;
    }
}
