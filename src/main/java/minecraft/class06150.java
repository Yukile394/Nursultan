package minecraft;

import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class06150<T extends class07079> extends class07473 {
   private final T N;
   private final class06584 y;
   private final Predicate<? super T> L;
   @Nullable
   private final class04891 u;

   @Override
   public void L() {
      this.N.method_5673(class07085.field_6173, this.y.t());
      this.N.method_6019(class07050.field_5808);
   }

   public class06150(T var1, class06584 var2, @Nullable class04891 var3, Predicate<? super T> var4) {
      super();
      this.N = (T)var1;
      this.y = var2;
      this.u = var3;
      this.L = var4;
   }

   @Override
   public void u() {
      this.N.method_5673(class07085.field_6173, class06584.E);
      if (this.u != null) {
         this.N.method_5783(this.u, 1.0F, this.N.method_59922().z() * 0.2F + 0.9F);
      }
   }

   @Override
   public boolean y() {
      return this.N.method_6115();
   }

   @Override
   public boolean N() {
      return this.L.test(this.N);
   }
}
