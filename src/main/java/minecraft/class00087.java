package minecraft;

import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;
import org.joml.Vector3ic;

public record class00087(Vector3ic value) implements class00069 {
   public static final Codec<class00087> y = class06338.R.xmap(class00087::new, class00087::y);

   public class00087(Vector3ic value) {
      this.value = value;
   }

   public Vector3ic y() {
      return this.value;
   }

   @Override
   public void N(Std140SizeCalculator var1) {
      var1.putIVec3();
   }

   @Override
   public void N(Std140Builder var1) {
      var1.putIVec3(this.value);
   }

   @Override
   public class00051 N() {
      return class00051.field_60136;
   }
}
