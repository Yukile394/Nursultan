package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class class00327 extends class00394 {
   private static final int y = 32;
   public static final int N = 32;
   private static final int L = 34;
   private static final int u = 16;
   private static final int i = 8;
   private static final int R = 5;
   private static final int M = 20;
   private static final int B = 5;
   private static final int Z = 100;
   private static final int m = 10;
   private static final int P = 10;
   private static final int s = 50;
   private static final int T = 2;
   private static final int b = 64;
   private static final int j = 30;
   private static final Optional<class00245> v = Optional.empty();
   @Nullable
   private Either<class00245, UUID> n;
   private long t;
   private int G;
   private int l;
   @Nullable
   private class06889 d;
   private int w;

   public int L() {
      return this.w;
   }

   private void M() {
      this.n = null;
      this.method_5431();
   }

   public class00327(class07209 var1, class00500 var2) {
      super(class00404.field_54774, var1, var2);
   }

   private Optional<class00245> B() {
      if (this.n == null) {
         return v;
      } else {
         if (this.n.left().isPresent()) {
            class00245 class00245x = (class00245)this.n.left().get();
            if (!class00245x.method_31481()) {
               return Optional.of(class00245x);
            }

            this.N(class00245x.method_5667());
         }

         if (this.z instanceof class04782 class04782 && this.n.right().isPresent()) {
            UUID uuid = (UUID)this.n.right().get();
            if (class04782.method_66347(uuid) instanceof class00245 class00245) {
               this.N(class00245);
               return Optional.of(class00245);
            } else {
               if (this.t >= 30L) {
                  this.M();
               }

               return v;
            }
         } else {
            return v;
         }
      }
   }

   public int u() {
      if (this.n != null && !this.B().isEmpty()) {
         double d0 = Math.clamp(this.R(), 0.0, 32.0) / 32.0;
         return 15 - (int)Math.floor(d0 * 15.0);
      } else {
         return 0;
      }
   }

   public void y() {
      if (this.B().orElse(null) instanceof class00245 class00245) {
         if (this.z instanceof class04782 class04782) {
            if (this.l <= 0) {
               this.N(class04782, 20, false);
               if (this.w().L(class00325.L) == class08630.field_55833) {
                  int jx = this.z.method_8409().N(2, 3);

                  for (int ix = 0; ix < jx; ix++) {
                     this.N(class04782).ifPresent(var1x -> {
                        this.z.method_8396(null, var1x, class04909.dz, class04911.field_15245, 1.0F, 1.0F);
                        this.z.N(class01194.Z, var1x, class01164.N(this.w()));
                     });
                  }
               }

               this.l = 100;
               this.d = class00245.method_5829().R();
            }
         }
      }
   }

   public boolean y(class00245 var1) {
      return this.B().map(var1x -> var1x == var1).orElse(false);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      var1.<UUID>N("creaking", class01487.N).ifPresentOrElse(this::N, this::M);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      if (this.n != null) {
         var1.N("creaking", class01487.N, (UUID)this.n.map(class07049::method_5667, var0 -> var0));
      }
   }

   public void N(@Nullable class07072 var1) {
      if (this.B().orElse(null) instanceof class00245 class00245) {
         if (var1 == null) {
            class00245.Z();
         } else {
            class00245.y(var1);
            class00245.E();
            class00245.method_6033(0.0F);
         }

         this.M();
      }
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class00327 var3) {
      var3.t++;
      if (var0 instanceof class04782 class04782) {
         int ix = var3.u();
         if (var3.w != ix) {
            var3.w = ix;
            var0.method_8455(var1, class00869.Lp);
         }

         if (var3.l > 0) {
            if (var3.l > 50) {
               var3.N(class04782, 1, true);
               var3.N(class04782, 1, false);
            }

            if (var3.l % 10 == 0 && var3.d != null) {
               var3.B().ifPresent(var1x -> var3.d = var1x.method_5829().R());
               class06889 class06889x = class06889.y(var1);
               float var7 = 0.2F + 0.8F * (100 - var3.l) / 100.0F;
               class06889 class06889x = class06889x.u(var3.d).L((double)var7).i(var3.d);
               class07209 class07209 = class07209.method_49638(class06889x);
               float f1 = var3.l / 2.0F / 100.0F + 0.5F;
               class04782.method_8396(null, class07209, class04909.BY, class04911.field_15245, f1, 1.0F);
            }

            var3.l--;
         }

         if (var3.G-- < 0) {
            var3.G = var3.z == null ? 20 : var3.z.field_9229.y(5) + 20;
            class00500 class00500 = N(var0, var2, var1, var3);
            if (class00500 != var2) {
               var0.method_8652(var1, class00500, 3);
               if (class00500.L(class00325.L) == class08630.field_55831) {
                  return;
               }
            }

            if (var3.n == null) {
               if (class00500.L(class00325.L) == class08630.field_55833) {
                  if (class04782.method_74962()) {
                     class08036 class08036 = var0.N(var1.method_10263(), var1.method_10264(), var1.method_10260(), 32.0, false);
                     if (class08036 != null) {
                        class00245 class00245 = N(class04782, var3);
                        if (class00245 != null) {
                           var3.N(class00245);
                           class00245.method_56078(class04909.Bt);
                           var0.method_8396(null, var3.d(), class04909.BI, class04911.field_15245, 1.0F, 1.0F);
                        }
                     }
                  }
               }
            } else {
               Optional<class00245> optional = var3.B();
               if (optional.isPresent()) {
                  class00245 class00245x = optional.get();
                  if (!var0.method_75728().N(class00608.e, var1) && !class00245x.Nm() || var3.R() > 34.0 || class00245x.z()) {
                     var3.N(null);
                  }
               }
            }
         }
      }
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   public class07269 i() {
      return class07269.N(this);
   }

   @Nullable
   private static class00245 N(class04782 var0, class00327 var1) {
      class07209 class07209 = var1.d();
      Optional<class00245> optional = class04011.N(class07078.o, class06113.field_16469, var0, class07209, 5, 16, 8, class04000.L, true);
      if (optional.isEmpty()) {
         return null;
      } else {
         class00245 class00245 = optional.get();
         var0.N(class00245, class01194.v, class00245.method_73189());
         var0.method_8421(class00245, (byte)60);
         class00245.N(class07209);
         return class00245;
      }
   }

   public void N(UUID var1) {
      this.n = Either.right(var1);
      this.t = 0L;
      this.method_5431();
   }

   public void N(class00245 var1) {
      this.n = Either.left(var1);
      this.method_5431();
   }

   private static class00500 N(class07299 var0, class00500 var1, class07209 var2, class00327 var3) {
      if (!class00325.N(var1, var0, var2) && var3.n == null) {
         return var1.y(class00325.L, class08630.field_55831);
      } else {
         class08630 class08630 = var0.method_75728().N(class00608.e, var2) ? class08630.field_55833 : class08630.field_55832;
         return var1.y(class00325.L, class08630);
      }
   }

   @Override
   public void N(class07209 var1, class00500 var2) {
      this.N(null);
   }

   private void N(class04782 var1, int var2, boolean var3) {
      if (this.B().orElse(null) instanceof class00245 class00245) {
         int ix = var3 ? 16545810 : 6250335;
         class06069 class06069 = var1.field_9229;

         for (double d0 = 0.0; d0 < var2; d0++) {
            class00734 class00734 = class00245.method_5829();
            class06889 class06889xx = class00734.B().y(class06069.U() * class00734.y(), class06069.U() * class00734.L(), class06069.U() * class00734.u());
            class06889 class06889x = class06889.N(this.d()).y(class06069.U(), class06069.U(), class06069.U());
            if (var3) {
               class06889 class06889xx = class06889xx;
               class06889xx = class06889x;
               class06889x = class06889xx;
            }

            class00303 class00303 = new class00303(class06889x, ix, class06069.y(40) + 10);
            var1.method_14199(class00303, true, true, class06889xx.M, class06889xx.B, class06889xx.Z, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   private Optional<class07209> N(class04782 var1) {
      MutableObject mutableobject = new MutableObject(null);
      class07209.method_49925(this.U, 2, 64, (var1x, var2x) -> {
         for (class07211 class07211 : class07536.y(class07211.values(), var1.field_9229)) {
            class07209 class07209 = var1x.method_10093(class07211);
            if (var1.method_8320(class07209).N(class01210.v)) {
               var2x.accept(class07209);
            }
         }
      }, var2x -> {
         if (!var1.method_8320(var2x).N(class01210.v)) {
            return class07192.field_55165;
         } else {
            for (class07211 class07211x : class07536.y(class07211.values(), var1.field_9229)) {
               class07209 class07209 = var2x.method_10093(class07211x);
               class00500 class00500 = var1.method_8320(class07209);
               class07211 class07211x = class07211x.b();
               if (class00500.P()) {
                  class00500 = class00869.Ra.W();
               } else if (class00500.N(class00869.K) && class00500.Y().u()) {
                  class00500 = class00869.Ra.W().y(class05543.L, true);
               }

               if (class00500.N(class00869.Ra) && !class05543.N(class00500, class07211x)) {
                  var1.method_8652(class07209, class00500.y(class05543.y(class07211x), true), 3);
                  mutableobject.setValue(class07209);
                  return class07192.field_55167;
               }
            }

            return class07192.field_55165;
         }
      });
      return Optional.ofNullable((class07209)mutableobject.get());
   }

   private double R() {
      return this.B().map(var1 -> Math.sqrt(var1.method_5707(class06889.L(this.d())))).orElse(0.0);
   }
}
