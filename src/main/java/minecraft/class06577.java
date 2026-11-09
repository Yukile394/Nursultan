package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public abstract class class06577 extends class06581 {
   public static final Predicate<class06584> L = var0 -> var0.N(class01226.yb);
   public static final Predicate<class06584> m = L.or(var0 -> var0.N(class06570.GJ));

   public Predicate<class06584> L() {
      return this.N();
   }

   public class06577(class06573 var1) {
      super(var1);
   }

   protected int i(class06584 var1) {
      return 1;
   }

   public abstract int y();

   protected static List<class06584> N(class06584 var0, class06584 var1, class07438 var2) {
      if (var1.R()) {
         return List.of();
      } else {
         int i = var2.method_73183() instanceof class04782 class04782 ? class07323.N(class04782, var0, var2, 1) : 1;
         ArrayList arraylist = new ArrayList(i);
         class06584 class06584 = var1.t();

         for (int j = 0; j < i; j++) {
            class06584 class06584x = N(var0, j == 0 ? var1 : class06584, var2, j > 0);
            if (!class06584x.R()) {
               arraylist.add(class06584x);
            }
         }

         return arraylist;
      }
   }

   protected static class06584 N(class06584 var0, class06584 var1, class07438 var2, boolean var3) {
      int i = !var3 && !var2.method_56992() && var2.method_73183() instanceof class04782 class04782 ? class07323.N(class04782, var0, var1, 1) : 0;
      if (i > var1.c()) {
         return class06584.E;
      } else if (i == 0) {
         class06584 class06584 = var1.L(1);
         class06584.N(class02484.l, class06244.field_17274);
         return class06584;
      } else {
         class06584 class06584x = var1.N(i);
         if (var1.R() && var2 instanceof class08036 class08036) {
            class08036.method_31548().Z(var1);
         }

         return class06584x;
      }
   }

   protected abstract void N(class07438 var1, class08005 var2, int var3, float var4, float var5, float var6, @Nullable class07438 var7);

   public static class06584 N(class07438 var0, Predicate<class06584> var1) {
      if (var1.test(var0.method_5998(class07050.field_5810))) {
         return var0.method_5998(class07050.field_5810);
      } else {
         return var1.test(var0.method_5998(class07050.field_5808)) ? var0.method_5998(class07050.field_5808) : class06584.E;
      }
   }

   protected void N(
      class04782 var1,
      class07438 var2,
      class07050 var3,
      class06584 var4,
      List<class06584> var5,
      float var6,
      float var7,
      boolean var8,
      @Nullable class07438 var9
   ) {
      float f = class07323.N(var1, var4, var2, 0.0F);
      float f1 = var5.size() == 1 ? 0.0F : 2.0F * f / (var5.size() - 1);
      float f2 = (var5.size() - 1) % 2 * f1 / 2.0F;
      float f3 = 1.0F;

      for (int i = 0; i < var5.size(); i++) {
         class06584 class06584 = (class06584)var5.get(i);
         if (!class06584.R()) {
            float f4 = f2 + f3 * ((i + 1) / 2) * f1;
            f3 = -f3;
            int j = i;
            class08005.N(this.N(var1, var2, var4, class06584, var8), var1, class06584, var7x -> this.N(var2, var7x, j, var6, var7, f4, var9));
            var4.N(this.i(class06584), var2, var3.N());
            if (var4.R()) {
               break;
            }
         }
      }
   }

   public abstract Predicate<class06584> N();

   public class08005 N(class07299 var1, class07438 var2, class06584 var3, class06584 var4, boolean var5) {
      class08007 class08007 = (var4.B() instanceof class06927 class06927 ? class06927 : (class06927)class06570.sD).N(var1, var4, var2, var3);
      if (var5) {
         class08007.y(true);
      }

      return class08007;
   }
}
