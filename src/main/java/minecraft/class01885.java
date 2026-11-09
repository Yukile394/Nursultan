package minecraft;

import java.util.function.Consumer;

public class class01885 implements class03695 {
   private final class02060 N;
   private final class01855 y;
   private int L = 0;

   public class02072 L() {
      return this.N.L();
   }

   private class01885(class01855 var1) {
      this(0, 0, var1);
   }

   public class01885(int var1, int var2, class01855 var3) {
      super();
      this.N = new class02060(var1, var2);
      this.y = var3;
   }

   public static class01885 i() {
      return new class01885(class01855.field_45403);
   }

   public static class01885 u() {
      return new class01885(class01855.field_45404);
   }

   public class02072 y() {
      return this.N.y();
   }

   public class01885 N(int var1) {
      this.y.N(this.N, var1);
      return this;
   }

   @Override
   public void N(Consumer<class02102> var1) {
      this.N.N(var1);
   }

   @Override
   public void N() {
      this.N.N();
   }

   public <T extends class02102> T N(T var1) {
      return this.N((T)var1, this.y());
   }

   public <T extends class02102> T N(T var1, class02072 var2) {
      return this.y.N(this.N, (T)var1, this.L++, var2);
   }

   public <T extends class02102> T N(T var1, Consumer<class02072> var2) {
      return this.y.N(this.N, (T)var1, this.L++, class07536.N(this.y(), var2));
   }

   @Override
   public int method_46427() {
      return this.N.method_46427();
   }

   @Override
   public void method_46419(int var1) {
      this.N.method_46419(var1);
   }

   @Override
   public int method_46426() {
      return this.N.method_46426();
   }

   @Override
   public void method_46421(int var1) {
      this.N.method_46421(var1);
   }

   @Override
   public int method_25364() {
      return this.N.method_25364();
   }

   @Override
   public int method_25368() {
      return this.N.method_25368();
   }
}
