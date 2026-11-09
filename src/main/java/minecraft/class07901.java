package minecraft;

import Nursultan.class10845;
import org.jspecify.annotations.Nullable;

public class class07901 extends class07862 {
   private static final class02131<Integer> f = class03289.N(class07901.class, class02154.y);
   private static final class01325 C = class07078.NT.E().N(class03810.N().N(class03831.field_47743, 0.0F, class07078.NT.U() + 0.125F, 0.0F)).N(0.5F);
   private static final int S = 0;

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.Nf);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(f, 0);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Variant", this.l());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.Nf ? method_66651(var1, this.W()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.E(var1.N("Variant", 0));
   }

   public class07901(class07078<? extends class07901> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_5, -1.0F);
      this.N(class04425.field_17, -1.0F);
   }

   @Override
   protected class04891 s() {
      return class04909.Pg;
   }

   private int l() {
      return this.field_6011.N(f);
   }

   public class05325 v() {
      return class05325.N((this.l() & 0xFF00) >> 8);
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      if (var2 instanceof class07884) {
         class07896 class07896 = class07078.Ne.N(var1, class06113.field_16466);
         if (class07896 != null) {
            this.N(var2, class07896);
         }

         return class07896;
      } else {
         class07901 class07901x = (class07901)var2;
         class07901 class07901x = class07078.NT.N(var1, class06113.field_16466);
         if (class07901x != null) {
            int i = this.field_5974.y(9);
            class05289 class05289;
            if (i < 4) {
               class05289 = this.W();
            } else if (i < 8) {
               class05289 = class07901x.W();
            } else {
               class05289 = class07536.N((class05289[])class05289.values(), this.field_5974);
            }

            int j = this.field_5974.y(5);
            class05325 class05325;
            if (j < 2) {
               class05325 = this.v();
            } else if (j < 4) {
               class05325 = class07901x.v();
            } else {
               class05325 = class07536.N((class05325[])class05325.values(), this.field_5974);
            }

            class07901x.N(class05289, class05325);
            this.N(var2, class07901x);
         }

         return class07901x;
      }
   }

   private void E(int var1) {
      this.field_6011.N(f, var1);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      class05289 class05289;
      if (var4 instanceof class10845) {
         class05289 = ((class10845)var4).N;
      } else {
         class05289 = class07536.N((class05289[])class05289.values(), class06069);
         var4 = new class10845(class05289);
      }

      this.N(class05289, class07536.N((class05325[])class05325.values(), class06069));
      return super.N(var1, var2, var3, (class07446)var4);
   }

   @Override
   protected void N(class07752 var1) {
      super.N(var1);
      if (this.field_5974.y(10) == 0) {
         this.method_5783(class04909.Pq, var1.N() * 0.6F, var1.y());
      }
   }

   @Override
   public boolean N(class07633 var1) {
      if (var1 == this) {
         return false;
      } else {
         return !(var1 instanceof class07884) && !(var1 instanceof class07901) ? false : this.NS() && ((class07862)var1).NS();
      }
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      boolean flag = !this.method_6109() && this.I() && var1.method_21823();
      if (!this.method_5782() && !flag) {
         class06584 class06584 = var1.method_5998(var2);
         if (!class06584.R()) {
            if (this.N(class06584)) {
               return this.y(var1, class06584);
            }

            if (!this.I()) {
               this.NC();
               return class07082.N;
            }
         }

         return super.N(var1, var2);
      } else {
         return super.N(var1, var2);
      }
   }

   private void N(class05289 var1) {
      this.E(var1.N() & 0xFF | this.l() & -256);
   }

   @Override
   protected void N(class06069 var1) {
      this.method_5996(class05298.n).N(N_85(var1::y));
      this.method_5996(class05298.l).N(y(var1::U));
      this.method_5996(class05298.T).N(N(var1::U));
   }

   private void N(class05289 var1, class05325 var2) {
      this.E(var1.N() & 0xFF | var2.N() << 8 & 0xFF00);
   }

   public class05289 W() {
      return class05289.N(this.l() & 0xFF);
   }

   @Override
   protected class04891 G() {
      return class04909.PV;
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.Nf) {
         this.N(method_66651(class02484.Nf, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   public class04891 method_6002() {
      return class04909.PK;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? C : super.method_55694(var1);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.PH;
   }

   @Override
   public void method_6105(class07072 var1, float var2) {
      this.method_57292(var1, var2, new class07085[]{class07085.field_48824});
   }

   @Override
   public boolean method_56991(class07085 var1) {
      return true;
   }

   @Override
   protected class04891 M_() {
      return class04909.PI;
   }
}
