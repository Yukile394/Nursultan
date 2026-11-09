package minecraft;

import org.jspecify.annotations.Nullable;

public class class00695 extends class07049 {
   public final class00690 N;
   public final String y;
   private final class01325 L;

   @Override
   public class01325 method_18377(class01312 var1) {
      return this.L;
   }

   @Nullable
   @Override
   public class06584 method_31480() {
      return this.N.method_31480();
   }

   @Override
   public boolean method_31746() {
      return false;
   }

   @Override
   public class00381<class07280> method_18002(class01599 var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   protected void method_5693(class04293 var1) {
   }

   @Override
   public final boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return this.method_64421(var2) ? false : this.N.N(var1, this, var2, var3);
   }

   @Override
   protected void method_5652(class08329 var1) {
   }

   @Override
   public boolean method_5863() {
      return true;
   }

   @Override
   protected void method_5749(class08299 var1) {
   }

   @Override
   public boolean method_5779(class07049 var1) {
      return this == var1 || this.N == var1;
   }

   public class00695(class00690 var1, String var2, float var3, float var4) {
      super(var1.method_5864(), var1.method_73183());
      this.L = class01325.y(var3, var4);
      this.method_18382();
      this.N = var1;
      this.y = var2;
   }
}
