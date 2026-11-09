package minecraft;

public class class04512 extends class00394 implements class04498, class04506 {
   private final class04485 N = this.M();

   public class04485 L() {
      return this.N;
   }

   private class04485 M() {
      class04514 class04514 = class07529.NB ? class04514.L : class04514.N;
      class04488 class04488 = class04488.N;
      return new class04485(class04502.R, this, class04514, class04488);
   }

   public class04512(class07209 var1, class00500 var2) {
      super(class00404.field_47352, var1, var2);
   }

   @Override
   public class04481 u() {
      return !this.w().y(class06665.yO) ? class04481.field_47383 : this.w().L(class06665.yO);
   }

   public class07269 i() {
      return class07269.N(this);
   }

   @Override
   public void N(class07299 var1, class04481 var2) {
      this.method_5431();
      var1.method_8501(this.U, this.w().y(class06665.yO, var2));
   }

   @Override
   public void N(class07078<?> var1, class06069 var2) {
      if (this.z == null) {
         class07536.y("Expected non-null level");
      } else {
         this.N.N(var1, this.z);
         this.method_5431();
      }
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.N.B().N(this.w().L(class04487.y));
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      this.N.N(var1);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.N.N(var1);
      if (this.z != null) {
         this.R();
      }
   }

   @Override
   public void R() {
      this.method_5431();
      if (this.z != null) {
         this.z.method_8413(this.U, this.w(), this.w(), 3);
      }
   }
}
