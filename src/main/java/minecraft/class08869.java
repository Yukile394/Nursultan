package minecraft;

class class08869 implements class02028 {
   @Override
   public class02012 L() {
      return this.y;
   }

   class08869(class02601 var1, class02012 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public class02601 y() {
      return this.N;
   }

   @Override
   public <T> T N(class02006<T> var1) {
      return (T)var1.y(this);
   }

   @Override
   public class08877 N() {
      throw new IllegalStateException();
   }

   @Override
   public class08529 N(class01894 var1) {
      throw new IllegalStateException("Missing model can't have dependencies, but asked for " + var1);
   }
}
