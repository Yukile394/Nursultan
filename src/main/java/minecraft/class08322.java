package minecraft;

import net.fabricmc.fabric.mixin.datagen.TagAppenderMixin;

class class08322<T> implements class08292<class05946<T>, T>, TagAppenderMixin {
   class08322(class01225 var1) {
      super();
      this.N = var1;
   }

   @Override
   public class08292<class05946<T>, T> y(class03530<T> var1) {
      this.N.u(var1.y());
      return this;
   }

   public class08292<class05946<T>, T> y(class05946<T> var1) {
      this.N.y(var1.N());
      return this;
   }

   public class08292<class05946<T>, T> N(class05946<T> var1) {
      this.N.N(var1.N());
      return this;
   }

   @Override
   public class08292<class05946<T>, T> N(class03530<T> var1) {
      this.N.L(var1.y());
      return this;
   }

   public class08292 setReplace(boolean var1) {
      this.N.fabric_setReplace(var1);
      return this;
   }

   public class08292 forceAddTag(class03530 var1) {
      this.N.fabric_forceAddTag(var1.y());
      return this;
   }
}
