package minecraft;

import org.jspecify.annotations.Nullable;

record class01740(class00743<class06584> key, int width, int height, class03729<class05857> value) {
   public int L() {
      return this.height;
   }

   class01740(class00743<class06584> key, int width, int height, @Nullable class03729<class05857> value) {
      this.key = key;
      this.width = width;
      this.height = height;
      this.value = value;
   }

   @Nullable
   public class03729<class05857> u() {
      return this.value;
   }

   public int y() {
      return this.width;
   }

   public boolean N(class02903 var1) {
      if (this.width == var1.R() && this.height == var1.M()) {
         for (int i = 0; i < this.key.size(); i++) {
            if (!class06584.L(this.key.get(i), var1.N(i))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public class00743<class06584> N() {
      return this.key;
   }
}
