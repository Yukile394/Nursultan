package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class class04723 extends class05407 {
   private static final int M = 2;
   public static final List<class07086> N = ImmutableList.of(class07086.field_5801, class07086.field_5805, class07086.field_5802, class07086.field_5807);
   private static final int B = 0;
   public static final List<class07282> y = ImmutableList.of(class07282.field_9215, class07282.field_9220, class07282.field_9216);
   private static final class00392 Z = class00392.L("mco.configure.world.edit.slot.name");
   static final class00392 L = class00392.L("mco.configure.world.spawnProtection");
   private class04927 z;
   protected final class05092 u;
   private int U;
   private int E;
   private final class00072 W;
   private final class04969 m;
   private class07086 P;
   private class07282 s;
   private final String T;
   private String b;
   int i;
   private boolean j;
   class04699 R;

   public class04723(class05092 var1, class00072 var2, class04969 var3, int var4) {
      super(class00392.L("mco.configure.world.buttons.options"));
      this.u = var1;
      this.W = var2;
      this.m = var3;
      this.P = N(N, var2.y.L, 2);
      this.s = N(y, var2.y.u, 0);
      this.T = var2.y.y(var4);
      this.N(var2.y.N(var4));
      if (var3 == class04969.field_19437) {
         this.i = var2.y.N;
         this.j = var2.y.y;
      } else {
         this.i = 0;
         this.j = false;
      }
   }

   private void N() {
      int ix = N(N, this.P, 2);
      int jx = N(y, this.s, 0);
      if (this.m != class04969.field_19439 && this.m != class04969.field_19440 && this.m != class04969.field_19441) {
         this.u.N(new class00072(this.W.N, new class04980(this.i, ix, jx, this.j, this.b, this.W.y.i, this.W.y.R), this.W.L));
      } else {
         this.u.N(new class00072(this.W.N, new class04980(this.W.y.N, ix, jx, this.W.y.y, this.b, this.W.y.i, this.W.y.R), this.W.L));
      }
   }

   private static <T> int N(List<T> var0, T var1, int var2) {
      int ix = var0.indexOf(var1);
      return ix == -1 ? var2 : ix;
   }

   private static <T> T N(List<T> var0, int var1, int var2) {
      try {
         return (T)var0.get(var1);
      } catch (IndexOutOfBoundsException indexoutofboundsexception) {
         return (T)var0.get(var2);
      }
   }

   private void N(String var1) {
      if (var1.equals(this.T)) {
         this.b = "";
      } else {
         this.b = var1;
      }
   }

   private class06355<Boolean> N(class00392 var1, Consumer<Boolean> var2) {
      return (var3, var4) -> {
         if (var4) {
            var2.accept(true);
         } else {
            this.field_22787.N(class02252.y(this, var1, var1xx -> {
               var2.accept(false);
               var1xx.method_25419();
            }));
         }
      };
   }

   @Override
   public void method_25426() {
      this.E = 170;
      this.U = this.field_22789 / 2 - this.E;
      int ix = this.field_22789 / 2 + 10;
      if (this.m != class04969.field_19437) {
         class05216 class05216;
         if (this.m == class04969.field_19439) {
            class05216 = class00392.L("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.m == class04969.field_19441) {
            class05216 = class00392.L("mco.configure.world.edit.subscreen.inspiration");
         } else {
            class05216 = class00392.L("mco.configure.world.edit.subscreen.experience");
         }

         this.N(new class05389(class05216, this.field_22789 / 2, 26, -65536));
      }

      this.z = this.method_25429(
         new class04927((class01590)this.field_22787.i_3, this.U, N(1), this.E, 20, null, class00392.L("mco.configure.world.edit.slot.name"))
      );
      this.z.method_1852(this.b);
      this.z.method_1863(this::N);
      class06366 class06366 = this.method_37063(
         class06366.N(class07086::y, this.P).N(N).N(ix, N(1), this.E, 20, class00392.L("options.difficulty"), (var1x, var2x) -> this.P = var2x)
      );
      class06366 class06366x = this.method_37063(
         class06366.N(class07282::u, this.s).N(y).N(this.U, N(3), this.E, 20, class00392.L("selectWorld.gameMode"), (var1x, var2x) -> this.s = var2x)
      );
      class06366<Boolean> class06366x = this.method_37063(
         class06366.N(this.j).N(ix, N(3), this.E, 20, class00392.L("mco.configure.world.forceGameMode"), (var1x, var2x) -> this.j = var2x)
      );
      this.R = this.method_37063(new class04699(this, this.U, N(5), this.E, this.i, 0.0F, 16.0F));
      if (this.m != class04969.field_19437) {
         this.R.field_22763 = false;
         class06366x.field_22763 = false;
      }

      if (this.W.y()) {
         class06366.field_22763 = false;
         class06366x.field_22763 = false;
         class06366x.field_22763 = false;
      }

      this.method_37063(class05362.method_46430(class00392.L("mco.configure.world.buttons.done"), var1x -> this.N()).N(this.U, N(13), this.E, 20).N());
      this.method_37063(class05362.method_46430(class05220.i, var1x -> this.method_25419()).N(ix, N(13), this.E, 20).N());
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 17, -1);
      var1.y(this.field_22793, Z, this.U + this.E / 2 - this.field_22793.N(Z) / 2, N(0) - 5, -1);
      this.z.method_25394(var1, var2, var3, var4);
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.u);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(this.method_25440(), this.z());
   }
}
