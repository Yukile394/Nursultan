package minecraft;

import org.jspecify.annotations.Nullable;

class class01750<T> implements class01744<T> {
   class01750(class01752 var1, class03099 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public class03099 y() {
      return this.y;
   }

   @Override
   public void N(class01742<T> var1) {
      this.N.N(new class01714<>(this.y, var1));
   }

   @Nullable
   @Override
   public class01704 N() {
      return this.N.y();
   }

   @Override
   public void N(@Nullable class01704 var1) {
      this.N.N(var1);
   }
}
