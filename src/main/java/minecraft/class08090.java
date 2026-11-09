package minecraft;

import org.jspecify.annotations.Nullable;

public class class08090 implements class00381<class07280> {
   public static final class02362<class00667, class08090> N = class00381.N(class08090::N, class08090::new);
   private static final int y = 1;
   private static final int L = 2;
   @Nullable
   private final class01894 u;
   @Nullable
   private final class04911 i;

   public class08090(@Nullable class01894 var1, @Nullable class04911 var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   private class08090(class00667 var1) {
      super();
      byte b0 = var1.readByte();
      if ((b0 & 1) > 0) {
         this.i = var1.y(class04911.class);
      } else {
         this.i = null;
      }

      if ((b0 & 2) > 0) {
         this.u = var1.T();
      } else {
         this.u = null;
      }
   }

   @Nullable
   public class04911 y() {
      return this.i;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Nullable
   public class01894 N() {
      return this.u;
   }

   private void N(class00667 var1) {
      if (this.i != null) {
         if (this.u != null) {
            var1.writeByte(3);
            var1.N((Enum<?>)this.i);
            var1.N(this.u);
         } else {
            var1.writeByte(1);
            var1.N((Enum<?>)this.i);
         }
      } else if (this.u != null) {
         var1.writeByte(2);
         var1.N(this.u);
      } else {
         var1.writeByte(0);
      }
   }

   @Override
   public class02897<class08090> method_65080() {
      return class04248.yu;
   }
}
