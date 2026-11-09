package minecraft;

import java.util.Locale;

public class class05112 extends class05407 {
   private static final class00392 L = class00392.L("mco.backup.info.title");
   private static final class00392 u = class00392.L("mco.backup.unknown");
   private final class05096 i;
   final class04948 N;
   final class03686 y = new class03686(this);
   private class05115 R;

   private class00392 L(String var1) {
      try {
         return class04969.valueOf(var1.toUpperCase(Locale.ROOT)).N();
      } catch (Exception exception) {
         return class04969.field_63822.N();
      }
   }

   public class05112(class05096 var1, class04948 var2) {
      super(L);
      this.i = var1;
      this.N = var2;
   }

   private class00392 y(String var1) {
      try {
         return class04723.y.get(Integer.parseInt(var1)).u();
      } catch (Exception exception) {
         return u;
      }
   }

   private class00392 N(String var1) {
      try {
         return class04723.N.get(Integer.parseInt(var1)).y();
      } catch (Exception exception) {
         return u;
      }
   }

   class00392 N(String var1, String var2) {
      String s = var1.toLowerCase(Locale.ROOT);
      if (s.contains("game") && s.contains("mode")) {
         return this.y(var2);
      } else if (s.contains("game") && s.contains("difficulty")) {
         return this.N(var2);
      } else {
         return (class00392)(var1.equals("world_type") ? this.L(var2) : class00392.y(var2));
      }
   }

   @Override
   public void method_25426() {
      this.y.N(L, this.field_22793);
      this.R = this.y.L(new class05115(this, this.field_22787));
      this.y.y(class05362.method_46430(class05220.U, var1 -> this.method_25419()).N());
      this.method_48640();
      this.y.method_48206(var1 -> {
         class06478 class06478 = this.method_37063(var1);
      });
   }

   @Override
   public void method_48640() {
      this.R.method_57712(this.field_22789, this.y);
      this.y.N();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.i);
   }
}
