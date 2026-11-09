package minecraft;

import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;
import org.joml.Vector2fc;

public record class00078(Vector2fc value) implements class00069 {
   public static final Codec<class00078> y = class06338.u.xmap(class00078::new, class00078::y);

   public class00078(Vector2fc value) {
      super();
      this.value = value;
   }

   public Vector2fc y() {
      return this.value;
   }

   @Override
   public void N(Std140SizeCalculator var1) {
      var1.putVec2();
   }

   @Override
   public void N(Std140Builder var1) {
      var1.putVec2(this.value);
   }

   @Override
   public class00051 N() {
      return class00051.field_60138;
   }
}
