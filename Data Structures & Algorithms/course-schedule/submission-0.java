class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int[] indegree = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites){
            int source = pre[1];
            int dest = pre[0];
            indegree[dest]++;
            adjList.get(source).add(dest);
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int current = q.poll();
            count++;
            for(int nei : adjList.get(current)){
                indegree[nei]--;
                if(indegree[nei] == 0 ) q.offer(nei);
            }
        }

    return count == numCourses;
    }
}
