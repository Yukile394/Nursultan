package minecraft;

import org.jspecify.annotations.Nullable;

public record class02067(class07211 cullForDirection, int tintIndex, String texture, class02052 uvs, class08511 rotation) {
   public static final int N = -1;

   public String L() {
      return this.texture;
   }

   public class02067(@Nullable class07211 cullForDirection, int tintIndex, String texture, @Nullable class02052 uvs, class08511 rotation) {
      super();
      this.cullForDirection = cullForDirection;
      this.tintIndex = tintIndex;
      this.texture = texture;
      this.uvs = uvs;
      this.rotation = rotation;
   }

   public class08511 i() {
      return this.rotation;
   }

   @Nullable
   public class02052 u() {
      return this.uvs;
   }

   public int y() {
      return this.tintIndex;
   }

   public static float y(class02052 var0, class08511 var1, int var2) {
      return var0.y(var1.y(var2)) / 16.0F;
   }

   @Nullable
   public class07211 N() {
      return this.cullForDirection;
   }

   public static float N(class02052 var0, class08511 var1, int var2) {
      return var0.N(var1.y(var2)) / 16.0F;
   }
}
