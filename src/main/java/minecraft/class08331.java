package minecraft;

import java.util.function.Function;
import net.fabricmc.fabric.mixin.datagen.TagAppenderMixin;

class class08331<U, T> implements class08292<U, T>, TagAppenderMixin {
   class08331(class08292 var1, class08292 var2, Function var3) {
      super();
      this.N = var2;
      this.y = var3;
   }

   @Override
   public class08292<U, T> y(U var1) {
      this.N.N(this.y.apply(var1));
      return this;
   }

   @Override
   public class08292<U, T> y(class03530<T> var1) {
      this.N.y(var1);
      return this;
   }

   @Override
   public class08292<U, T> N(class03530<T> var1) {
      this.N.N(var1);
      return this;
   }

   @Override
   public class08292<U, T> N(U var1) {
      this.N.N(this.y.apply(var1));
      return this;
   }

   public class08292 setReplace(boolean var1) {
      this.N.setReplace(var1);
      return this;
   }

   public class08292 forceAddTag(class03530 var1) {
      this.N.forceAddTag(var1);
      return this;
   }
}
