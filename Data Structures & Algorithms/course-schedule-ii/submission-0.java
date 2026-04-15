class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites){
            int prerequisite = pre[1];
            int course = pre[0];
            indegree[course]++;
            adjList.get(prerequisite).add(course);
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        int[] topo = new int[numCourses];
        int i = 0;
        while(!q.isEmpty()){
            int current = q.poll();
            topo[i] = current;
            i++;
            for(int nei : adjList.get(current)){
                indegree[nei]--;
                if(indegree[nei] == 0 ) q.offer(nei);
            }
            
        }
        if (i != numCourses) {
            return new int[0];
        }
        return topo;
    }
}
