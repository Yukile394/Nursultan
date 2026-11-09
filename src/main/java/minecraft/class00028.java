package minecraft;

import Nursultan.class09109;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class class00028 {
   public static final Codec<class00028> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class05946.N(class00058.N).fieldOf("style").forGetter(var0x -> var0x.u), class06338.E.optionalFieldOf("color").forGetter(var0x -> var0x.i)
         )
         .apply(var0, class00028::new)
   );
   public static final class02362<ByteBuf, class00028> y = class02362.N(
      class05946.y(class00058.N), var0 -> var0.u, class02389.N(class02389.Y), var0 -> var0.i, class00028::new
   );
   public static final class00028 L = new class00028();
   public class05946<class09109> u = class00058.y;
   public Optional<Integer> i = Optional.empty();

   public class00028() {
      super();
   }

   private class00028(class05946<class09109> var1, Optional<Integer> var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   private class05946<class09109> y() {
      return this.u != class00058.y ? this.u : class00058.y;
   }

   public class00028 N(class07438 var1) {
      class05946<class09109> class05946 = this.y();
      Optional<Integer> optional = this.i
         .or(() -> Optional.ofNullable(var1.method_5781()).map(var0x -> var0x.P().i()).map(var0x -> var0x == 0 ? -13619152 : var0x));
      return class05946 == this.u && optional.isEmpty() ? this : new class00028(class05946, optional);
   }

   public void N(class00028 var1) {
      this.i = var1.i;
      this.u = var1.u;
   }

   public boolean N() {
      return this.u != class00058.y || this.i.isPresent();
   }
}
