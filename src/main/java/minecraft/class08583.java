package minecraft;

import org.jspecify.annotations.Nullable;

public class class08583 extends class07652 {
   private static final class02131<class03556<class08403>> N = class03289.N(class08583.class, class02154.d);

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.Na);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, class08577.N(this.method_56673(), class08401.N));
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      class08577.N(var1, this.N());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.Na ? method_66651(var1, this.N()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      class08577.N(var1, class04227.Nr).ifPresent(this::N);
   }

   public class08583(class07078<? extends class08583> var1, class07299 var2) {
      super(var1, var2);
   }

   public void N(class03556<class08403> var1) {
      this.field_6011.N(N, (class03556<class08403>)var1);
   }

   @Nullable
   public class08583 y(class04782 var1, class07077 var2) {
      class08583 class08583x = class07078.J.N(var1, class06113.field_16466);
      if (class08583x != null && var2 instanceof class08583 class08583x) {
         class08583x.N(this.field_5974.Z() ? this.N() : class08583x.N());
      }

      return class08583x;
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class08577.N(class08579.N(var1, this.method_24515()), class04227.Nr).ifPresent(this::N);
      return super.N(var1, var2, var3, var4);
   }

   public class03556<class08403> N() {
      return this.field_6011.N(N);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.Na) {
         this.N(method_66651(class02484.Na, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }
}
