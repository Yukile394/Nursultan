package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import org.slf4j.Logger;

public abstract class class00037 implements class00001 {
   static final Logger N = LogUtils.getLogger();
   public static final class02362<ByteBuf, class00037> y = class02362.N_34(class00037::N, class00037::L);
   protected final Either<UUID, String> L;
   private final class00028 u;
   private final class00025 i;

   private static class00037 L(ByteBuf var0) {
      class00667 class00667 = new class00667(var0);
      Either either = class00667.y(class01487.M, class00667::s);
      class00028 class00028 = class00028.y.decode(class00667);
      return (class00037)class00667.y(class00025.class).field_59782.apply(either, class00028, class00667);
   }

   class00037(Either<UUID, String> var1, class00028 var2, class00025 var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
   }

   public class00028 y() {
      return this.u;
   }

   public abstract void y(ByteBuf var1);

   public abstract double N(class07299 var1, class00023 var2, class00945 var3);

   public abstract class00036 N(class07299 var1, class00007 var2, class00945 var3);

   public static class00037 N(UUID var0) {
      return new class00027(var0);
   }

   public abstract double N(class07049 var1);

   public static class00037 N(UUID var0, class00028 var1, class07321 var2) {
      return new class00019(var0, var1, var2);
   }

   public void N(ByteBuf var1) {
      class00667 class00667 = new class00667(var1);
      class00667.N(this.L, class01487.M, class00667::N);
      class00028.y.encode(class00667, this.u);
      class00667.N((Enum<?>)this.i);
      this.y(var1);
   }

   public abstract void N(class00037 var1);

   public static class00037 N(UUID var0, class00028 var1, class00753 var2) {
      return new class00021(var0, var1, var2);
   }

   public Either<UUID, String> N() {
      return this.L;
   }

   public static class00037 N(UUID var0, class00028 var1, float var2) {
      return new class00010(var0, var1, var2);
   }
}
