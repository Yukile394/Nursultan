package minecraft;

import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;

public record class00079(int value) implements class00069 {
   public static final Codec<class00079> y = Codec.INT.xmap(class00079::new, class00079::y);

   public class00079(int value) {
      super();
      this.value = value;
   }

   public int y() {
      return this.value;
   }

   @Override
   public void N(Std140SizeCalculator var1) {
      var1.putInt();
   }

   @Override
   public void N(Std140Builder var1) {
      var1.putInt(this.value);
   }

   @Override
   public class00051 N() {
      return class00051.field_60135;
   }
}
