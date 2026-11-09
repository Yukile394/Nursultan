package minecraft;

import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class class00710 extends class02901 {
   private static final class02131<class07211> N = class03289.N(class00710.class, class02154.T);
   private static final class07211 L = class07211.field_11035;

   protected class00734 L() {
      return this.method_5829().N(this.method_5735().B().mul(-0.5F)).B(1.0E-7);
   }

   @Override
   public float method_5832(class06993 var1) {
      class07211 class07211 = this.method_5735();
      if (class07211.z() != class07185.field_11052) {
         switch (var1) {
            case field_11464:
               class07211 = class07211.b();
               break;
            case field_11465:
               class07211 = class07211.M();
               break;
            case field_11463:
               class07211 = class07211.R();
         }

         this.y(class07211);
      }

      float f = class04995.R(this.method_36454());

      return switch (var1) {
         case field_11464 -> f + 180.0F;
         case field_11465 -> f + 90.0F;
         case field_11463 -> f + 270.0F;
         default -> f;
      };
   }

   @Override
   public class07211 method_5735() {
      return this.field_6011.N(N);
   }

   @Override
   public float method_5763(class07111 var1) {
      return this.method_5832(var1.N(this.method_5735()));
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (var1.equals(N)) {
         this.y(this.method_5735());
      }
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(N, L);
   }

   @Override
   public class00717 method_5699(class04782 var1, class06584 var2, float var3) {
      class00717 class00717 = new class00717(
         this.method_73183(),
         this.method_23317() + this.method_5735().P() * 0.15F,
         this.method_23318() + var3,
         this.method_23321() + this.method_5735().T() * 0.15F,
         var2
      );
      class00717.L();
      this.method_73183().method_8649(class00717);
      return class00717;
   }

   protected class00710(class07078<? extends class00710> var1, class07299 var2) {
      super(var1, var2);
   }

   protected class00710(class07078<? extends class00710> var1, class07299 var2, class07209 var3) {
      this(var1, var2);
      this.y = var3;
   }

   public abstract void i();

   protected class00734 u() {
      return this.method_5829();
   }

   protected void y(class07211 var1) {
      Objects.requireNonNull(var1);
      Validate.isTrue(var1.z().L());
      this.N(var1);
      this.method_36456(var1.u() * 90);
      this.field_5982 = this.method_36454();
      this.N();
   }

   @Override
   public boolean y() {
      return this.N(this.u()) ? false : class07209.method_29715(this.L()).allMatch(var1 -> {
         class00500 class00500 = this.method_73183().method_8320(var1);
         return class00500.B() || class06781.E(class00500);
      }) && this.N(false);
   }

   protected abstract class00734 N(class07209 var1, class07211 var2);

   protected boolean N(boolean var1) {
      Predicate predicate = var2x -> {
         boolean flag = !var1 && var2x.method_5864() == this.method_5864();
         boolean flag1 = var2x.method_5735() == this.method_5735();
         return var2x != this && (flag || flag1);
      };
      return !this.method_73183().method_74143(class01128.N(class00710.class), this.u(), predicate);
   }

   protected boolean N(class00734 var1) {
      class07299 class07299 = this.method_73183();
      return !class07299.a_(this, var1) || !class07299.L(this, var1);
   }

   @Override
   protected void N() {
      if (this.method_5735() != null) {
         class00734 class00734 = this.N(this.y, this.method_5735());
         class06889 class06889 = class00734.R();
         this.method_23327(class06889.M, class06889.B, class06889.Z);
         this.method_5857(class00734);
      }
   }

   protected void N(class07211 var1) {
      this.field_6011.N(N, var1);
   }
}
