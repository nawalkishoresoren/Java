class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) 
    {
        unordered_map<int,int>umap;
        for(auto num:nums)
        {
            umap[num]++;
        }
        priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>>pq;

        for(auto pair_p:umap)
        {
            pq.push({pair_p.second,pair_p.first});

            if(pq.size()>k)
                pq.pop();
        }

        vector<int>ans;

        while(!pq.empty())
        {
            ans.push_back(pq.top().second);
            pq.pop();
        }
        return ans;
    }
};