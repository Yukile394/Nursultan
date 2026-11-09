package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class07308 {
   private static final Logger N = LogUtils.getLogger();
   public static final String y = "SpawnData";
   private static final int L = 1;
   private static final int u = 20;
   private static final int i = 200;
   private static final int R = 800;
   private static final int M = 4;
   private static final int B = 6;
   private static final int Z = 16;
   private static final int z = 4;
   private int U = 20;
   private class04540<class00808> E = class04540.N();
   @Nullable
   private class00808 W;
   private double m;
   private double P;
   private int s = 200;
   private int T = 800;
   private int b = 4;
   @Nullable
   private class07049 j;
   private int v = 6;
   private int n = 16;
   private int t = 4;

   private boolean L(class07299 var1, class07209 var2) {
      return var1.N(var2.method_10263() + 0.5, var2.method_10264() + 0.5, var2.method_10260() + 0.5, this.n);
   }

   public class07308() {
      super();
   }

   private void u(class07299 var1, class07209 var2) {
      class06069 class06069 = var1.field_9229;
      if (this.T <= this.s) {
         this.U = this.s;
      } else {
         this.U = this.s + class06069.y(this.T - this.s);
      }

      this.E.N(class06069).ifPresent(var3x -> this.N(var1, var2, var3x));
      this.N(var1, var2, 1);
   }

   @Nullable
   public class07049 y(class07299 var1, class07209 var2) {
      if (this.j == null) {
         class07001 class07001 = this.N(var1, var1.method_8409(), var2).N();
         if (class07001.Z("id").isEmpty()) {
            return null;
         }

         this.j = class07078.N(class07001, var1, class06113.field_16469, class06837.N);
         if (class07001.Z() == 1 && this.j instanceof class07079) {
         }
      }

      return this.j;
   }

   public double y() {
      return this.P;
   }

   public void N(class07299 var1, class07209 var2) {
      if (!this.L(var1, var2)) {
         this.P = this.m;
      } else if (this.j != null) {
         class06069 class06069 = var1.method_8409();
         double d0 = var2.method_10263() + class06069.U();
         double d1 = var2.method_10264() + class06069.U();
         double d2 = var2.method_10260() + class06069.U();
         var1.method_8406(class07107.NZ, d0, d1, d2, 0.0, 0.0, 0.0);
         var1.method_8406(class07107.J, d0, d1, d2, 0.0, 0.0, 0.0);
         if (this.U > 0) {
            this.U--;
         }

         this.P = this.m;
         this.m = (this.m + 1000.0F / (this.U + 200.0F)) % 360.0;
      }
   }

   protected void N(@Nullable class07299 var1, class07209 var2, class00808 var3) {
      this.W = var3;
   }

   public void N(class07078<?> var1, @Nullable class07299 var2, class06069 var3, class07209 var4) {
      this.N(var2, var3, var4).N().N_67("id", class04206.M.y(var1).toString());
   }

   public void N(class04782 var1, class07209 var2) {
      if (this.L(var1, var2) && var1.method_75001()) {
         if (this.U == -1) {
            this.u(var1, var2);
         }

         if (this.U > 0) {
            this.U--;
         } else {
            boolean flag = false;
            class06069 class06069 = var1.method_8409();
            class00808 class00808 = this.N(var1, class06069, var2);

            for (int ix = 0; ix < this.b; ix++) {
               try (class04495 class04495 = new class04495(this::toString, N)) {
                  class08299 class08299 = class08308.N(class04495, var1.method_30349(), class00808.N());
                  Optional<class07078<?>> optional = class07078.N(class08299);
                  if (optional.isEmpty()) {
                     this.u(var1, var2);
                     return;
                  }

                  class06889 class06889 = class08299.<class06889>N("Pos", class06889.N)
                     .orElseGet(
                        () -> new class06889(
                           var2.method_10263() + (class06069.U() - class06069.U()) * this.t + 0.5,
                           var2.method_10264() + class06069.y(3) - 1,
                           var2.method_10260() + (class06069.U() - class06069.U()) * this.t + 0.5
                        )
                     );
                  if (var1.y(optional.get().N(class06889.M, class06889.B, class06889.Z))) {
                     class07209 class07209 = class07209.method_49638(class06889);
                     if (class00808.y().isPresent()) {
                        if (!optional.get().i().L() && var1.y() == class07086.field_5801) {
                           continue;
                        }

                        class00778 class00778 = class00808.y().get();
                        if (!class00778.N(class07209, var1)) {
                           continue;
                        }
                     } else if (!class07448.N(optional.get(), var1, class06113.field_16469, class07209, var1.method_8409())) {
                        continue;
                     }

                     class07049 class07049 = class07078.N(class08299, var1, class06113.field_16469, var1x -> {
                        var1x.method_5808(class06889.M, class06889.B, class06889.Z, var1x.method_36454(), var1x.method_36455());
                        return var1x;
                     });
                     if (class07049 == null) {
                        this.u(var1, var2);
                        return;
                     }

                     if (var1.method_18023(
                              class01128.y(class07049.getClass()),
                              new class00734(
                                    var2.method_10263(),
                                    var2.method_10264(),
                                    var2.method_10260(),
                                    var2.method_10263() + 1,
                                    var2.method_10264() + 1,
                                    var2.method_10260() + 1
                                 )
                                 .M(this.t),
                              class07042.R
                           )
                           .size()
                        >= this.v) {
                        this.u(var1, var2);
                        return;
                     }

                     class07049.method_5808(class07049.method_23317(), class07049.method_23318(), class07049.method_23321(), class06069.z() * 360.0F, 0.0F);
                     if (class07049 instanceof class07079 class07079) {
                        if (class00808.y().isEmpty() && !class07079.N(var1, class06113.field_16469) || !class07079.N((class05487)var1)) {
                           continue;
                        }

                        if (class00808.N().Z() == 1 && class00808.N().Z("id").isPresent()) {
                           ((class07079)class07049).N(var1, var1.method_8404(class07049.method_24515()), class06113.field_16469, null);
                        }

                        class00808.L().ifPresent(class07079::N);
                     }

                     if (!var1.method_30736(class07049)) {
                        this.u(var1, var2);
                        return;
                     }

                     var1.N(2004, var2, 0);
                     var1.N(class07049, class01194.v, class07209);
                     if (class07049 instanceof class07079) {
                        ((class07079)class07049).h();
                     }

                     flag = true;
                  }
               }
            }

            if (flag) {
               this.u(var1, var2);
            }

            return;
         }
      }
   }

   public boolean N(class07299 var1, int var2) {
      if (var2 == 1) {
         if (var1.method_8608()) {
            this.U = this.s;
         }

         return true;
      } else {
         return false;
      }
   }

   public void N(class08329 var1) {
      var1.N("Delay", (short)this.U);
      var1.N("MinSpawnDelay", (short)this.s);
      var1.N("MaxSpawnDelay", (short)this.T);
      var1.N("SpawnCount", (short)this.b);
      var1.N("MaxNearbyEntities", (short)this.v);
      var1.N("RequiredPlayerRange", (short)this.n);
      var1.N("SpawnRange", (short)this.t);
      var1.y("SpawnData", class00808.y, this.W);
      var1.N("SpawnPotentials", class00808.L, this.E);
   }

   public void N(@Nullable class07299 var1, class07209 var2, class08299 var3) {
      this.U = var3.N("Delay", (short)20);
      var3.<class00808>N("SpawnData", class00808.y).ifPresent(var3x -> this.N(var1, var2, var3x));
      this.E = var3.<class04540<class00808>>N("SpawnPotentials", class00808.L).orElseGet(() -> class04540.N(this.W != null ? this.W : new class00808()));
      this.s = var3.N("MinSpawnDelay", 200);
      this.T = var3.N("MaxSpawnDelay", 800);
      this.b = var3.N("SpawnCount", 4);
      this.v = var3.N("MaxNearbyEntities", 6);
      this.n = var3.N("RequiredPlayerRange", 16);
      this.t = var3.N("SpawnRange", 4);
      this.j = null;
   }

   private class00808 N(@Nullable class07299 var1, class06069 var2, class07209 var3) {
      if (this.W != null) {
         return this.W;
      } else {
         this.N(var1, var3, this.E.N(var2).orElseGet(class00808::new));
         return this.W;
      }
   }

   public abstract void N(class07299 var1, class07209 var2, int var3);

   public double N() {
      return this.m;
   }
}
