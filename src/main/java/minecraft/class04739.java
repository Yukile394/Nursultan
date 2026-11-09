package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04739 extends class05407 {
   static final Logger N = LogUtils.getLogger();
   static final class01894 y = class01894.y("widget/slot_frame");
   private static final class00392 Z = class00392.L("mco.template.button.select");
   private static final class00392 z = class00392.L("mco.template.button.trailer");
   private static final class00392 U = class00392.L("mco.template.button.publisher");
   private static final int E = 100;
   final class03686 L = new class03686(this);
   final Consumer<class04982> u;
   class04715 i;
   private final class04969 W;
   private final List<class00392> m;
   private class05362 P;
   private class05362 s;
   private class05362 T;
   @Nullable
   class04982 R = null;
   @Nullable
   String M;
   @Nullable
   List<class04613> B;

   private void L() {
      if (this.R != null && !this.R.M().isBlank()) {
         class01321.N(this, this.R.M());
      }
   }

   public class04739(class00392 var1, Consumer<class04982> var2, class04969 var3, @Nullable class05434 var4, List<class00392> var5) {
      super(var1);
      this.u = var2;
      this.W = var3;
      if (var4 == null) {
         this.i = new class04715(this);
         this.N(new class05434(10));
      } else {
         this.i = new class04715(this, Lists.newArrayList(var4.y()));
         this.N(var4);
      }

      this.m = var5;
   }

   public class04739(class00392 var1, Consumer<class04982> var2, class04969 var3, @Nullable class05434 var4) {
      this(var1, var2, var3, var4, List.of());
   }

   private void u() {
      if (this.R != null && !this.R.i().isBlank()) {
         class01321.N(this, this.R.i());
      }
   }

   private void y() {
      if (this.R != null) {
         this.u.accept(this.R);
      }
   }

   private void N(class05434 var1) {
      new class04727(this, "realms-template-fetcher", var1).start();
   }

   Either<class05434, Exception> N(class05434 var1, class05111 var2) {
      try {
         return Either.left(var2.N(var1.L() + 1, var1.u(), this.W));
      } catch (class05097 class05097) {
         return Either.right(class05097);
      }
   }

   private void N(class01054 var1, int var2, int var3, List<class04613> var4) {
      for (int ix = 0; ix < var4.size(); ix++) {
         class04613 class04613 = (class04613)var4.get(ix);
         int j = N(4 + ix);
         int k = class04613.N.stream().mapToInt(var1x -> this.field_22793.y(var1x.N())).sum();
         int l = this.field_22789 / 2 - k / 2;

         for (class04638 class04638 : class04613.N) {
            int i1 = class04638.y() ? -13408581 : -1;
            String sx = class04638.N();
            var1.y(this.field_22793, sx, l, j, i1);
            int j1 = l + this.field_22793.y(sx);
            if (class04638.y() && var2 > l && var2 < j1 && var3 > j - 3 && var3 < j + 8) {
               var1.N(class00392.y(class04638.L()), var2, var3);
               this.M = class04638.L();
            }

            l = j1;
         }
      }
   }

   void N() {
      this.T.field_22764 = this.R != null && !this.R.i().isEmpty();
      this.s.field_22764 = this.R != null && !this.R.M().isEmpty();
      this.P.field_22763 = this.R != null;
   }

   @Override
   public void method_25426() {
      this.L.y(33 + this.m.size() * 13);
      class01885 class01885x = this.L.N(class01885.u().N(4));
      class01885x.L().y();
      class01885x.N(new class02071(this.field_22785, this.field_22793));
      this.m.forEach(var2x -> class01885x.N(new class02071(var2x, this.field_22793)));
      this.i = this.L.L(new class04715(this, this.i.L()));
      class01885 class01885x = this.L.y(class01885.i().N(8));
      class01885x.L().y();
      this.s = class01885x.N(class05362.method_46430(z, var1x -> this.L()).N(100).N());
      this.P = class01885x.N(class05362.method_46430(Z, var1x -> this.y()).N(100).N());
      class01885x.N(class05362.method_46430(class05220.i, var1x -> this.method_25419()).N(100).N());
      this.T = class01885x.N(class05362.method_46430(U, var1x -> this.u()).N(100).N());
      this.N();
      this.L.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.i.method_57712(this.field_22789, this.L);
      this.L.N();
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.M = null;
      if (this.B != null) {
         this.N(var1, var2, var3, this.B);
      }
   }

   @Override
   public void method_25419() {
      this.u.accept(null);
   }

   @Override
   public class00392 method_25435() {
      ArrayList arraylist = Lists.newArrayListWithCapacity(2);
      arraylist.add(this.field_22785);
      arraylist.addAll(this.m);
      return class05220.N(arraylist);
   }
}
