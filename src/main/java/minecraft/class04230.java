package minecraft;

import java.util.OptionalInt;

public class class04230 extends class03660 {
   private OptionalInt N = OptionalInt.empty();
   private OptionalInt y = OptionalInt.empty();
   private final class03682<class04222, class05482> L;
   private boolean u = false;

   protected int L() {
      return this.method_46427();
   }

   public class04230(class00392 var1, class01590 var2) {
      this(0, 0, var1, var2);
   }

   public class04230(int var1, int var2, class00392 var3, class01590 var4) {
      super(var1, var2, 0, 0, var3, var4);
      this.L = class07536.N(
         var1x -> var1x.L().isPresent() ? class05482.N(var4, var1x.y(), var1x.L().getAsInt(), var1x.N()) : class05482.N(var4, var1x.N(), var1x.y())
      );
      this.field_22763 = false;
   }

   private class04222 u() {
      return new class04222(this.method_25369(), this.N.orElse(Integer.MAX_VALUE), this.y);
   }

   protected int y() {
      return this.method_46426();
   }

   public class04230 y(int var1) {
      this.y = OptionalInt.of(var1);
      return this;
   }

   @Override
   public void N(class00580 var1) {
      class05482 class05482 = this.L.N(this.u());
      int i = this.y();
      int j = this.L();
      byte b0 = 9;
      if (this.u) {
         int k = this.method_46426() + this.method_25368() / 2;
         class05482.N(class00937.field_62010, k, j, b0, var1);
      } else {
         class05482.N(class00937.field_62009, i, j, b0, var1);
      }
   }

   public class04230 N(int var1) {
      this.N = OptionalInt.of(var1);
      return this;
   }

   public class04230 N(boolean var1) {
      this.u = var1;
      return this;
   }

   @Override
   public int method_25364() {
      return this.L.N(this.u()).N() * 9;
   }

   @Override
   public int method_25368() {
      return this.L.N(this.u()).y();
   }
}
