package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class00676 extends class07049 {
   private static final class02131<Optional<class07209>> y = class03289.N(class00676.class, class02154.s);
   private static final class02131<Boolean> L = class03289.N(class00676.class, class02154.U);
   private static final boolean u = true;
   public int N;

   @Override
   public class06584 method_31480() {
      return new class06584(class06570.ln);
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(y, Optional.empty());
      var1.N(L, true);
   }

   @Override
   public void method_5768(class04782 var1) {
      this.N(var1, this.method_48923().s());
      super.method_5768(var1);
   }

   @Override
   public void method_5773() {
      this.N++;
      this.method_61409();
      this.method_60698();
      if (this.method_73183() instanceof class04782) {
         class07209 class07209 = this.method_24515();
         if (((class04782)this.method_73183()).method_29198() != null && this.method_73183().method_8320(class07209).P()) {
            this.method_73183().method_8501(class07209, class05989.y(this.method_73183(), class07209));
         }
      }
   }

   @Override
   public final boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_64421(var2)) {
         return false;
      } else if (var2.u() instanceof class00690) {
         return false;
      } else {
         if (!this.method_31481()) {
            this.method_5650(class07062.field_26998);
            if (!var2.N(class03696.E)) {
               class07072 class07072 = var2.u() != null ? this.method_48923().u(this, var2.u()) : null;
               var1.method_55117(this, class07072, null, this.method_23317(), this.method_23318(), this.method_23321(), 6.0F, false, class07328.field_40889);
            }

            this.N(var1, var2);
         }

         return true;
      }
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28630;
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.y("beam_target", class07209.field_25064, this.N());
      var1.N("ShowBottom", this.y());
   }

   @Override
   public boolean method_5863() {
      return true;
   }

   @Override
   public boolean method_5640(double var1) {
      return super.method_5640(var1) || this.N() != null;
   }

   @Override
   public final boolean method_5643(class07072 var1) {
      return this.method_64421(var1) ? false : !(var1.u() instanceof class00690);
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.N(var1.<class07209>N("beam_target", class07209.field_25064).orElse(null));
      this.N(var1.N("ShowBottom", true));
   }

   public class00676(class07078<? extends class00676> var1, class07299 var2) {
      super(var1, var2);
      this.field_23807 = true;
      this.N = this.field_5974.y(100000);
   }

   public class00676(class07299 var1, double var2, double var4, double var6) {
      this(class07078.S, var1);
      this.method_5814(var2, var4, var6);
   }

   public boolean y() {
      return this.method_5841().N(L);
   }

   private void N(class04782 var1, class07072 var2) {
      class07856 class07856 = var1.method_29198();
      if (class07856 != null) {
         class07856.N(this, var2);
      }
   }

   public void N(@Nullable class07209 var1) {
      this.method_5841().N(y, Optional.ofNullable(var1));
   }

   @Nullable
   public class07209 N() {
      return this.method_5841().N(y).orElse(null);
   }

   public void N(boolean var1) {
      this.method_5841().N(L, var1);
   }
}
