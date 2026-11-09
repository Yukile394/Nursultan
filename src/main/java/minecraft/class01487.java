package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import com.mojang.util.UndashedUuid;
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
import java.util.stream.IntStream;

public final class class01487 {
   public static final Codec<UUID> N = Codec.INT_STREAM.comapFlatMap(var0 -> class07536.N(var0, 4).map(class01487::N), var0 -> Arrays.stream(N(var0)));
   public static final Codec<Set<UUID>> y = Codec.list(N).xmap(Sets::newHashSet, Lists::newArrayList);
   public static final Codec<Set<UUID>> L = Codec.list(N).xmap(Sets::newLinkedHashSet, Lists::newArrayList);
   public static final Codec<UUID> u = Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(UUID.fromString(var0), Lifecycle.stable());
      } catch (IllegalArgumentException illegalargumentexception) {
         return DataResult.error(() -> "Invalid UUID " + var0 + ": " + illegalargumentexception.getMessage());
      }
   }, UUID::toString);
   public static final Codec<UUID> i = Codec.withAlternative(Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(UndashedUuid.fromStringLenient(var0), Lifecycle.stable());
      } catch (IllegalArgumentException illegalargumentexception) {
         return DataResult.error(() -> "Invalid UUID " + var0 + ": " + illegalargumentexception.getMessage());
      }
   }, UndashedUuid::toString), N);
   public static final Codec<UUID> R = Codec.withAlternative(N, u);
   public static final class02362<ByteBuf, UUID> M = new class01516();
   public static final int B = 16;
   private static final String Z = "OfflinePlayer:";

   private class01487() {
      super();
   }

   public static GameProfile y(String var0) {
      UUID uuid = N(var0);
      return new GameProfile(uuid, var0);
   }

   public static byte[] y(UUID var0) {
      byte[] abyte = new byte[16];
      ByteBuffer.wrap(abyte).order(ByteOrder.BIG_ENDIAN).putLong(var0.getMostSignificantBits()).putLong(var0.getLeastSignificantBits());
      return abyte;
   }

   private static int[] N(long var0, long var2) {
      return new int[]{(int)(var0 >> 32), (int)var0, (int)(var2 >> 32), (int)var2};
   }

   public static UUID N(int[] var0) {
      return new UUID((long)var0[0] << 32 | var0[1] & 4294967295L, (long)var0[2] << 32 | var0[3] & 4294967295L);
   }

   public static UUID N(Dynamic<?> var0) {
      int[] aint = var0.asIntStream().toArray();
      if (aint.length != 4) {
         throw new IllegalArgumentException("Could not read UUID. Expected int-array of length 4, got " + aint.length + ".");
      } else {
         return N(aint);
      }
   }

   public static UUID N(String var0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   public static int[] N(UUID var0) {
      long ix = var0.getMostSignificantBits();
      long j = var0.getLeastSignificantBits();
      return N(ix, j);
   }
}
