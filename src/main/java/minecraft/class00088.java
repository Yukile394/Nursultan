package minecraft;

import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;
import org.joml.Vector4fc;

public record class00088(Vector4fc value) implements class00069 {
   public static final Codec<class00088> y = class06338.M.xmap(class00088::new, class00088::y);

   public class00088(Vector4fc value) {
      super();
      this.value = value;
   }

   public Vector4fc y() {
      return this.value;
   }

   @Override
   public void N(Std140SizeCalculator var1) {
      var1.putVec4();
   }

   @Override
   public void N(Std140Builder var1) {
      var1.putVec4(this.value);
   }

   @Override
   public class00051 N() {
      return class00051.field_60140;
   }
}
