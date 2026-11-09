package minecraft;

import java.util.ArrayList;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class00698 extends class00710 {
   private static final class02131<class03556<class00693>> L = class03289.N(class00698.class, class02154.g);
   public static final float N = 0.0625F;

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (L.equals(var1)) {
         this.N();
      }
   }

   @Override
   public class06889 method_43390() {
      return class06889.N(this.y);
   }

   @Override
   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      this.y(class07211.N(var1.W()));
   }

   @Override
   public class06584 method_31480() {
      return new class06584(class06570.bK);
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.NC);
      super.method_66649(var1);
   }

   @Override
   public class00381<class07280> method_18002(class01599 var1) {
      return new class07276(this, this.method_5735().L(), this.s());
   }

   @Override
   protected void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(L, class08577.y(this.method_56673(), class04227.ym));
   }

   @Override
   public void method_5808(double var1, double var3, double var5, float var7, float var8) {
      this.method_5814(var1, var3, var5);
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.N("facing", class07211.field_57038, this.method_5735());
      super.method_5652(var1);
      class08577.N(var1, this.R());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.NC ? method_66651(var1, this.R()) : super.method_58694(var1);
   }

   @Override
   protected void method_5749(class08299 var1) {
      class07211 class07211 = var1.<class07211>N("facing", class07211.field_57038).orElse(class07211.field_11035);
      super.method_5749(var1);
      this.y(class07211);
      class08577.N(var1, class04227.ym).ifPresent(this::N);
   }

   public class00698(class07078<? extends class00698> var1, class07299 var2) {
      super(var1, var2);
   }

   public class00698(class07299 var1, class07209 var2, class07211 var3, class03556<class00693> var4) {
      this(var1, var2);
      this.N(var4);
      this.y(var3);
   }

   private class00698(class07299 var1, class07209 var2) {
      super(class07078.NF, var1, var2);
   }

   @Override
   public void i() {
      this.method_5783(class04909.nS, 1.0F, 1.0F);
   }

   private static int y(class03556<class00693> var0) {
      return ((class00693)var0.N()).N();
   }

   public static Optional<class00698> N(class07299 var0, class07209 var1, class07211 var2) {
      class00698 class00698 = new class00698(var0, var1);
      ArrayList arraylist = new ArrayList();
      var0.method_30349().L(class04227.ym).u(class04446.N).forEach(arraylist::add);
      if (arraylist.isEmpty()) {
         return Optional.empty();
      } else {
         class00698.y(var2);
         arraylist.removeIf(var1x -> {
            class00698.N((class03556<class00693>)var1x);
            return !class00698.y();
         });
         if (arraylist.isEmpty()) {
            return Optional.empty();
         } else {
            int i = arraylist.stream().mapToInt(class00698::y).max().orElse(0);
            arraylist.removeIf(var1x -> y((class03556<class00693>)var1x) < i);
            Optional optional = class07536.y_9(arraylist, class00698.field_5974);
            if (optional.isEmpty()) {
               return Optional.empty();
            } else {
               class00698.N((class03556<class00693>)optional.get());
               class00698.y(var2);
               return Optional.of(class00698);
            }
         }
      }
   }

   private void N(class03556<class00693> var1) {
      this.field_6011.N(L, (class03556<class00693>)var1);
   }

   @Override
   public void N(class04782 var1, @Nullable class07049 var2) {
      if (var1.method_64395().N(class07305.U)) {
         this.method_5783(class04909.nC, 1.0F, 1.0F);
         if (!(var2 instanceof class08036) || !((class08036)var2).method_56992()) {
            this.method_5706(var1, class06570.bK);
         }
      }
   }

   @Override
   protected class00734 N(class07209 var1, class07211 var2) {
      float f = 0.46875F;
      class06889 class06889x = class06889.y(var1).N(var2, -0.46875);
      class00693 class00693 = this.R().N();
      double d0 = this.N(class00693.y());
      double d1 = this.N(class00693.L());
      class07211 class07211 = var2.M();
      class06889 class06889x = class06889x.N(class07211, d0).N(class07211.field_11036, d1);
      class07185 class07185 = var2.z();
      double d2 = class07185 == class07185.field_11048 ? 0.0625 : class00693.y();
      double d3 = class00693.L();
      double d4 = class07185 == class07185.field_11051 ? 0.0625 : class00693.y();
      return class00734.N(class06889x, d2, d3, d4);
   }

   private double N(int var1) {
      return var1 % 2 == 0 ? 0.5 : 0.0;
   }

   public class03556<class00693> R() {
      return this.field_6011.N(L);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.NC) {
         this.N(method_66651(class02484.NC, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }
}
