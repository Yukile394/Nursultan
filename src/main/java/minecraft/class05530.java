package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;
import net.jpountz.lz4.LZ4BlockInputStream;
import net.jpountz.lz4.LZ4BlockOutputStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05530 {
   private static final Logger M = LogUtils.getLogger();
   private static final Int2ObjectMap<class05530> B = new Int2ObjectOpenHashMap();
   private static final Object2ObjectMap<String, class05530> Z = new Object2ObjectOpenHashMap();
   public static final class05530 N = N(
      new class05530(1, null, var0 -> new class03172(new GZIPInputStream(var0)), var0 -> new BufferedOutputStream(new GZIPOutputStream(var0)))
   );
   public static final class05530 y = N(
      new class05530(2, "deflate", var0 -> new class03172(new InflaterInputStream(var0)), var0 -> new BufferedOutputStream(new DeflaterOutputStream(var0)))
   );
   public static final class05530 L = N(new class05530(3, "none", class03172::new, BufferedOutputStream::new));
   public static final class05530 u = N(
      new class05530(4, "lz4", var0 -> new class03172(new LZ4BlockInputStream(var0)), var0 -> new BufferedOutputStream(new LZ4BlockOutputStream(var0)))
   );
   public static final class05530 i = N(new class05530(127, null, var0 -> {
      throw new UnsupportedOperationException();
   }, var0 -> {
      throw new UnsupportedOperationException();
   }));
   public static final class05530 R = y;
   private static volatile class05530 z = R;
   private final int U;
   @Nullable
   private final String E;
   private final class05518<InputStream> W;
   private final class05518<OutputStream> m;

   private class05530(int var1, @Nullable String var2, class05518<InputStream> var3, class05518<OutputStream> var4) {
      super();
      this.U = var1;
      this.E = var2;
      this.W = var3;
      this.m = var4;
   }

   public static boolean y(int var0) {
      return B.containsKey(var0);
   }

   public int y() {
      return this.U;
   }

   public static class05530 N() {
      return z;
   }

   public OutputStream N(OutputStream var1) throws IOException {
      return this.m.wrap(var1);
   }

   public InputStream N(InputStream var1) throws IOException {
      return this.W.wrap(var1);
   }

   public static void N(String var0) {
      class05530 class05530 = (class05530)Z.get(var0);
      if (class05530 != null) {
         z = class05530;
      } else {
         M.error("Invalid `region-file-compression` value `{}` in server.properties. Please use one of: {}", var0, String.join(", ", Z.keySet()));
      }
   }

   @Nullable
   public static class05530 N(int var0) {
      return (class05530)B.get(var0);
   }

   private static class05530 N(class05530 var0) {
      B.put(var0.U, var0);
      if (var0.E != null) {
         Z.put(var0.E, var0);
      }

      return var0;
   }
}
