package minecraft;

import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;
import org.joml.Vector3fc;

public record class00071(Vector3fc value) implements class00069 {
   public static final Codec<class00071> y = class06338.i.xmap(class00071::new, class00071::y);

   public class00071(Vector3fc value) {
      super();
      this.value = value;
   }

   public Vector3fc y() {
      return this.value;
   }

   @Override
   public void N(Std140SizeCalculator var1) {
      var1.putVec3();
   }

   @Override
   public void N(Std140Builder var1) {
      var1.putVec3(this.value);
   }

   @Override
   public class00051 N() {
      return class00051.field_60139;
   }
}
