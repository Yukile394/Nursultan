package minecraft;

public class class07480 extends class07504 {
   static final class02131<String> y = class03289.N(class07480.class, class02154.i);
   static final class02131<class00392> L = class03289.N(class07480.class, class02154.R);
   private final class07327 u = new class07496(this);
   private static final int B = 4;
   private int Z;

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (L.equals(var1)) {
         try {
            this.u.y(this.method_5841().N(L));
         } catch (Throwable throwable) {
         }
      } else if (y.equals(var1)) {
         this.u.N(this.method_5841().N(y));
      }
   }

   @Override
   public class06584 method_31480() {
      return new class06584(class06570.ly);
   }

   @Override
   protected void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(y, "");
      var1.N(L, class05220.N);
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      this.u.N(var1);
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      if (!var1.method_7338()) {
         return class07082.i;
      } else {
         if (var1.method_73183().method_8608()) {
            var1.method_7257(this);
         }

         return class07082.N;
      }
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.u.N(var1);
      this.method_5841().N(y, this.U().u());
      this.method_5841().N(L, this.U().L());
   }

   public class07480(class07078<? extends class07480> var1, class07299 var2) {
      super(var1, var2);
   }

   public class07327 U() {
      return this.u;
   }

   @Override
   protected class06581 z() {
      return class06570.sZ;
   }

   @Override
   public void N(class04782 var1, int var2, int var3, int var4, boolean var5) {
      if (var5 && this.field_6012 - this.Z >= 4) {
         this.U().y(var1);
         this.Z = this.field_6012;
      }
   }

   @Override
   public class00500 R() {
      return class00869.MQ.W();
   }
}
