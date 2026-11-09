package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.List;

public record class04306<T>(T type, class07209 pos, int delay, class00763 priority) {
   public static final Strategy<class04306<?>> N = new class04332();

   public int L() {
      return this.delay;
   }

   public class04306(T type, class07209 pos, int delay, class00763 priority) {
      super();
      this.type = (T)type;
      this.pos = pos;
      this.delay = delay;
      this.priority = priority;
   }

   public class00763 u() {
      return this.priority;
   }

   public class07209 y() {
      return this.pos;
   }

   public T N() {
      return this.type;
   }

   public static <T> class04306<T> N(T var0, class07209 var1) {
      return new class04306<>((T)var0, var1, 0, class00763.field_9314);
   }

   public static <T> List<class04306<T>> N(List<class04306<T>> var0, class07321 var1) {
      long i = var1.y();
      return var0.stream().filter(var2x -> class07321.N(var2x.y()) == i).toList();
   }

   public class04309<T> N(long var1, long var3) {
      return new class04309<>(this.type, this.pos, var1 + this.delay, this.priority, var3);
   }

   public static <T> Codec<class04306<T>> N(Codec<T> var0) {
      MapCodec mapcodec = RecordCodecBuilder.mapCodec(
         var0x -> var0x.group(
               Codec.INT.fieldOf("x").forGetter(class00753::method_10263),
               Codec.INT.fieldOf("y").forGetter(class00753::method_10264),
               Codec.INT.fieldOf("z").forGetter(class00753::method_10260)
            )
            .apply(var0x, class07209::new)
      );
      return RecordCodecBuilder.create(
         var2 -> var2.group(
               var0.fieldOf("i").forGetter(class04306::N),
               mapcodec.forGetter(class04306::y),
               Codec.INT.fieldOf("t").forGetter(class04306::L),
               class00763.field_56697.fieldOf("p").forGetter(class04306::u)
            )
            .apply(var2, class04306::new)
      );
   }
}
