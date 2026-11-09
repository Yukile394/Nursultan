package minecraft;

import Nursultan.class09174;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import java.util.List;

class class04765 implements class02723 {
   private final LoadingCache<class02480<?>, Integer> y;

   class04765(class04770 var1) {
      super();
      this.N = var1;
      this.y = CacheBuilder.newBuilder().maximumSize(256L).build(new class04768(this));
   }

   private void y(class07482 var1, int var2, int var3) {
      this.N.field_13987.method_14364(new class00479(var1.b, var2, var3));
   }

   @Override
   public class00161 N() {
      return new class09174(this.y::getUnchecked);
   }

   @Override
   public void N(class07482 var1, int var2, int var3) {
      this.y(var1, var2, var3);
   }

   @Override
   public void N(class07482 var1, class06584 var2) {
      this.N.field_13987.method_14364(new class02580(var2));
   }

   @Override
   public void N(class07482 var1, int var2, class06584 var3) {
      this.N.field_13987.method_14364(new class00496(var1.b, var1.U(), var2, var3));
   }

   @Override
   public void N(class07482 var1, List<class06584> var2, class06584 var3, int[] var4) {
      this.N.field_13987.method_14364(new class00524(var1.b, var1.U(), var2, var3));

      for (int i = 0; i < var4.length; i++) {
         this.y(var1, i, var4[i]);
      }
   }
}
