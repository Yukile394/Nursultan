package minecraft;

import org.jspecify.annotations.Nullable;

class class00075 extends class05699<class00075> {
   final class08302 N;
   private final class00392 L;

   public class00075(class00048 var1, @Nullable class00050 var2, class00082 var3) {
      this(var1, new class08302(var2, var3));
   }

   public class00075(class00048 var1, class08302 var2) {
      super();
      this.y = var1;
      this.N = var2;
      if (var2.N() == class00050.field_60228) {
         if (var2.y() != null) {
            this.L = class00392.L(var2.y().field_60201);
         } else {
            this.L = class00392.i();
         }
      } else {
         this.L = class00392.L(var2.N().field_60231);
      }
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.L()) {
         this.y.method_25354(class00048.y(this.y).Nr());
         this.y.N.N();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      this.y.method_25313(this);
      if (var2) {
         this.y.method_25354(class00048.N(this.y).Nr());
         this.y.N.N();
         return true;
      } else {
         return super.method_25402(var1, var2);
      }
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      var1.y(class00089.y(this.y.N), this.L, this.method_73380() + 5, this.method_73382() + 2, -1);
      if (this.N.y() != null && this.y.N.N.containsKey(this.N.y())) {
         class00073 class00073 = this.y.N.N.getOrDefault(this.N.y(), class00073.field_60237);
         var1.N(class08394.Na, class00073.y(), this.method_73389() - 18, this.method_73382() + 2, 10, 8);
      }
   }

   @Override
   public class00392 method_37006() {
      return class00392.N("narrator.select", this.L);
   }
}
