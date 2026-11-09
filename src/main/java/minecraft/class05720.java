package minecraft;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05720 extends class05096 {
   static final class01894 N = class01894.y("container/slot");
   static final Logger y = LogUtils.getLogger();
   private static final int R = 18;
   private static final int M = 20;
   private static final int B = 1;
   private static final int Z = 1;
   private static final int z = 2;
   private static final int U = 2;
   private static final class05946<class00780> E = class00795.y;
   public static final class00392 L = class00392.L("flat_world_preset.unknown");
   private final class05737 W;
   private class00392 m;
   private class00392 P;
   private class05722 s;
   private class05362 T;
   class04927 u;
   class01584 i;

   public class05720(class05737 var1) {
      super(class00392.L("createWorld.customize.presets.title"));
      this.W = var1;
   }

   @Nullable
   private static class01627 N(class02055<class00891> var0, String var1, int var2) {
      List<String> list = Splitter.on('*').limit(2).splitToList(var1);
      int ix;
      String sx;
      if (list.size() == 2) {
         sx = list.get(1);

         try {
            ix = Math.max(Integer.parseInt(list.get(0)), 0);
         } catch (NumberFormatException numberformatexception) {
            y.error("Error while parsing flat world string", numberformatexception);
            return null;
         }
      } else {
         sx = list.get(0);
         ix = 1;
      }

      int j = Math.min(var2 + ix, class07376.L);
      int k = j - var2;

      Optional optional;
      try {
         optional = var0.N(class05946.N(class04227.Z, class01894.N(sx)));
      } catch (Exception exception) {
         y.error("Error while parsing flat world string", exception);
         return null;
      }

      if (optional.isEmpty()) {
         y.error("Error while parsing flat world string => Unknown block, {}", sx);
         return null;
      } else {
         return new class01627(k, (class00891)((class03529)optional.get()).N());
      }
   }

   public void N(boolean var1) {
      this.T.field_22763 = var1 || this.u.method_1882().length() > 1;
   }

   private static List<class01627> N(class02055<class00891> var0, String var1) {
      ArrayList arraylist = Lists.newArrayList();
      String[] astring = var1.split(",");
      int ix = 0;

      for (String sx : astring) {
         class01627 class01627 = N(var0, sx, ix);
         if (class01627 == null) {
            return Collections.emptyList();
         }

         int j = class07376.L - ix;
         if (j > 0) {
            arraylist.add(class01627.N(j));
            ix += class01627.N();
         }
      }

      return arraylist;
   }

   public static class01584 N(
      class02055<class00891> var0, class02055<class00780> var1, class02055<class04412> var2, class02055<class04336> var3, String var4, class01584 var5
   ) {
      Iterator<String> iterator = Splitter.on(';').split(var4).iterator();
      if (!iterator.hasNext()) {
         return class01584.N(var1, var2, var3);
      } else {
         List<class01627> list = N(var0, iterator.next());
         if (list.isEmpty()) {
            return class01584.N(var1, var2, var3);
         } else {
            class03529 class03529 = var1.y(E);
            Object object = class03529;
            if (iterator.hasNext()) {
               String sx = iterator.next();
               object = Optional.ofNullable(class01894.L(sx)).map(var0x -> class05946.N(class04227.NA, var0x)).flatMap(var1::N).orElseGet(() -> {
                  y.warn("Invalid biome: {}", sx);
                  return class03529;
               });
            }

            return var5.N(list, var5.L(), (class03556<class00780>)object);
         }
      }
   }

   static String N(class01584 var0) {
      StringBuilder stringbuilder = new StringBuilder();

      for (int ix = 0; ix < var0.i().size(); ix++) {
         if (ix > 0) {
            stringbuilder.append(",");
         }

         stringbuilder.append(var0.i().get(ix));
      }

      stringbuilder.append(";");
      stringbuilder.append(var0.u().i().map(class05946::N).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return stringbuilder.toString();
   }

   @Override
   public void method_25426() {
      this.m = class00392.L("createWorld.customize.presets.share");
      this.P = class00392.L("createWorld.customize.presets.list");
      this.u = new class04927(this.field_22793, 50, 40, this.field_22789 - 100, 20, this.m);
      this.u.method_1880(1230);
      class01896 class01896 = this.W.y.N().U();
      class01022 class01022 = class01896.N();
      class03767 class03767 = class01896.B().y();
      class00751 class00751xx = class01022.L(class04227.NA);
      class00751 class00751x = class01022.L(class04227.yb);
      class00751 class00751xx = class01022.L(class04227.ys);
      class01921 class01921 = class01022.L(class04227.Z).N(class03767);
      this.u.method_1852(N(this.W.N()));
      this.i = this.W.N();
      this.method_25429(this.u);
      this.s = this.method_37063(new class05722(this, class01022, class03767));
      this.T = this.method_37063(class05362.method_46430(class00392.L("createWorld.customize.presets.select"), var5x -> {
         class01584 class01584 = N(class01921, class00751xx, class00751x, class00751, this.u.method_1882(), this.i);
         this.W.N(class01584);
         this.field_22787.N(this.W);
      }).N(this.field_22789 / 2 - 155, this.field_22790 - 28, 150, 20).N());
      this.method_37063(
         class05362.method_46430(class05220.i, var1x -> this.field_22787.N(this.W)).N(this.field_22789 / 2 + 5, this.field_22790 - 28, 150, 20).N()
      );
      this.N(this.s.method_25334() != null);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 8, -1);
      var1.y(this.field_22793, this.m, 51, 30, -6250336);
      var1.y(this.field_22793, this.P, 51, 68, -6250336);
      this.u.method_25394(var1, var2, var3, var4);
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.W);
   }

   @Override
   public void method_25410(int var1, int var2) {
      String sx = this.u.method_1882();
      this.method_25423(var1, var2);
      this.u.method_1852(sx);
   }

   @Override
   public boolean method_25401(double var1, double var3, double var5, double var7) {
      return this.s.method_25401(var1, var3, var5, var7);
   }
}
