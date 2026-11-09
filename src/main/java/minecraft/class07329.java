package minecraft;

import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class07329 implements class05857 {
   final class04493 N;
   final class06584 y;
   final String L;
   final class03762 u;
   final boolean i;
   @Nullable
   private class02754 Z;

   @Override
   public boolean L() {
      return this.i;
   }

   public int M() {
      return this.N.N();
   }

   public class07329(String var1, class03762 var2, class04493 var3, class06584 var4, boolean var5) {
      super();
      this.L = var1;
      this.u = var2;
      this.N = var3;
      this.y = var4;
      this.i = var5;
   }

   public class07329(String var1, class03762 var2, class04493 var3, class06584 var4) {
      this(var1, var2, var3, var4, true);
   }

   public int B() {
      return this.N.y();
   }

   @Override
   public String y() {
      return this.L;
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      return this.y.t();
   }

   @Override
   public List<class00265> N() {
      return List.of(
         new class00326(
            this.N.N(),
            this.N.y(),
            this.N.L().stream().map(var0 -> var0.map(class06510::method_64673).orElse(class00307.L)).toList(),
            new class00302(this.y),
            new class00330(class06570.Rn)
         )
      );
   }

   public boolean method_8115(class02903 var1, class07299 var2) {
      return this.N.N(var1);
   }

   @Override
   public class06514<? extends class07329> method_8119() {
      return class06514.y;
   }

   @Override
   public class02754 method_61671() {
      if (this.Z == null) {
         this.Z = class02754.N(this.N.L());
      }

      return this.Z;
   }

   @Override
   public class03762 method_45441() {
      return this.u;
   }

   public List<Optional<class06510>> R() {
      return this.N.L();
   }
}
