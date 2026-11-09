package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.function.ToIntFunction;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05210 extends class05096 {
   private static final Logger N = LogUtils.getLogger();
   private static final ToIntFunction<class05946<class07299>> y = class07536.N(new Reference2IntOpenHashMap(), var0 -> {
      var0.put(class07299.field_25179, -13408734);
      var0.put(class07299.field_25180, -10075085);
      var0.put(class07299.field_25181, -8943531);
      var0.defaultReturnValue(-2236963);
   });
   private final BooleanConsumer L;
   private final class06711 u;

   private class05210(BooleanConsumer var1, DataFixer var2, class04785 var3, class05081 var4, boolean var5, class01042 var6) {
      super(class00392.N("optimizeWorld.title", var4.q().N()));
      this.L = var1;
      this.u = new class06711(var3, var2, var4, var6, var5, false);
   }

   @Nullable
   public static class05210 N(class06202 var0, BooleanConsumer var1, DataFixer var2, class04785 var3, boolean var4) {
      try {
         class01910 class01910 = var0.S();
         class01623 class01623 = class01093.N(var3);

         class05210 class05210;
         try (class03531 class03531 = class01910.N(var3.B(), false, class01623)) {
            class05081 class05081 = class03531.u();
            class01022 class01022 = class03531.L().N();
            var3.N(class01022, class05081);
            class05210 = new class05210(var1, var2, var3, class05081, var4, class01022);
         }

         return class05210;
      } catch (Exception exception) {
         N.warn("Failed to load datapacks, can't optimize world", exception);
         return null;
      }
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.method_37063(class05362.method_46430(class05220.i, var1 -> {
         this.u.N();
         this.L.accept(false);
      }).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 150, 200, 20).N());
   }

   @Override
   public void method_25393() {
      if (this.u.y()) {
         this.L.accept(true);
      }
   }

   @Override
   public void method_25432() {
      this.u.N();
      this.u.close();
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 20, -1);
      int i = this.field_22789 / 2 - 150;
      int j = this.field_22789 / 2 + 150;
      int k = this.field_22790 / 4 + 100;
      int l = k + 10;
      var1.N(this.field_22793, this.u.B(), this.field_22789 / 2, k - 9 - 2, -6250336);
      if (this.u.i() > 0) {
         var1.N(i - 1, k - 1, j + 1, l + 1, -16777216);
         var1.y(this.field_22793, class00392.N("optimizeWorld.info.converted", this.u.R()), i, 40, -6250336);
         var1.y(this.field_22793, class00392.N("optimizeWorld.info.skipped", this.u.M()), i, 40 + 9 + 3, -6250336);
         var1.y(this.field_22793, class00392.N("optimizeWorld.info.total", this.u.i()), i, 40 + 24, -6250336);
         int i1 = 0;

         for (class05946<class07299> class05946 : this.u.L()) {
            int j1 = class04995.y(this.u.N(class05946) * (j - i));
            var1.N(i + i1, k, i + i1 + j1, l, y.applyAsInt(class05946));
            i1 += j1;
         }

         int k1 = this.u.R() + this.u.M();
         class05216 class05216x = class00392.N("optimizeWorld.progress.counter", k1, this.u.i());
         class05216 class05216x = class00392.N("optimizeWorld.progress.percentage", class04995.y(this.u.u() * 100.0F));
         var1.N(this.field_22793, class05216x, this.field_22789 / 2, k + 2 * 9 + 2, -6250336);
         var1.N(this.field_22793, class05216x, this.field_22789 / 2, k + (l - k) / 2 - 4, -6250336);
      }
   }

   @Override
   public void method_25419() {
      this.L.accept(false);
   }
}
