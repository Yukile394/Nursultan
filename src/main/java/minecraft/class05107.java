package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05107 extends class05407 {
   private static final class01894 N = class01894.y("widget/slot_frame");
   private static final Logger y = LogUtils.getLogger();
   private static final int L = 80;
   private final class05096 u;
   @Nullable
   private class04981 i;
   private final long R;
   private final class00392[] M = new class00392[]{class00392.L("mco.brokenworld.message.line1"), class00392.L("mco.brokenworld.message.line2")};
   private int B;
   private final List<Integer> Z = Lists.newArrayList();
   private int z;

   private void L(int var1) {
      class05111 class05111 = class05111.N();

      try {
         class04945 class04945 = class05111.y(this.i.y, var1);
         class04704 class04704 = new class04704(this, class04945, this.i.N(var1), var2x -> {
            if (var2x) {
               this.Z.add(var1);
               this.method_37067();
               this.y();
            } else {
               this.field_22787.N(this);
            }
         });
         this.field_22787.N(class04704);
      } catch (class05097 class05097) {
         y.error("Couldn't download world data", class05097);
         this.field_22787.N(new class04702(class05097, this));
      }
   }

   private boolean L() {
      return this.i != null && this.i.z();
   }

   public class05107(class05096 var1, long var2, boolean var4) {
      super(var4 ? class00392.L("mco.brokenworld.minigame.title") : class00392.L("mco.brokenworld.title"));
      this.u = var1;
      this.R = var2;
   }

   private void y() {
      Iterator<Entry<Integer, class00072>> iterator = this.i.z.entrySet().iterator();

      while (iterator.hasNext()) {
         int ix = iterator.next().getKey();
         class05362 class05362;
         if (ix != this.i.T || this.i.z()) {
            class05362 = class05362.method_46430(
                  class00392.L("mco.brokenworld.play"), var2 -> this.field_22787.N(new class04708(this.u, new class04724(this.i.y, ix, this::N)))
               )
               .N(this.y(ix), N(8), 80, 20)
               .N();
            class05362.field_22763 = !this.i.z.get(ix).y.Z;
         } else {
            class05362 = class05362.method_46430(
                  class00392.L("mco.brokenworld.download"),
                  var2 -> this.field_22787.N(class02252.N(this, class00392.L("mco.configure.world.restore.download.question.line1"), var2x -> this.L(ix)))
               )
               .N(this.y(ix), N(8), 80, 20)
               .N();
         }

         if (this.Z.contains(ix)) {
            class05362.field_22763 = false;
            class05362.method_25355(class00392.L("mco.brokenworld.downloaded"));
         }

         this.method_37063(class05362);
      }
   }

   private int y(int var1) {
      return this.B + (var1 - 1) * 110;
   }

   public class05096 N(class05097 var1) {
      return new class04702(var1, this.u);
   }

   private void N(long var1) {
      class04601.<class04981>N(var2 -> var2.N(var1), class04601.N(this::N, "Couldn't get own world")).thenAcceptAsync(var1x -> {
         this.i = var1x;
         this.y();
      }, this.field_22787);
   }

   public void N() {
      new Thread(() -> {
         class05111 class05111 = class05111.N();
         if (this.i.R == class04961.field_19433) {
            this.field_22787.execute(() -> this.field_22787.N(new class04708(this, new class04691(this.i, this, true, this.field_22787))));
         } else {
            try {
               class04981 class04981 = class05111.N(this.R);
               this.field_22787.execute(() -> class05685.N(class04981, this));
            } catch (class05097 class05097) {
               y.error("Couldn't get own world", class05097);
               this.field_22787.execute(() -> this.field_22787.N(this.N(class05097)));
            }
         }
      }).start();
   }

   private void N(
      class01054 var1, int var2, int var3, int var4, int var5, boolean var6, String var7, int var8, long var9, @Nullable String var11, boolean var12
   ) {
      class01894 class01894;
      if (var12) {
         class01894 = class05099.N;
      } else if (var11 != null && var9 != -1L) {
         class01894 = class04602.N(String.valueOf(var9), var11);
      } else if (var8 == 1) {
         class01894 = class05099.y;
      } else if (var8 == 2) {
         class01894 = class05099.L;
      } else if (var8 == 3) {
         class01894 = class05099.u;
      } else {
         class01894 = class04602.N(String.valueOf(this.i.j), this.i.v);
      }

      if (var6) {
         float f = 0.9F + 0.1F * class04995.P(this.z * 0.2F);
         var1.N(class08394.Na, class01894, var2 + 3, var3 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, class02566.N(1.0F, f, f, f));
         var1.N(class08394.Na, N, var2, var3, 80, 80);
      } else {
         int ix = class02566.N(1.0F, 0.56F, 0.56F, 0.56F);
         var1.N(class08394.Na, class01894, var2 + 3, var3 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, ix);
         var1.N(class08394.Na, N, var2, var3, 80, 80, ix);
      }

      var1.N(this.field_22793, var7, var2 + 40, var3 + 66, -1);
   }

   @Override
   public void method_25426() {
      this.B = this.field_22789 / 2 - 150;
      this.method_37063(class05362.method_46430(class05220.U, var1 -> this.method_25419()).N((this.field_22789 - 150) / 2, N(13) - 5, 150, 20).N());
      if (this.i == null) {
         this.N(this.R);
      } else {
         this.y();
      }
   }

   @Override
   public void method_25393() {
      this.z++;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 17, -1);

      for (int var5 = 0; var5 < this.M.length; var5++) {
         var1.N(this.field_22793, this.M[var5], this.field_22789 / 2, N(-1) + 3 + var5 * 12, -6250336);
      }

      if (this.i != null) {
         for (Entry entry : this.i.z.entrySet()) {
            if (((class00072)entry.getValue()).y.B != null && ((class00072)entry.getValue()).y.M != -1L) {
               this.N(
                  var1,
                  this.y((Integer)entry.getKey()),
                  N(1) + 5,
                  var2,
                  var3,
                  this.i.T == (Integer)entry.getKey() && !this.L(),
                  ((class00072)entry.getValue()).y.N((Integer)entry.getKey()),
                  (Integer)entry.getKey(),
                  ((class00072)entry.getValue()).y.M,
                  ((class00072)entry.getValue()).y.B,
                  ((class00072)entry.getValue()).y.Z
               );
            } else {
               this.N(
                  var1,
                  this.y((Integer)entry.getKey()),
                  N(1) + 5,
                  var2,
                  var3,
                  this.i.T == (Integer)entry.getKey() && !this.L(),
                  ((class00072)entry.getValue()).y.N((Integer)entry.getKey()),
                  (Integer)entry.getKey(),
                  -1L,
                  null,
                  ((class00072)entry.getValue()).y.Z
               );
            }
         }
      }
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.u);
   }

   @Override
   public class00392 method_25435() {
      return class00390.N(Stream.concat(Stream.of(this.field_22785), Stream.of(this.M)).collect(Collectors.toList()), class05220.l);
   }
}
