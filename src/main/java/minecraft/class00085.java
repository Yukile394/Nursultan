package minecraft;

import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;
import org.joml.Matrix4fc;

public record class00085(Matrix4fc value) implements class00069 {
   public static final Codec<class00085> y = class06338.U.xmap(class00085::new, class00085::y);

   public class00085(Matrix4fc value) {
      super();
      this.value = value;
   }

   public Matrix4fc y() {
      return this.value;
   }

   @Override
   public void N(Std140SizeCalculator var1) {
      var1.putMat4f();
   }

   @Override
   public void N(Std140Builder var1) {
      var1.putMat4f(this.value);
   }

   @Override
   public class00051 N() {
      return class00051.field_60141;
   }
}
