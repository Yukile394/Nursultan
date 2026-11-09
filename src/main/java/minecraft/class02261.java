package minecraft;

import org.jspecify.annotations.Nullable;

public class class02261 extends class00394 {
   private final class02296 N = new class02296();
   private final class02274 y = new class02274();
   private final class02264 L = new class02264();
   private class02281 u = class02281.y;

   public class02274 L() {
      return this.y;
   }

   public class02261(class07209 var1, class00500 var2) {
      super(class00404.field_48859, var1, var2);
   }

   @Nullable
   @Override
   public class00381<class07280> i() {
      return class07269.N(this);
   }

   public class02264 u() {
      return this.L;
   }

   public void N(class02281 var1) {
      this.u = var1;
   }

   @Override
   public class07001 N(class01929 var1) {
      return class07536.N(new class07001(), var2 -> var2.N("shared_data", class02274.y, var1.N(class07713.N), this.y));
   }

   @Nullable
   public class02296 N() {
      return this.z != null && !this.z.method_8608() ? this.N : null;
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      var1.<class02296>N("server_data", class02296.y).ifPresent(this.N::N);
      this.u = var1.<class02281>N("config", class02281.L).orElse(class02281.y);
      var1.<class02274>N("shared_data", class02274.y).ifPresent(this.y::N);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("config", class02281.L, this.u);
      var1.N("shared_data", class02274.y, this.y);
      var1.N("server_data", class02296.y, this.N);
   }

   public class02281 R() {
      return this.u;
   }
}
