/*1,2,3 user input 4
lru became 2,3,4*/

import java.util.LinkedHashSet;


public class LRUCache {

   int maxSize;

  private final LinkedHashSet<Integer> list;

  public LRUCache(int size){
      this.maxSize = size;
      this.list = new LinkedHashSet<>();
  }

  public void faultHandle( int n){

      list.remove(n);

       if(list.size() == maxSize){

           int first = list.iterator().next();
           list.remove(first);
           list.add(n);
       }
      list.add(n);

  }

}
