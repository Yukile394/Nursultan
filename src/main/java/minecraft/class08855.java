package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.List;

public class class08855 implements class08889 {
   final List<class08866<class08880>> N;
   private final class02006<class08875> y = new class08873(this);

   public class08855(List<class08866<class08880>> var1) {
      super();
      this.N = var1;
   }

   @Override
   public class08887 method_65542(class00500 var1, class02028 var2) {
      class08875 class08875 = var2.N(this.y);
      return new class08885(class08875, var1);
   }

   @Override
   public void method_62326(class08350 var1) {
      this.N.forEach(var1x -> var1x.y().method_62326(var1));
   }

   @Override
   public Object method_62332(class00500 var1) {
      IntArrayList intarraylist = new IntArrayList();

      for (int i = 0; i < this.N.size(); i++) {
         if (this.N.get(i).N().test(var1)) {
            intarraylist.add(i);
         }
      }

      return new class08868(this, intarraylist);
   }
}
