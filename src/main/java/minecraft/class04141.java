package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class04141 implements class03439 {
   private static final int N = 170;
   private final class00392 y;
   @Nullable
   private List<class01028> L;
   @Nullable
   private class07018 u;
   @Nullable
   private final class00392 i;

   public class04141(class00392 var1, @Nullable class00392 var2) {
      super();
      this.y = var1;
      this.i = var2;
   }

   public List<class01028> N(class06202 var1) {
      class07018 class07018 = class07018.y();
      if (this.L == null || class07018 != this.u) {
         this.L = N(var1, this.y);
         this.u = class07018;
      }

      return this.L;
   }

   public static List<class01028> N(class06202 var0, class00392 var1) {
      return ((class01590)var0.i_3).L(var1, 170);
   }

   public static class04141 N(class00392 var0) {
      return new class04141(var0, var0);
   }

   public static class04141 N(class00392 var0, @Nullable class00392 var1) {
      return new class04141(var0, var1);
   }

   @Override
   public void method_37020(class03428 var1) {
      if (this.i != null) {
         var1.N(class03457.field_33790, this.i);
      }
   }
}
