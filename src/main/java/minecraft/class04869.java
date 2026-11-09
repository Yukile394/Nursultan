package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class class04869 extends class05248 {
   public static final MapCodec<class04869> N = MapCodec.unit(() -> class04869.y);
   public static final class04869 y = new class04869();

   private class04869() {
      super(class05246.field_16686);
   }

   @Override
   public String toString() {
      return "Empty";
   }

   @Override
   public class05267<?> N() {
      return class05267.u;
   }

   @Override
   public boolean N(
      class01224 var1,
      class05974 var2,
      class05324 var3,
      class08088 var4,
      class07209 var5,
      class07209 var6,
      class06993 var7,
      class05163 var8,
      class06069 var9,
      class02610 var10,
      boolean var11
   ) {
      return true;
   }

   @Override
   public class00753 N(class01224 var1, class06993 var2) {
      return class00753.field_11176;
   }

   @Override
   public class05163 N(class01224 var1, class07209 var2, class06993 var3) {
      throw new IllegalStateException("Invalid call to EmptyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public List<class01203> N(class01224 var1, class07209 var2, class06993 var3, class06069 var4) {
      return Collections.emptyList();
   }
}
