package minecraft;

import java.util.Objects;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public class class02189 extends class02840<class07144, class08489, class02132> {
   private static final class01894 N = class05911.l.y().N((UnaryOperator<String>)(var0 -> "textures/" + var0 + ".png"));
   private static final class01894[] i = class05911.d
      .stream()
      .map(var0 -> var0.y().N((UnaryOperator<String>)(var0x -> "textures/" + var0x + ".png")))
      .toArray(class01894[]::new);

   public class02189(class04832 var1) {
      super(var1, new class02132(var1.N(class04802.ui)), 0.0F);
   }

   public class08489 method_55269() {
      return new class08489();
   }

   public class01894 y(class08489 var1) {
      return N(var1.y);
   }

   public class06889 method_23169(class08489 var1) {
      return var1.N;
   }

   protected void y(class08489 var1, class01421 var2, float var3, float var4) {
      super.y(var1, var2, var3 + 180.0F, var4);
      var2.N(var1.R.b().y(), 0.0F, 0.5F, 0.0F);
   }

   public static class01894 N(@Nullable class06563 var0) {
      return var0 == null ? N : i[var0.N()];
   }

   public void method_62354(class07144 var1, class08489 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = Objects.requireNonNullElse(var1.i(var3), class06889.L);
      var2.y = var1.m();
      var2.L = var1.u(var3);
      var2.u = var1.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
      var2.i = var1.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
      var2.R = var1.E();
   }

   public boolean method_3933(class07144 var1, class01383 var2, double var3, double var5, double var7) {
      if (super.method_3933(var1, var2, var3, var5, var7)) {
         return true;
      } else {
         class06889 class06889x = var1.i(0.0F);
         if (class06889x == null) {
            return false;
         } else {
            class07078<?> class07078 = var1.method_5864();
            float f = class07078.U() / 2.0F;
            float f1 = class07078.z() / 2.0F;
            class06889 class06889x = class06889.L(var1.method_24515());
            return var2.method_23093(
               new class00734(class06889x.M, class06889x.B + f, class06889x.Z, class06889x.M, class06889x.B + f, class06889x.Z).L(f1, f, f1)
            );
         }
      }
   }
}
