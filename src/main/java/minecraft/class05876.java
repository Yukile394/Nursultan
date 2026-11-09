package minecraft;

import java.util.Objects;

public class class05876 extends class05671 implements class05868<class05856> {
   private static final int z = 4;
   private static final int U = 98;
   private static final class00392 E = class00392.L("lectern.take_book");
   private final class05856 W;
   private final class07508 m = new class05839(this);

   private void L(int var1) {
      ((class03443)this.field_22787.T_2).N(this.W.b, var1);
   }

   @Override
   protected void L() {
      this.L(1);
   }

   public class05876(class05856 var1, class08044 var2, class00392 var3) {
      super();
      this.W = var1;
   }

   public class05856 E() {
      return this.W;
   }

   @Override
   void U() {
      this.N(this.W.W());
   }

   void z() {
      class06584 class06584 = this.W.E();
      this.N(Objects.requireNonNullElse(class06241.N(class06584), class05671.u));
   }

   @Override
   protected void u() {
      this.L(2);
   }

   @Override
   protected boolean y(int var1) {
      if (var1 != this.W.W()) {
         this.L(100 + var1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void N() {
      if (((class04453)this.field_22787.T_4).method_7294()) {
         int i = this.i();
         int j = this.field_22789 / 2;
         this.method_37063(class05362.method_46430(class05220.u, var1x -> this.method_25419()).N(j - 98 - 2, i).N(98).N());
         this.method_37063(class05362.method_46430(E, var1x -> this.L(3)).N(j + 2, i).N(98).N());
      } else {
         super.N();
      }
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.W.N(this.m);
   }

   @Override
   public void method_25432() {
      super.method_25432();
      this.W.y(this.m);
   }

   @Override
   public void method_25419() {
      ((class04453)this.field_22787.T_4).method_7346();
      super.method_25419();
   }

   @Override
   public boolean method_25421() {
      return false;
   }

   @Override
   protected void R() {
      ((class04453)this.field_22787.T_4).method_7346();
   }
}
