package minecraft;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public final class class04357<N> extends class05396 implements class06744 {
   private final class04370<N> y;
   private final class04352<N> L;
   private final class04355<N> u;
   private final Consumer<N> i;
   @Nullable
   private Long R;
   private final boolean M;

   class04357(
      class05630 var1, int var2, int var3, int var4, int var5, class04370<N> var6, class04352<N> var7, class04355<N> var8, Consumer<N> var9, boolean var10
   ) {
      super(var1, var2, var3, var4, var5, var7.N(var6.method_41753()));
      this.y = var6;
      this.L = var7;
      this.u = var8;
      this.i = var9;
      this.M = var10;
      this.method_25346();
   }

   public void y() {
      Object object = this.L.N(this.field_22753);
      if (!Objects.equals(object, this.y.method_41753())) {
         this.y.method_41748((N)object);
         this.i.accept(this.y.method_41753());
      }
   }

   @Override
   public void N() {
      if (this.field_22753 != this.L.N(this.y.method_41753())) {
         this.field_22753 = this.L.N(this.y.method_41753());
         this.R = null;
         this.method_25346();
      }
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.L()) {
         this.field_41796 = !this.field_41796;
         return true;
      } else {
         if (this.field_41796) {
            boolean flag = var1.R();
            boolean flag1 = var1.M();
            if (flag) {
               Optional optional = this.L.L(this.L.N(this.field_22753));
               if (optional.isPresent()) {
                  this.method_25347(this.L.N((N)optional.get()));
                  return true;
               }
            }

            if (flag1) {
               Optional optional1 = this.L.y(this.L.N(this.field_22753));
               if (optional1.isPresent()) {
                  this.method_25347(this.L.N((N)optional1.get()));
                  return true;
               }
            }

            if (flag || flag1) {
               float f = flag ? -1.0F : 1.0F;
               this.method_25347(this.field_22753 + f / (this.field_22758 - 8));
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void method_25344() {
      if (this.M) {
         this.y();
      } else {
         this.R = class07536.L() + 600L;
      }
   }

   @Override
   protected void method_25346() {
      this.method_25355(this.y.field_37864.apply(this.L.N(this.field_22753)));
      this.method_47400(this.u.apply(this.L.N(this.field_22753)));
   }

   @Override
   public void method_25357(class06613 var1) {
      super.method_25357(var1);
      if (this.M) {
         this.N();
      }
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      super.method_48579(var1, var2, var3, var4);
      if (this.R != null && class07536.L() >= this.R) {
         this.R = null;
         this.y();
         this.N();
      }
   }
}
