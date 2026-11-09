package minecraft;

import org.jspecify.annotations.Nullable;

public class class07339 implements class00381<class08051> {
   public static final class02362<class00667, class07339> N = class00381.N(class07339::N, class07339::new);
   private final class07349 y;
   @Nullable
   private final class01894 L;

   @Nullable
   public class01894 L() {
      return this.L;
   }

   private class07339(class00667 var1) {
      super();
      this.y = var1.y(class07349.class);
      if (this.y == class07349.field_13024) {
         this.L = var1.T();
      } else {
         this.L = null;
      }
   }

   public class07339(class07349 var1, @Nullable class01894 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public class07349 y() {
      return this.y;
   }

   public static class07339 N(class03711 var0) {
      return new class07339(class07349.field_13024, var0.N());
   }

   private void N(class00667 var1) {
      var1.N((Enum<?>)this.y);
      if (this.y == class07349.field_13024) {
         var1.N(this.L);
      }
   }

   public void method_65081(class08051 var1) {
      var1.method_12058(this);
   }

   public static class07339 N() {
      return new class07339(class07349.field_13023, null);
   }

   @Override
   public class02897<class07339> method_65080() {
      return class04248.LM;
   }
}
