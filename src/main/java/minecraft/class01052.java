package minecraft;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class class01052 extends CacheLoader<Long, List<class01076>> {
   class01052() {
      super();
   }

   public List<class01076> load(Long var1) {
      IntArrayList intarraylist = class07536.N(IntStream.range(0, 10), class06069.y(var1));
      ArrayList arraylist = Lists.newArrayList();

      for (int i = 0; i < 10; i++) {
         int j = class04995.N(42.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 10) * i)));
         int k = class04995.N(42.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 10) * i)));
         int l = intarraylist.get(i);
         int i1 = 2 + l / 3;
         int j1 = 76 + l * 3;
         boolean flag = l == 1 || l == 2;
         arraylist.add(new class01076(j, k, i1, j1, flag));
      }

      return arraylist;
   }
}
