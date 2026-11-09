package minecraft;

public record class03729<T extends class06521<?>>(class05946<class06521<?>> y, T L) {
   public static final class02362<class04247, class03729<?>> N = class02362.N(
      class05946.y(class04227.yV), class03729::N, class06521.B, class03729::y, class03729::new
   );

   public class03729(class05946<class06521<?>> y, T L) {
      super();
      this.y = y;
      this.L = (T)L;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class03729 class03729 && this.y == class03729.y;
   }

   @Override
   public String toString() {
      return this.y.toString();
   }

   @Override
   public int hashCode() {
      return this.y.hashCode();
   }

   public T y() {
      return this.L;
   }

   public class05946<class06521<?>> N() {
      return this.y;
   }
}
