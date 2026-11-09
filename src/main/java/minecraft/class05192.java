package minecraft;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class class05192 extends class07978 {
   private static final int Z = 2;
   private static final int z = 32;
   private static final int U = 10;
   private static final int E = 7;

   @Nullable
   @Override
   protected class06889 M() {
      float f = this.y.method_73183().field_9229.z();
      if (this.y.method_73183().field_9229.z() < 0.3F) {
         return this.U();
      } else {
         class06889 class06889;
         if (f < 0.7F) {
            class06889 = this.E();
            if (class06889 == null) {
               class06889 = this.W();
            }
         } else {
            class06889 = this.W();
            if (class06889 == null) {
               class06889 = this.E();
            }
         }

         return class06889 == null ? this.U() : class06889;
      }
   }

   public class05192(class07475 var1, double var2) {
      super(var1, var2, 240, false);
   }

   @Nullable
   private class01296 m() {
      class04782 class04782 = (class04782)this.y.method_73183();
      List list = class01296.N(class01296.N(this.y), 2).filter(var1x -> class04782.method_19498(var1x) == 0).collect(Collectors.toList());
      return list.isEmpty() ? null : (class01296)list.get(class04782.field_9229.y(list.size()));
   }

   @Nullable
   private class06889 U() {
      return class05456.N(this.y, 10, 7);
   }

   @Nullable
   private class06889 E() {
      class04782 class04782 = (class04782)this.y.method_73183();
      class07078 class07078x = class07078.ye;
      class00734 class00734x = this.y.method_5829().M(32.0);
      Predicate predicate = this::N;
      class00734 class00734x = class00734x;
      class07078<class08041> class07078x = class07078x;
      class04782 class04782x = class04782;
      List list = this.N(class04782x, class07078x, class00734x, predicate);
      if (list.isEmpty()) {
         return null;
      } else {
         class06889 class06889 = ((class08041)list.get(this.y.method_73183().field_9229.y(list.size()))).method_73189();
         return class05456.N(this.y, 10, 7, class06889);
      }
   }

   private List N(class04782 var1, class01128 var2, class00734 var3, Predicate var4) {
      return var2 == class07078.ye
         ? var1.N(class08041.class, this.y.method_5829().M(32.0), this::N)
         : var1.method_18023(class07078.ye, this.y.method_5829().M(32.0), this::N);
   }

   private boolean N(class08041 var1) {
      return var1.N(this.y.method_73183().N());
   }

   @Nullable
   private class07209 N(class01296 var1) {
      class04782 class04782 = (class04782)this.y.method_73183();
      List list = class04782.method_19494().i(var0 -> true, var1.U(), 8, class05372.field_18488).map(class05377::M).collect(Collectors.toList());
      return list.isEmpty() ? null : (class07209)list.get(class04782.field_9229.y(list.size()));
   }

   @Nullable
   private class06889 W() {
      class01296 class01296 = this.m();
      if (class01296 == null) {
         return null;
      } else {
         class07209 class07209 = this.N(class01296);
         return class07209 == null ? null : class05456.N(this.y, 10, 7, class06889.L(class07209));
      }
   }
}
