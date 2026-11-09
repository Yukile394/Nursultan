package minecraft;

import java.util.function.Predicate;

public abstract class class07150 extends class07475 implements class07542 {
   protected void w() {
      if (this.method_5718() > 0.5F) {
         super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 + 2;
      }
   }

   public static boolean L(class07078<? extends class07079> var0, class01001 var1, class06113 var2, class07209 var3, class06069 var4) {
      return y(var0, var1, var2, var3, var4) && (class06113.N(var2) || var1.N_17(var3));
   }

   public static boolean L(class07078<? extends class07150> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.y() != class07086.field_5801 && y(var0, var1, var2, var3, var4);
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15251;
   }

   @Override
   protected class04891 method_5737() {
      return class04909.PD;
   }

   @Override
   protected class04891 method_5625() {
      return class04909.Px;
   }

   public class07150(class07078<? extends class07150> var1, class07299 var2) {
      super(var1, var2);
      this.J = 5;
   }

   public static boolean y(class07078<? extends class07079> var0, class01001 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.y() != class07086.field_5801 && (class06113.y(var2) || N(var1, var3, var4)) && y(var0, var1, var2, var3, var4);
   }

   public boolean N(class04782 var1, class08036 var2) {
      return true;
   }

   public static boolean N(class01001 var0, class07209 var1, class06069 var2) {
      if (var0.method_8314(class00772.field_9284, var1) > var2.y(32)) {
         return false;
      } else {
         class07376 class07376 = var0.method_8597();
         int i = class07376.y();
         return i < 15 && var0.method_8314(class00772.field_9282, var1) > i
            ? false
            : (var0.method_8410().method_8546() ? var0.N(var1, 10) : var0.U(var1)) <= class07376.N().N(var2);
      }
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return -var2.B(var1);
   }

   public static class05300 Y() {
      return class07079.H().N(class05298.u);
   }

   @Override
   public class06584 method_18808(class06584 var1) {
      if (var1.B() instanceof class06577) {
         Predicate<class06584> predicate = ((class06577)var1.B()).L();
         class06584 class06584 = class06577.N(this, predicate);
         return class06584.R() ? new class06584(class06570.sD) : class06584;
      } else {
         return class06584.E;
      }
   }

   @Override
   public class04891 method_6002() {
      return class04909.Pf;
   }

   @Override
   public boolean method_27071(class04782 var1) {
      return var1.method_64395().N(class07305.O);
   }

   @Override
   public void method_6007() {
      this.method_6119();
      this.w();
      super.method_6007();
   }

   @Override
   public boolean method_6054() {
      return true;
   }

   @Override
   public class07443 method_39760() {
      return new class07443(class04909.PS, class04909.PA);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.PC;
   }
}
