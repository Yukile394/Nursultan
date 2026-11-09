package minecraft;

import org.jspecify.annotations.Nullable;

public class class06940 extends class07075 {
   @Nullable
   private class07281 y;

   public class06940() {
      super(27);
   }

   public void y(class08294<class08332> var1) {
      for (int i = 0; i < this.method_5439(); i++) {
         class06584 class06584 = this.method_5438(i);
         if (!class06584.R()) {
            var1.N(new class08332(i, class06584));
         }
      }
   }

   public void y(class08310<class08332> var1) {
      for (int i = 0; i < this.method_5439(); i++) {
         this.method_5447(i, class06584.E);
      }

      for (class08332 class08332 : var1) {
         if (class08332.N(this.method_5439())) {
            this.method_5447(class08332.N(), class08332.y());
         }
      }
   }

   public boolean y(class07281 var1) {
      return this.y == var1;
   }

   public void N(class07281 var1) {
      this.y = var1;
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return this.y != null && !this.y.N(var1) ? false : super.method_5443(var1);
   }

   @Override
   public void method_5432(class08978 var1) {
      if (this.y != null) {
         this.y.y(var1);
      }

      super.method_5432(var1);
      this.y = null;
   }

   @Override
   public void method_5435(class08978 var1) {
      if (this.y != null) {
         this.y.N(var1);
      }

      super.method_5435(var1);
   }
}
