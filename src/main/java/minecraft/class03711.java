package minecraft;

import java.util.List;

public record class03711(class01894 L, class07151 u) {
   public static final class02362<class04247, class03711> N = class02362.N(class01894.y, class03711::N, class07151.y, class03711::y, class03711::new);
   public static final class02362<class04247, List<class03711>> y = N.N_33(class02389.N());

   public class03711(class01894 L, class07151 u) {
      this.L = L;
      this.u = u;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class03711 class03711 && this.L.equals(class03711.L);
   }

   @Override
   public String toString() {
      return this.L.toString();
   }

   @Override
   public int hashCode() {
      return this.L.hashCode();
   }

   public class07151 y() {
      return this.u;
   }

   public class01894 N() {
      return this.L;
   }
}
