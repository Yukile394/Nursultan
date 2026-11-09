package minecraft;

import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;

public class class07954 extends class07473 {
   protected final class07475 N;
   private final double y;
   @Nullable
   private class00143 L;
   private class07209 u;
   private final boolean i;
   private final List<class07209> R = Lists.newArrayList();
   private final int M;
   private final BooleanSupplier B;

   @Override
   public void L() {
      this.N.f().N(this.L, this.y);
   }

   private void M() {
      if (this.R.size() > 15) {
         this.R.remove(0);
      }
   }

   public class07954(class07475 var1, double var2, boolean var4, int var5, BooleanSupplier var6) {
      super();
      this.N = var1;
      this.y = var2;
      this.i = var4;
      this.M = var5;
      this.B = var6;
      this.N_71(EnumSet.of(class07430.field_18405));
      if (!class05459.N(var1)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public void u() {
      if (this.N.f().U() || this.u.method_19769(this.N.method_73189(), this.M)) {
         this.R.add(this.u);
      }
   }

   @Override
   public boolean y() {
      return this.N.f().U() ? false : !this.u.method_19769(this.N.method_73189(), this.N.method_17681() + this.M);
   }

   private boolean N(class07209 var1) {
      for (class07209 class07209 : this.R) {
         if (Objects.equals(var1, class07209)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean N() {
      if (!class05459.N(this.N)) {
         return false;
      } else {
         this.M();
         if (this.i && this.N.method_73183().method_8530()) {
            return false;
         } else {
            class04782 class04782 = (class04782)this.N.method_73183();
            class07209 class07209x = this.N.method_24515();
            if (!class04782.method_19497(class07209x, 6)) {
               return false;
            } else {
               class06889 class06889x = class05456.N(
                  this.N,
                  15,
                  7,
                  var3x -> !class04782.method_19500(var3x)
                     ? Double.NEGATIVE_INFINITY
                     : class04782.method_19494()
                        .u(var0 -> var0.N(class03949.y), this::N, var3x, 10, class05372.field_18488)
                        .map(var1xx -> -var1xx.method_10262(class07209x))
                        .orElse(Double.NEGATIVE_INFINITY)
               );
               if (class06889x == null) {
                  return false;
               } else {
                  Optional optional = class04782.method_19494()
                     .u(var0 -> var0.N(class03949.y), this::N, class07209.method_49638(class06889x), 10, class05372.field_18488);
                  if (optional.isEmpty()) {
                     return false;
                  } else {
                     this.u = ((class07209)optional.get()).method_10062();
                     class07623 class07623 = this.N.f();
                     class07623.y(this.B.getAsBoolean());
                     this.L = class07623.N(this.u, 0);
                     class07623.y(true);
                     if (this.L == null) {
                        class06889 class06889x = class05475.N(this.N, 10, 7, class06889.L(this.u), (float) (Math.PI / 2));
                        if (class06889x == null) {
                           return false;
                        }

                        class07623.y(this.B.getAsBoolean());
                        this.L = this.N.f().N(class06889x.M, class06889x.B, class06889x.Z, 0);
                        class07623.y(true);
                        if (this.L == null) {
                           return false;
                        }
                     }

                     for (int ix = 0; ix < this.L.i(); ix++) {
                        class01763 class01763 = this.L.N(ix);
                        class07209 class07209x = new class07209(class01763.N, class01763.y + 1, class01763.L);
                        if (class07196.N(this.N.method_73183(), class07209x)) {
                           this.L = this.N.f().N((double)class01763.N, (double)class01763.y, (double)class01763.L, 0);
                           break;
                        }
                     }

                     return this.L != null;
                  }
               }
            }
         }
      }
   }
}
