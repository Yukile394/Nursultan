package minecraft;

import com.mojang.serialization.Codec;

record class02320(class01894 id, Codec<? extends class02339> codec) {
   class02320(class01894 id, Codec<? extends class02339> codec) {
      this.id = id;
      this.codec = codec;
   }

   public Codec<? extends class02339> y() {
      return this.codec;
   }

   public class01894 N() {
      return this.id;
   }
}
