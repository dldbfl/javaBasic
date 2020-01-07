//import java.util.ArrayList;
//
//this.n = n;
//        this.list = new ArrayList<>();
//        this.dist = dist;
//
//        if(dist[dist.length - 1] >= n) return 1;
//
//        int answer = 9;
//
//        for(int i = 0; i < weak.length; i++)
//            list.add(weak[i]);
//
//       for(int i = 0; i < weak.length; i++)
//        {
//            answer = Math.min(answer, solve());
//            list.add(list.get(0) + n);
//            list.remove(0);
//        }
//
//        if(answer == 9) answer = -1;
//        return answer;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//private int solve(){
//
//        int count = 0;
//        int index = dist.length - 1;
//        int cur = 0;
//
//        for(int i = 1; i < list.size(); i++) {
//
//            if(index < 0 || cur >= list.size()) break;
//
//            if(list.get(i) - list.get(cur) >= dist[index]) {
//
//                if(list.get(i) - list.get(cur) > dist[index]) {
//                    cur = i;
//                }
//                else {
//                    cur = i + 1;
//                    i++;
//                }
//
//                index--;
//                count++;
//            }
//
//        }
//
//        if(index < 0) return 9;
//        if(cur < list.size() && list.get(list.size() - 1) - list.get(cur) <= dist[index]) count++;
//
//        if(count > dist.length) return 9;
//
//        return count;
//
//    }