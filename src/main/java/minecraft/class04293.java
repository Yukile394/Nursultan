package minecraft;

public class class04293 {
   private final class02273 N;
   private final class04016<?>[] y;

   public class04293(class02273 var1) {
      super();
      this.N = var1;
      this.y = new class04016[class03289.N.y(var1.getClass())];
   }

   public <T> class04293 N(class02131<T> var1, T var2) {
      int i = var1.N();
      if (i > this.y.length) {
         throw new IllegalArgumentException("Data value id is too big with " + i + "! (Max is " + this.y.length + ")");
      } else if (this.y[i] != null) {
         throw new IllegalArgumentException("Duplicate id value for " + i + "!");
      } else if (class02154.y(var1.y()) < 0) {
         throw new IllegalArgumentException("Unregistered serializer " + var1.y() + " for " + i + "!");
      } else {
         this.y[var1.N()] = new class04016<>(var1, var2);
         return this;
      }
   }

   public class03289 N() {
      for (int i = 0; i < this.y.length; i++) {
         if (this.y[i] == null) {
            throw new IllegalStateException("Entity " + this.N.getClass() + " has not defined synched data value " + i);
         }
      }

      return new class03289(this.N, this.y);
   }
}
