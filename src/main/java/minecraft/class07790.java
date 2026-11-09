package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record class07790(int startX, int startY, int width, int height, byte[] mapColors) {
   public static final class02362<ByteBuf, Optional<class07790>> N = class02362.N(class07790::N, class07790::N);

   public int L() {
      return this.width;
   }

   public class07790(int startX, int startY, int width, int height, byte[] mapColors) {
      super();
      this.startX = startX;
      this.startY = startY;
      this.width = width;
      this.height = height;
      this.mapColors = mapColors;
   }

   public byte[] i() {
      return this.mapColors;
   }

   public int u() {
      return this.height;
   }

   public int y() {
      return this.startY;
   }

   public void N(class07769 var1) {
      for (int i = 0; i < this.width; i++) {
         for (int j = 0; j < this.height; j++) {
            var1.y(this.startX + i, this.startY + j, this.mapColors[i + j * this.width]);
         }
      }
   }

   private static Optional<class07790> N(ByteBuf var0) {
      short short1 = var0.readUnsignedByte();
      if (short1 > 0) {
         short short2 = var0.readUnsignedByte();
         short short3 = var0.readUnsignedByte();
         short short4 = var0.readUnsignedByte();
         byte[] abyte = class00667.N(var0);
         return Optional.of(new class07790(short3, short4, short1, short2, abyte));
      } else {
         return Optional.empty();
      }
   }

   public int N() {
      return this.startX;
   }

   private static void N(ByteBuf var0, Optional<class07790> var1) {
      if (var1.isPresent()) {
         class07790 class07790 = var1.get();
         var0.writeByte(class07790.width);
         var0.writeByte(class07790.height);
         var0.writeByte(class07790.startX);
         var0.writeByte(class07790.startY);
         class00667.N(var0, class07790.mapColors);
      } else {
         var0.writeByte(0);
      }
   }
}
