package minecraft;

import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;

public record class00076(float value) implements class00069 {
   public static final Codec<class00076> y = Codec.FLOAT.xmap(class00076::new, class00076::y);

   public class00076(float value) {
      super();
      this.value = value;
   }

   public float y() {
      return this.value;
   }

   @Override
   public void N(Std140SizeCalculator var1) {
      var1.putFloat();
   }

   @Override
   public void N(Std140Builder var1) {
      var1.putFloat(this.value);
   }

   @Override
   public class00051 N() {
      return class00051.field_60137;
   }
}
