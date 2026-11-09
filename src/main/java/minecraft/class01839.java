package minecraft;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class class01839 {
   private static final class02362<ByteBuf, Map<class07830, long[]>> N = class02389.N(
      var0 -> new EnumMap<>(class07830.class), class07830.field_56679, class02389.P
   );
   private static final int y = 2097152;
   private final Map<class07830, long[]> L;
   private final byte[] u;
   private final List<class01810> i;

   private ByteBuf L() {
      ByteBuf bytebuf = Unpooled.wrappedBuffer(this.u);
      bytebuf.writerIndex(0);
      return bytebuf;
   }

   public class01839(class00570 var1) {
      super();
      this.L = var1.i().stream().filter(var0 -> var0.getKey().y()).collect(Collectors.toMap(Entry::getKey, var0 -> (long[])var0.getValue().N().clone()));
      this.u = new byte[N(var1)];
      N(new class00667(this.L()), var1);
      this.i = Lists.newArrayList();

      for (Entry entry : var1.o().entrySet()) {
         this.i.add(class01810.N((class00394)entry.getValue()));
      }
   }

   public class01839(class04247 var1, int var2, int var3) {
      super();
      this.L = N.decode(var1);
      int ix = var1.E();
      if (ix > 2097152) {
         throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
      } else {
         this.u = new byte[ix];
         var1.readBytes(this.u);
         this.i = class01810.y.decode(var1);
      }
   }

   public Map<class07830, long[]> y() {
      return this.L;
   }

   private void N(class01806 var1, int var2, int var3) {
      int ix = 16 * var2;
      int j = 16 * var3;
      class07218 class07218 = new class07218();

      for (class01810 class01810 : this.i) {
         int k = ix + class01296.y(class01810.L >> 4);
         int l = j + class01296.y(class01810.L);
         class07218.N(k, class01810.u, l);
         var1.accept(class07218, class01810.i, class01810.R);
      }
   }

   public static void N(class00667 var0, class00570 var1) {
      class00554[] aclass00554 = var1.u();
      int ix = aclass00554.length;

      for (int j = 0; j < ix; j++) {
         aclass00554[j].L(var0);
      }

      if (var0.writerIndex() != var0.capacity()) {
         throw new IllegalStateException("Didn't fill chunk buffer: expected " + var0.capacity() + " bytes, got " + var0.writerIndex());
      }
   }

   public Consumer<class01806> N(int var1, int var2) {
      return var3 -> this.N(var3, var1, var2);
   }

   public void N(class04247 var1) {
      N.encode(var1, this.L);
      var1.L(this.u.length);
      var1.writeBytes(this.u);
      class01810.y.encode(var1, this.i);
   }

   public class00667 N() {
      return new class00667(Unpooled.wrappedBuffer(this.u));
   }

   private static int N(class00570 var0) {
      int ix = 0;

      for (class00554 class00554 : var0.u()) {
         ix += class00554.z();
      }

      return ix;
   }
}
