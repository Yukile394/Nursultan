package minecraft;

public record class02131<T>(int N, class04383<T> y) {
   public class02131(int N, class04383<T> y) {
      super();
      this.N = N;
      this.y = y;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class02131 class02131 = (class02131)var1;
         return this.N == class02131.N;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "<entity data: " + this.N + ">";
   }

   @Override
   public int hashCode() {
      return this.N;
   }
}
