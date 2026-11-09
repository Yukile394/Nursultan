package minecraft;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class class03734 {
   private final class03711 N;
   @Nullable
   private final class03734 y;
   private final Set<class03734> L = new ReferenceOpenHashSet();

   @Nullable
   public class03734 L() {
      return this.y;
   }

   public class03734(class03711 var1, @Nullable class03734 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class03734 class03734 && this.N.equals(class03734.N);
   }

   @Override
   public String toString() {
      return this.N.N().toString();
   }

   @Override
   public int hashCode() {
      return this.N.hashCode();
   }

   public Iterable<class03734> i() {
      return this.L;
   }

   public class03734 u() {
      return N(this);
   }

   public void y(class03734 var1) {
      this.L.add(var1);
   }

   public class03711 y() {
      return this.N;
   }

   public class07151 N() {
      return this.N.y();
   }

   public static class03734 N(class03734 var0) {
      class03734 class03734x = var0;

      while (true) {
         class03734 class03734x = class03734x.L();
         if (class03734x == null) {
            return class03734x;
         }

         class03734x = class03734x;
      }
   }
}
