package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;

public final class class04485 {
   private static final Logger y = LogUtils.getLogger();
   public static final int N = 40;
   private static final int L = 36000;
   private static final int u = 14;
   private static final int i = 47;
   private static final int R = class04995.Z(47);
   private static final float M = 0.02F;
   private final class04479 B = new class04479();
   private class04502 Z;
   private final class04498 z;
   private class04514 U;
   private final class04488 E;
   private boolean W;
   private boolean m;

   public class04513 L() {
      return this.Z.y().N();
   }

   public Optional<UUID> L(class04782 var1, class07209 var2) {
      class06069 class06069 = var1.method_8409();
      class00808 class00808 = this.B.y(this, var1.method_8409());

      Optional optional1;
      try (class04495 class04495 = new class04495(() -> "spawner@" + var2, y)) {
         class08299 class08299 = class08308.N(class04495, var1.method_30349(), class00808.u());
         Optional<class07078<?>> optional = class07078.N(class08299);
         if (optional.isEmpty()) {
            return Optional.empty();
         }

         class06889 class06889 = class08299.<class06889>N("Pos", class06889.N)
            .orElseGet(
               () -> {
                  class04513 class04513 = this.N();
                  return new class06889(
                     var2.method_10263() + (class06069.U() - class06069.U()) * class04513.L() + 0.5,
                     var2.method_10264() + class06069.y(3) - 1,
                     var2.method_10260() + (class06069.U() - class06069.U()) * class04513.L() + 0.5
                  );
               }
            );
         if (!var1.y(optional.get().N(class06889.M, class06889.B, class06889.Z))) {
            return Optional.empty();
         }

         if (!N(var1, var2.method_46558(), class06889)) {
            return Optional.empty();
         }

         class07209 class07209 = class07209.method_49638(class06889);
         if (!class07448.N(optional.get(), var1, class06113.field_47245, class07209, var1.method_8409())) {
            return Optional.empty();
         }

         if (class00808.y().isPresent()) {
            class00778 class00778 = class00808.y().get();
            if (!class00778.N(class07209, var1)) {
               return Optional.empty();
            }
         }

         class07049 class07049 = class07078.N(class08299, var1, class06113.field_47245, var2x -> {
            var2x.method_5808(class06889.M, class06889.B, class06889.Z, class06069.z() * 360.0F, 0.0F);
            return var2x;
         });
         if (class07049 == null) {
            return Optional.empty();
         }

         if (class07049 instanceof class07079 class07079) {
            if (!class07079.N((class05487)var1)) {
               return Optional.empty();
            }

            boolean flag = class00808.N().Z() == 1 && class00808.N().Z("id").isPresent();
            if (flag) {
               class07079.N(var1, var1.method_8404(class07079.method_24515()), class06113.field_47245, null);
            }

            class07079.NW();
            class00808.L().ifPresent(class07079::N);
         }

         if (!var1.method_30736(class07049)) {
            return Optional.empty();
         }

         class04500 class04500 = this.m ? class04500.field_50187 : class04500.field_50186;
         var1.N(3011, var2, class04500.N());
         var1.N(3012, class07209, class04500.N());
         var1.N(class07049, class01194.v, class07209);
         optional1 = Optional.of(class07049.method_5667());
      }

      return optional1;
   }

   public class04481 M() {
      return this.z.u();
   }

   public class04485(class04502 var1, class04498 var2, class04514 var3, class04488 var4) {
      super();
      this.Z = var1;
      this.z = var2;
      this.U = var3;
      this.E = var4;
   }

   public class04479 B() {
      return this.B;
   }

   public void Z() {
      this.z.R();
   }

   public int i() {
      return this.Z.L();
   }

   public class04488 U() {
      return this.E;
   }

   public class04514 z() {
      return this.U;
   }

   public boolean u() {
      return this.m;
   }

   public static void y(class07299 var0, class07209 var1, class06069 var2) {
      for (int ix = 0; ix < 20; ix++) {
         double d0 = var1.method_10263() + 0.4 + var2.U() * 0.2;
         double d1 = var1.method_10264() + 0.4 + var2.U() * 0.2;
         double d2 = var1.method_10260() + 0.4 + var2.U() * 0.2;
         double d3 = var2.E() * 0.02;
         double d4 = var2.E() * 0.02;
         double d5 = var2.E() * 0.02;
         var0.method_8406(class07107.Nc, d0, d1, d2, d3, d4, d5 * 0.25);
         var0.method_8406(class07107.NZ, d0, d1, d2, d3, d4, d5);
      }
   }

   public void y(class04782 var1, class07209 var2) {
      var1.method_8652(var2, var1.method_8320(var2).y(class04487.L, false), 3);
      this.m = false;
   }

   public class04513 y() {
      return this.Z.N().N();
   }

   @Deprecated(
      forRemoval = true
   )
   public void E() {
      this.W = true;
   }

   public void N(class07078<?> var1, class07299 var2) {
      this.B.y();
      this.Z = this.Z.N(var1);
      this.N(var2, class04481.field_47383);
   }

   public static void N(class07299 var0, class07209 var1, class06069 var2, class07134 var3) {
      for (int ix = 0; ix < 20; ix++) {
         double d0 = var1.method_10263() + 0.5 + (var2.U() - 0.5) * 2.0;
         double d1 = var1.method_10264() + 0.5 + (var2.U() - 0.5) * 2.0;
         double d2 = var1.method_10260() + 0.5 + (var2.U() - 0.5) * 2.0;
         var0.method_8406(class07107.NZ, d0, d1, d2, 0.0, 0.0, 0.0);
         var0.method_8406(var3, d0, d1, d2, 0.0, 0.0, 0.0);
      }
   }

   public static void N(class07299 var0, class07209 var1, class06069 var2, int var3, class07126 var4) {
      for (int ix = 0; ix < 30 + Math.min(var3, 10) * 5; ix++) {
         double d0 = (2.0F * var2.z() - 1.0F) * 0.65;
         double d1 = (2.0F * var2.z() - 1.0F) * 0.65;
         double d2 = var1.method_10263() + 0.5 + d0;
         double d3 = var1.method_10264() + 0.1 + var2.z() * 0.8;
         double d4 = var1.method_10260() + 0.5 + d1;
         var0.method_8406(var4, d2, d3, d4, 0.0, 0.0, 0.0);
      }
   }

   public static void N(class07299 var0, class07209 var1, class06069 var2) {
      for (int ix = 0; ix < 20; ix++) {
         double d0 = var1.method_10263() + 0.5 + (var2.U() - 0.5) * 2.0;
         double d1 = var1.method_10264() + 0.5 + (var2.U() - 0.5) * 2.0;
         double d2 = var1.method_10260() + 0.5 + (var2.U() - 0.5) * 2.0;
         double d3 = var2.E() * 0.02;
         double d4 = var2.E() * 0.02;
         double d5 = var2.E() * 0.02;
         var0.method_8406(class07107.yZ, d0, d1, d2, d3, d4, d5);
         var0.method_8406(class07107.X, d0, d1, d2, d3, d4, d5);
      }
   }

   public void N(class08299 var1) {
      var1.<class04505>N(class04505.B).ifPresent(this.B::N);
      this.Z = var1.<class04502>N(class04502.i).orElse(class04502.R);
   }

   @Deprecated(
      forRemoval = true
   )
   public void N(class04514 var1) {
      this.U = var1;
   }

   public class04513 N() {
      return this.m ? this.Z.y().N() : this.Z.N().N();
   }

   public boolean N(class04782 var1) {
      if (!var1.method_64395().N(class07305.C)) {
         return false;
      } else if (this.W) {
         return true;
      } else {
         return var1.y() == class07086.field_5801 ? false : var1.method_64395().N(class07305.S);
      }
   }

   public void N(class07299 var1, class04481 var2) {
      this.z.N(var1, var2);
   }

   public void N(class04782 var1, class07209 var2) {
      var1.method_8652(var2, var1.method_8320(var2).y(class04487.L, true), 3);
      var1.N(3020, var2, 1);
      this.m = true;
      this.B.N(this, var1);
   }

   public void N(class08329 var1) {
      var1.N(class04505.B, this.B.N());
      var1.N(class04502.i, this.Z);
   }

   private static boolean N(class04782 var0, class07209 var1, UUID var2) {
      class07049 class07049 = var0.method_66347(var2);
      return class07049 == null
         || !class07049.method_5805()
         || !class07049.method_73183().method_27983().equals(var0.method_27983())
         || class07049.method_24515().method_10262(var1) > R;
   }

   private static boolean N(class07299 var0, class06889 var1, class06889 var2) {
      class06183 class06183 = var0.N(new class05862(var2, var1, class05849.field_23142, class05835.field_1348, class06092.N()));
      return class06183.u().equals(class07209.method_49638(var1)) || class06183.N() == class07113.field_1333;
   }

   public void N(class04782 var1, class07209 var2, boolean var3) {
      this.m = var3;
      class04481 class04481x = this.M();
      if (this.B.y.removeIf(var2x -> N(var1, var2, var2x))) {
         this.B.u = var1.N() + this.N().B();
      }

      class04481 class04481x = class04481x.N(var2, this, var1);
      if (class04481x != class04481x) {
         this.N(var1, class04481x);
      }
   }

   public void N(class07299 var1, class07209 var2, boolean var3) {
      class04481 class04481 = this.M();
      class04481.N(var1, var2, var3);
      if (class04481.L()) {
         double d0 = Math.max(0L, this.B.u - var1.N());
         this.B.Z = this.B.B;
         this.B.B = (this.B.B + class04481.y() / (d0 + 200.0)) % 360.0;
      }

      if (class04481.u()) {
         class06069 class06069 = var1.method_8409();
         if (class06069.z() <= 0.02F) {
            class04891 class04891 = var3 ? class04909.Pu : class04909.PL;
            var1.method_45446(var2, class04891, class04911.field_15245, class06069.z() * 0.25F + 0.75F, class06069.z() + 0.5F, false);
         }
      }
   }

   public void N(class04782 var1, class07209 var2, class05946<class05074> var3) {
      class05074 class05074 = var1.method_8503().yd().N(var3);
      class04162 class04162 = new class04160(var1).N(class06925.L);
      ObjectArrayList<class06584> objectarraylist = class05074.N(class04162);
      if (!objectarraylist.isEmpty()) {
         ObjectListIterator<class06584> objectlistiterator = objectarraylist.iterator();

         while (objectlistiterator.hasNext()) {
            class06584 class06584 = (class06584)objectlistiterator.next();
            class07206.N(var1, class06584, 2, class07211.field_11036, class06889.L(var2).N(class07211.field_11036, 1.2));
         }

         var1.N(3014, var2, 0);
      }
   }

   public int R() {
      return this.Z.u();
   }
}
